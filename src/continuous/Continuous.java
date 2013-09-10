package continuous;

import java.awt.Canvas;
import java.awt.Graphics;

import javax.swing.JFrame;

public class Continuous extends Canvas {
    public static void main(String[] args) {
        new Frame(new Canvas()).render();
    }
    
    public void paint(Graphics g) {
        
    }
}

@SuppressWarnings("serial")
class Frame extends JFrame {
    Canvas canvas;
    
    public Frame(Canvas canvas) {
        this.canvas = canvas;
    }
    
    public void render() {
        Graphics g = canvas.getGraphics();
        canvas.paint(g);
    }
}
