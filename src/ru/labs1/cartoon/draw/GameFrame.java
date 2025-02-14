package ru.labs1.cartoon.draw;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GameFrame extends JFrame {
    private GamePanel gamePanel;
    private JSpinner switchObject;
    private JSpinner switchSpeed;
    private JButton addObjectButton;
    private JButton addRandomObjectButton;

    public GameFrame() {
        setTitle("Game Panel Example");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        gamePanel = new GamePanel();
        gamePanel.setPreferredSize(new Dimension(800, 600));

        JPanel controlPanel = new JPanel();        // Панель для элементов управления
        controlPanel.setLayout(new FlowLayout());

        SpinnerModel objectModel = new SpinnerNumberModel(0, 0, 4, 1); // 0 - 4 (Bird, Car, Person, Robot, Tree)
        switchObject = new JSpinner(objectModel);

        SpinnerModel speedModel = new SpinnerNumberModel(5.0, 1.0, 10.0, 0.5); // скорость от 1 до 10
        switchSpeed = new JSpinner(speedModel);

        addObjectButton = new JButton("Add Object");
        addObjectButton.addActionListener(e -> {
            int objectType = (int) switchObject.getValue();
            double speed = (double) switchSpeed.getValue();
            gamePanel.addObject(objectType, speed);
        });

        addRandomObjectButton = new JButton("Add Random Object");
        addRandomObjectButton.addActionListener(e -> {
            gamePanel.addRandomObject();
        });

        // Добавляем элементы управления на панель
        controlPanel.add(new JLabel("Object Type:"));
        controlPanel.add(switchObject);
        controlPanel.add(new JLabel("Speed:"));
        controlPanel.add(switchSpeed);
        controlPanel.add(addObjectButton);
        controlPanel.add(addRandomObjectButton);

        // Добавляем панели в окно
        getContentPane().add(gamePanel, BorderLayout.CENTER);
        getContentPane().add(controlPanel, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new GameFrame().setVisible(true);
        });
    }
}
