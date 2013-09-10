package continuous.gfx;

import java.awt.Graphics;

import javax.swing.JFrame;

import continuous.Continuous;
import continuous.Game;


public class GUI  {
    Continuous continuous;
	Game game;
    
	JFrame f = new JFrame("test");
	
    public GUI(Game g) {
        this.game = g;
        continuous = new Continuous(game.getFrame());
        f.setContentPane(continuous);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
       
        f.setResizable(false);
        f.setVisible(true);
    }
    
    public void render() {
        Graphics g = continuous.getGraphics();
        continuous.paint(g);
        f.setVisible(true);
        
    }
    
    public void tick() {
    	f.repaint();
    	
    }
}

