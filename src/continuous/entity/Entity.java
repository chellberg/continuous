package continuous.entity;

import java.awt.Color;
import java.awt.Graphics;

public class Entity {
	private double x;
	private double y;
	private static final int WIDTH = 32;
	private static final int HEIGHT = 32;
		
	public Entity() {
		x = 0;
		y = 0;
	}

	public void paint(Graphics g) {
		g.setColor(Color.RED);
		g.drawRect((int)x, (int)y, WIDTH, HEIGHT);
	}
	
	public Entity(double x, double y) {
		this.x = x;
		this.y = y;
		
	}
}