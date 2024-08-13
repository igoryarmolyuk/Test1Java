package homework.TwentySix;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GameController {
    private List<BallModel> balls;
    private GameView view;
    private JFrame frame;

    public GameController() {
        balls = new ArrayList<>();
        view = new GameView(balls);

        frame = new JFrame("Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(view);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);

        view.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                addBall(e.getX(), e.getY());
            }
        });

        new GameThread().start();
    }

    private void addBall(int x, int y) {
        Random random = new Random();
        int xStep = random.nextInt(20) - 10;
        int yStep = random.nextInt(20) - 10;
        BallModel ball = new BallModel(x, y, xStep, yStep);
        balls.add(ball);
    }

    private void updateGame() {
        int width = view.getWidth();
        int height = view.getHeight();

        balls.forEach(ball -> {
            ball.move();
            if (ball.hitsWall(width, height)) {
                ball.setxStep(-ball.getxStep());
                ball.setyStep(-ball.getyStep());
            }
        });
        view.repaint();
    }

    class GameThread extends Thread {
        @Override
        public void run() {
            while (true) {
                updateGame();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        new GameController();
    }
}
