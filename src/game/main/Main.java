/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game.main;

import game.component.PanelGame;
import java.awt.BorderLayout;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author anand
 */
/**
 * This file is part of MyGameApp.
 * 
 * MIT License
 * Copyright (c) 2025 Anand
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction...
 */

public class Main extends JFrame {

    public Main() {

        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/game/image/plane.png")));
        setTitle("2D game");
        setSize(1366, 768);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        
        PanelGame panelgame = new PanelGame();
        add(panelgame);
        setVisible(true);
        panelgame.start();

        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                panelgame.stopGame();
            }
        });
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.setVisible(true);
    }
    
}
