package ru.labs1.cartoon.obj;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class Car extends GameObject {
    public Car(double x, double y) {
        super(x, y);
    }

    @Override
    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;        // Преобразуем в Graphics2D для работы с графическими примитивами

        g2d.setColor(Color.BLUE);
        g2d.fill(new Rectangle2D.Double(x, y, 50, 20));

        g2d.setColor(Color.BLUE);
        g2d.fill(new Rectangle2D.Double(x + 10, y - 10, 30, 10));

        g2d.setColor(Color.BLACK);
        g2d.fill(new Ellipse2D.Double(x + 10, y + 20, 10, 10));

        g2d.fill(new Ellipse2D.Double(x + 40, y + 20, 10, 10));
    }

    public int getWidth() {
        return 50;
    }

    public int getHeight() {
        return 50;
    }
}