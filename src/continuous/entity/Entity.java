package continuous.entity;

import java.awt.Color;
import java.awt.Graphics;

public class Entity {
	private double x, y, dx, dy;

	private static final int WIDTH = 32;
	private static final int HEIGHT = 32;

	public Entity() {
		x = 0;
		y = 0;
		dx = 0;
		dy = 0;
	}

	public void paint(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect((int) x, (int) y, WIDTH, HEIGHT);
		g.drawRect((int) x, (int) y, WIDTH, HEIGHT);
	}

	public Entity(double x, double y) {
		this.x = x;
		this.y = y;
		moveTo(x, y);

	}

	// if no change, calls move with existing dx/dy
	public void move() {
		move(dx, dy);
	}

	public void move(double dx, double dy) {

		// if entity is at rest, start accelerating
		if (this.dx == 0 && this.dy == 0) {
			this.dx = dx;
			this.dy = dy;
		} 
		// otherwise call moveTo with new velocity
		else {
			moveTo(x + dx, y + dy);
		}
	}
	
	public void moveTo(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public void tick() {
		move(0,1); //simulating gravity
	}

}

	