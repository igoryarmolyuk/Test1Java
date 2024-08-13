package homework.TwentySix;

public class BallModel {
    private int x, y, xStep, yStep;

    public BallModel(int x, int y, int xStep, int yStep) {
        this.x = x;
        this.y = y;
        this.xStep = xStep;
        this.yStep = yStep;
    }

    public void move() {
        x += xStep;
        y += yStep;
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
        return xStep;
    }

    public void setxStep(int xStep) {
        this.xStep = xStep;
    }

    public int getyStep() {
        return yStep;
    }

    public void setyStep(int yStep) {
        this.yStep = yStep;
    }

    public boolean hitsWall(int width, int height) {
        return x < 0 || x > width - 20 || y < 0 || y > height - 20;
    }
}
