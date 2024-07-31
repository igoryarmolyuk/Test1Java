package homework.TwentyTwo;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class UI extends JFrame implements KeyListener {
    private final Hero hero = new Hero();

    public UI() {
        setLayout(null);

        hero.setBounds(200, 50, hero.getWidth(), hero.getHeight());
        add(hero);

        addKeyListener(this);
        setSize(800, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setFocusable(true);
        requestFocusInWindow(); // Ensure the JFrame is focused to receive key events
    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_RIGHT:
                if (!hero.facingRight) {
                    int[] turnRightClipXs = {69}; // Adjust based on your sprite sheet
                    hero.animateTurning(turnRightClipXs, 0, 100, () -> {
                        hero.facingRight = true;
                        int[] rightClipXs = {18, 35, 53, 0}; // Adjust based on your sprite sheet
                        hero.animateMovement(10, 0, rightClipXs, 0, 100); // Moving right with animation
                    });
                } else {
                    int[] rightClipXs = {18, 35, 53, 0}; // Adjust based on your sprite sheet
                    hero.animateMovement(10, 0, rightClipXs, 0, 100); // Moving right with animation
                }
                break;
            case KeyEvent.VK_LEFT:
                if (hero.facingRight) {
                    int[] turnLeftClipXs = {69}; // Adjust based on your sprite sheet
                    hero.animateTurning(turnLeftClipXs, 0, 100, () -> {
                        hero.facingRight = false;
                        int[] leftClipXs = {18, 35, 53, 0}; // Adjust based on your sprite sheet
                        hero.animateMovement(-10, 0, leftClipXs, 0, 100); // Moving left with animation
                    });
                } else {
                    int[] leftClipXs = {18, 35, 53, 0}; // Adjust based on your sprite sheet
                    hero.animateMovement(-10, 0, leftClipXs, 0, 100); // Moving left with animation
                }
                break;
            case KeyEvent.VK_UP:
                hero.jump();
                break;
            case KeyEvent.VK_DOWN:
                hero.move1(hero.getX(), hero.getY() + 10, 107, 0); // Adjust clipX and clipY for moving down
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {}

    public static void main(String[] args) {
        new UI();
    }
}
