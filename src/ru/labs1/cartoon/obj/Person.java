package ru.labs1.cartoon.obj;

import java.awt.*;

public class Person extends GameObject {
    public Person(double x, double y) {
        super(x, y);
    }

    @Override
    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(new Color(255, 218, 185));
        g2d.fillOval((int) x + 15, (int) y, 20, 20);
        g2d.setColor(Color.BLUE);
        g2d.fillRect((int) x + 10, (int) y + 20, 20, 30);
        g2d.setColor(Color.BLACK);
        g2d.drawLine((int) x + 10, (int) y + 20, (int) x, (int) y + 40); // Левая рука
        g2d.drawLine((int) x + 30, (int) y + 20, (int) x + 50, (int) y + 40); // Правая рука
        g2d.drawLine((int) x + 15, (int) y + 50, (int) x + 10, (int) y + 70); // Левая нога
        g2d.drawLine((int) x + 25, (int) y + 50, (int) x + 30, (int) y + 70); // Правая нога
    }
    public int getWidth() {
        return 50;
    }
    public int getHeight() {
        return 50;
    }
}