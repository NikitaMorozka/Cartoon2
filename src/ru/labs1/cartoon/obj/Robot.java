package ru.labs1.cartoon.obj;

import java.awt.*;

public class Robot extends GameObject {

    public Robot(double x, double y) {
        super(x, y);
    }

    @Override
    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.GRAY);
        g2d.fillRect((int) x + 15, (int) y, 20, 20);

        g2d.setColor(Color.DARK_GRAY);
        g2d.fillRect((int) x + 10, (int) y + 20, 30, 40);

        g2d.setColor(Color.BLACK);
        g2d.drawLine((int) x + 10, (int) y + 30, (int) x - 10, (int) y + 40); // Левая рука
        g2d.drawLine((int) x + 40, (int) y + 30, (int) x + 60, (int) y + 40); // Правая рука

        // Рисуем ноги
        g2d.setColor(Color.DARK_GRAY);
        g2d.fillRect((int) x + 15, (int) y + 60, 10, 20); // Левая нога
        g2d.fillRect((int) x + 25, (int) y + 60, 10, 20); // Правая нога

        // Рисуем глаза
        g2d.setColor(Color.RED);
        g2d.fillOval((int) x + 20, (int) y + 10, 6, 6); // Левый глаз
        g2d.fillOval((int) x + 30, (int) y + 10, 6, 6); // Правый глаз
    }
    public int getWidth() {
        return 50; // Это ширина для птицы. Можно переопределить в наследниках
    }

    public int getHeight() {
        return 50; // Это высота для птицы. Можно переопределить в наследниках
    }
}