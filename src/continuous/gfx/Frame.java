package continuous.gfx;

import java.awt.Graphics;

import javax.swing.JFrame;

import continuous.Continuous;

public class Frame extends JFrame {
    Continuous continuous;
    
    public Frame(Continuous continuous) {
        this.continuous = continuous;
        this.setContentPane(continuous);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
    }
    
    public void render() {
        Graphics g = continuous.getGraphics();
        continuous.paint(g);
        this.setVisible(true);
    }
}