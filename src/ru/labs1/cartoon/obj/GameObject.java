package ru.labs1.cartoon.obj;

import javax.swing.*;
import java.awt.*;

public abstract class GameObject {
    protected double x, y;
    protected double dx, dy;

    public GameObject(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public abstract void draw(Graphics g);

    public void update() {
        x += dx;
        y += dy;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getDx() {
        return dx;
    }

    public double getDy() {
        return dy;
    }

    public void setDx(double dx) {
        this.dx = dx;
    }

    public void setDy(double dy) {
        this.dy = dy;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;

    }

    public int getWidth() {
        return 20; // Это ширина для птицы. Можно переопределить в наследниках
    }

    public int getHeight() {
        return 10; // Это высота для птицы. Можно переопределить в наследниках
    }
}