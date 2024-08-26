package homework.TwentyFive;

import javax.swing.*;
import java.awt.*;

public class Wall {
    private int x,y, width, height;

    public Wall(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void draw(Graphics g) {
        g.fillOval(x, y, 20, 20);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getxStep() {
        return width;
    }

    public void setwidth(int width) {
        this.width = width;
    }

    public int getyStep() {
        return height;
    }

    public void setyStep(int height) {
        this.height = height;
    }

    public class ObjectWall extends JFrame {

    }
}
