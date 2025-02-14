package ru.labs1.cartoon.draw;
import ru.labs1.cartoon.obj.*;
import ru.labs1.cartoon.obj.Robot;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class GamePanel extends JPanel {
    private List<GameObject> objects = new ArrayList<>();
    private Random random = new Random();

    public GamePanel() {
        setDoubleBuffered(false);
        Timer timer = new Timer(16, e -> moveObjects()); // Обновление каждые 16 мс
        timer.start();
    }

    public void addObject(int objectType, double speed) {
        GameObject newObject = switchObjects(objectType);
        if (!objects.contains(newObject)) {
            objects.add(newObject);
            newObject.setDx(speed);
            newObject.setDy(speed);
            newObject.setX(random.nextInt(250));
            newObject.setY(random.nextInt(400));
        }
    }
    public void addRandomObject() {
        int randomType = random.nextInt(5);
        double randomSpeed = random.nextDouble() * 5 + 1;
        addObject(randomType, randomSpeed);
    }
    private GameObject switchObjects(int value) {
        return switch (value) {
            case 0 -> new Bird(random.nextInt(250), random.nextInt(400));
            case 1 -> new Car(random.nextInt(250), random.nextInt(400));
            case 2 -> new Person(random.nextInt(250), random.nextInt(400));
            case 3 -> new Robot(random.nextInt(250), random.nextInt(400));
            case 4 -> new Tree(random.nextInt(250), random.nextInt(400));
            default -> new Bird(random.nextInt(250), random.nextInt(400));
        };
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (GameObject obj : objects) {
            obj.draw(g); // Рисуем все объекты
        }
    }

    private void moveObjects() {
        for (GameObject obj : new ArrayList<>(objects)) {
            double dx = obj.getDx();//вектор движения
            double dy = obj.getDy();
            double newX = obj.getX() + dx;//координаты
            double newY = obj.getY() + dy;

            // Проверка на столкновение с границами
            if (newX <= 0 || newX >= getWidth() - obj.getWidth()) dx = -dx;
            if (newY <= 0 || newY >= getHeight() - obj.getHeight()) dy = -dy;

            // Обновляем скорость
            obj.setDx(dx);
            obj.setDy(dy);
            obj.setX(newX);
            obj.setY(newY);
        }

        repaint();
    }
}