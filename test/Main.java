package test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;
import java.util.List;

public class Main extends JFrame {

    private final List<Shape> shapes = new ArrayList<>();
    private Shape currentShape = null;
    private String currentAction = "LINE"; // Default action is LINE

    @SuppressWarnings("unused damn it works!!!")
    public Main() {
        setTitle("Simple Paint");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        DrawingPanel drawingPanel = new DrawingPanel();
        add(drawingPanel, BorderLayout.CENTER);

        JPanel controlPanel = new JPanel();
        JButton lineButton = new JButton("Line");
        JButton rectButton = new JButton("Rectangle");
        JButton circleButton = new JButton("Circle");
        JButton brushButton = new JButton("Brush");
        
        lineButton.addActionListener(e -> currentAction = "LINE");
        rectButton.addActionListener(e -> currentAction = "RECTANGLE");
        circleButton.addActionListener(e -> currentAction = "CIRCLE");
        brushButton.addActionListener(e -> currentAction = "BRUSH");

        controlPanel.add(lineButton);
        controlPanel.add(rectButton);
        controlPanel.add(circleButton);
        controlPanel.add(brushButton);

        add(controlPanel, BorderLayout.NORTH);

        setVisible(true);
    }

    private class DrawingPanel extends JPanel {
        public DrawingPanel() {
            addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    switch (currentAction) {
                        case "LINE":
                            currentShape = new Line(e.getX(), e.getY(), e.getX(), e.getY());
                            break;
                        case "RECTANGLE":
                            currentShape = new MyRectangle(e.getX(), e.getY(), 0, 0);
                            break;
                        case "CIRCLE":
                            currentShape = new Circle(e.getX(), e.getY(), 0);
                            break;
                        case "BRUSH":
                            currentShape = new Brush(e.getX(), e.getY());
                            break;
                    }
                    shapes.add(currentShape);
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                    currentShape = null;
                }
            });

            addMouseMotionListener(new MouseMotionAdapter() {
                @Override
                public void mouseDragged(MouseEvent e) {
                    if (currentShape != null) {
                        switch (currentAction) {
                            case "LINE":
                                Line line = (Line) currentShape;
                                line.setX2(e.getX());
                                line.setY2(e.getY());
                                break;
                            case "RECTANGLE":
                                MyRectangle rect = (MyRectangle) currentShape;
                                rect.setWidth(e.getX() - rect.getX());
                                rect.setHeight(e.getY() - rect.getY());
                                break;
                            case "CIRCLE":
                                Circle circle = (Circle) currentShape;
                                circle.setRadius((int) Math.hypot(e.getX() - circle.x, e.getY() - circle.y));
                                break;
                            case "BRUSH":
                                Brush brush = (Brush) currentShape;
                                brush.addPoint(e.getX(), e.getY());
                                break;
                        }
                        repaint();
                    }
                }
            });
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            for (Shape shape : shapes) {
                shape.draw(g);
            }
        }
    }

    abstract static class Shape {
        int x, y;

        public Shape(int x, int y) {
            this.x = x;
            this.y = y;
        }

        abstract void draw(Graphics g);
    }

    static class Line extends Shape {
        private int x2, y2;

        public Line(int x, int y, int x2, int y2) {
            super(x, y);
            this.x2 = x2;
            this.y2 = y2;
        }

        public void setX2(int x2) {
            this.x2 = x2;
        }

        public void setY2(int y2) {
            this.y2 = y2;
        }

        @Override
        void draw(Graphics g) {
            g.drawLine(x, y, x2, y2);
        }
    }

    static class MyRectangle extends Shape {
        private int width, height;

        public MyRectangle(int x, int y, int width, int height) {
            super(x, y);
            this.width = width;
            this.height = height;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public void setWidth(int width) {
            this.width = width;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        @Override
        void draw(Graphics g) {
            g.drawRect(x, y, width, height);
        }
    }

    static class Circle extends Shape {
        private int radius;

        public Circle(int x, int y, int radius) {
            super(x, y);
            this.radius = radius;
        }

        public void setRadius(int radius) {
            this.radius = radius;
        }

        @Override
        void draw(Graphics g) {
            g.drawOval(x - radius, y - radius, radius * 2, radius * 2);
        }
    }

    static class Brush extends Shape {
        private final List<Point> points = new ArrayList<>();

        public Brush(int x, int y) {
            super(x, y);
            points.add(new Point(x, y));
        }

        public void addPoint(int x, int y) {
            points.add(new Point(x, y));
        }

        @Override
        void draw(Graphics g) {
            for (Point point : points) {
                g.fillOval(point.x, point.y, 5, 5); // Draw a small circle for each point
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Main::new);
    }
}
