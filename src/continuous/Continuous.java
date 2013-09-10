package continuous;

import java.awt.Dimension;
import java.awt.Graphics;

import continuous.entity.Entity;
import continuous.gfx.GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Continuous extends JPanel {
	
	public static final int HEIGHT = 600;
	public static final int WIDTH = 800;
	private Entity entity = new Entity();
	
	GUI gui;

/*	public static void main(String[] args) {
		new Frame(new Continuous()).render();
		Game game = new Game();
		game.start();
	} */

	public void paint(Graphics g) {
		entity.paint(g);
		
	}

	public Dimension getPreferredSize() {
		return new Dimension(WIDTH, HEIGHT);
	}
	
	public Continuous(GUI f) {
		this.gui = f;
	}

}
