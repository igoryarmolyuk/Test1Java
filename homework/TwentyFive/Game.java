package homework.TwentyFive;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Random;


public class Game extends JFrame implements MouseListener {
    private ArrayList<Ball> balls = new ArrayList<>();

    public Game() {
        setTitle("Game");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        addMouseListener(this);
        new GameThread().start();

    }


    @Override
    public void paint(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, getWidth(), getHeight());
        g.setColor(Color.RED);
        Boundarywall();
        balls.forEach(ball -> ball.draw(g));

    }

    private void Boundarywall() {
        int x = 0, y = 0, width = getWidth(), height = getHeight();
        balls.forEach(ball -> {
            if (ball.getX() < x || ball.getX() > width - 20 || ball.getY() < y || ball.getY() > height - 20) {
                ball.setxStep(-ball.getxStep());
                ball.setyStep(-ball.getyStep());
            }
        });
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        Random random = new Random();
        int xStep = random.nextInt(20) - 10;
        int yStep = random.nextInt(20) - 10;
        Ball ball = new Ball(x, y, xStep, yStep);
        balls.add(ball);
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    class GameThread extends Thread {
        @Override
        public void run() {
            while (true) {
                repaint();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }


}
