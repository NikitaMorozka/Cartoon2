package ru.labs1.cartoon.obj;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Path2D;

public class Bird extends GameObject {

    public Bird(double x, double y) {
        super(x, y);
    }

    @Override
    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.RED);
        g2d.fill(new Ellipse2D.Double(x, y, 20, 10));
        g2d.setColor(Color.ORANGE);
        g2d.fill(new Ellipse2D.Double(x + 15, y - 10, 8, 8));
        g2d.setColor(Color.YELLOW);
        Path2D.Double beak = new Path2D.Double();
        beak.moveTo(x + 22, y - 10); // Вершина треугольника
        beak.lineTo(x + 30, y - 5);
        beak.lineTo(x + 18, y - 2);
        beak.closePath();
        g2d.fill(beak);
    }

}