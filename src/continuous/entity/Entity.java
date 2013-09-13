package continuous.entity;

import continuous.Game;
import continuous.world.Board;
import continuous.world.Tile;

import java.awt.Color;
import java.awt.Graphics;

public class Entity {
	private double x, y, dx, dy;
	Board board;
	Tile tile;
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

	public Entity(double x, double y, Board b) {
		this.x = x;
		this.y = y;
		board = b;
		moveTo(x, y);

	}

	// if no change, calls move with existing dx/dy
	public void move() {
		move(dx, dy);
	}

	public void move(double dx, double dy) {

		// if entity is at rest, start accelerating
		if (this.dx == 0 && this.dy == 0) {
			this.x = dx;
			this.y = dy;
		} else { // otherwise call moveTo with new velocity // removed else here
			moveTo(this.x + dx, this.y + dy);
		}

	}

	public void moveTo(double x, double y) {
		this.x = x;
		this.y = y;
		
		
		Tile t = board.getTileAt((int) x, (int) y);

		// leave old tile if present
		if (tile != null) {
			tile.removeEntity(this);
		}

		// join the new tile
		tile = t;
		tile.addEntity(this);

	}

	public void tick() {
		update();
	}

	public void update() {
		if (Game.leftPressed == true) {
			dx += -.03;
		}
		if (Game.rightPressed == true) {
			dx += .03;
		}
		if (Game.upPressed == true) {
			dy += -.03;
		}
		if (Game.downPressed == true) {
			dy += .03;
		}
		/*
		 * if (Game.upPressed == false) { // simulating gravity dy += .01;
		 * 
		 * }
		 */
		move(dx, dy);
	}

}
