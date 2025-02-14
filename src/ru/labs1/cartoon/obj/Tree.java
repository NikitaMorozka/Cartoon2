package ru.labs1.cartoon.obj;

import java.awt.*;

public class Tree extends GameObject {

    public Tree(double x, double y) {
        super(x, y);
    }

    @Override
    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(new Color(139, 69, 19));
        g2d.fillRect((int) x + 15, (int) y + 30, 20, 40);
        g2d.setColor(new Color(34, 139, 34));
        g2d.fillOval((int) x, (int) y + 10, 50, 50); 
    }
    public int getWidth() {
        return 50;
    }

    public int getHeight() {
        return 50;
    }
}