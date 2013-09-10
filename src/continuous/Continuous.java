package continuous;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Continuous extends JPanel {
    public static void main(String[] args) {
        new Frame(new Continuous()).render();
    }
    
    public void paint(Graphics g) {
        
    }
}

@SuppressWarnings("serial")
class Frame extends JFrame {
    Continuous continuous;
    
    public Frame(Continuous continuous) {
        this.continuous = continuous;
        this.setContentPane(continuous);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void render() {
        Graphics g = continuous.getGraphics();
        continuous.paint(g);
        this.setVisible(true);
    }
}
