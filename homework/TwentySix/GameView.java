package homework.TwentySix;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class GameView extends JPanel {
    private List<BallModel> balls;

    public GameView(List<BallModel> balls) {
        this.balls = balls;
        setPreferredSize(new Dimension(800, 600));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, getWidth(), getHeight());

        g.setColor(Color.RED);
        balls.forEach(ball -> drawBall(g, ball));
    }

    private void drawBall(Graphics g, BallModel ball) {
        g.fillOval(ball.getX(), ball.getY(), 20, 20);
    }
}
