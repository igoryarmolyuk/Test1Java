package homework.TwentyTwo;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Hero extends JLabel {
    int w = 50;
    int h = 50;
    private final Image originalImage;
    int clipX = 0; // X coordinate of the clipped area
    int clipY = 0; // Y coordinate of the clipped area
    int clipWidth = 18; // Width of the clipped area
    int clipHeight = 23; // Height of the clipped area
    boolean facingRight = true; // Direction the hero is facing

    public Hero() {
        try {
            originalImage = ImageIO.read(new File("homework/TwentyTwo/images1.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        setSize(w, h);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();

        if (!facingRight) {
            g2d.scale(-1, 1);
            g2d.translate(-w, 0);
        }

        g2d.drawImage(originalImage, 0, 0, w, h, clipX, clipY, clipX + clipWidth, clipY + clipHeight, this);
        g2d.dispose();
    }

    public void move1(int x, int y, int clipX, int clipY) {
        this.clipX = clipX;
        this.clipY = clipY;
        setBounds(x, y, w, h);
        repaint(); // Call repaint to update the image
    }

    public void animateMovement(int x, int y, int[] clipXs, int clipY, int delay) {
        new Thread(() -> {
            for (int clipX : clipXs) {
                move1(getX() + x, getY() + y, clipX, clipY);
                try {
                    Thread.sleep(delay);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();
    }

    public void animateTurning(int[] clipXs, int clipY, int delay, Runnable afterTurn) {
        new Thread(() -> {
            for (int clipX : clipXs) {
                move1(getX(), getY(), clipX, clipY);
                try {
                    Thread.sleep(delay);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            if (afterTurn != null) {
                afterTurn.run();
            }
        }).start();
    }

    public void animateJump(int[] xOffsets, int[] yOffsets, int[] clipXs, int clipY, int delay) {
        new Thread(() -> {
            for (int i = 0; i < xOffsets.length; i++) {
                move1(getX() + xOffsets[i], getY() - yOffsets[i], clipXs[i], clipY);
                try {
                    Thread.sleep(delay);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();
    }

    public void jump() {
        int[] xJump = new int[9];
        int[] yJump = {2, 12, 15, -1, -3, -7, -15, -3, -1};
        int[] jumpClipXs = new int[9]; // Adjust based on your sprite sheet
        Arrays.fill(jumpClipXs, 85);
        jumpClipXs[jumpClipXs.length - 1] = 0;
        animateJump(xJump, yJump, jumpClipXs, 0, 100);
    }
}
