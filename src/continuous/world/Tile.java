package continuous.world;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import continuous.entity.Entity;

public class Tile {
	int x, y;
	final static int SIZE = 50;
	ArrayList<Entity> entities = new ArrayList<Entity>();
	
	public Tile(int x, int y) {
		this.x = x * Tile.SIZE;
		this.y = y * Tile.SIZE;
}
	
	public void addEntity(Entity entity) {
		entities.add(entity);
	}
	
	public void tick() {
		for (int i = 0; i < entities.size(); i++) {
			entities.get(i).tick();
		}
	}
	
	public void removeEntity(Entity entity) {
		entities.remove(entity);
	}
	
	public List<Entity> getEntities() {
		return entities;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void paint(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(x, y, Tile.SIZE, Tile.SIZE);
		
		g.setColor(Color.WHITE);
		g.drawRect(x,  y,  Tile.SIZE,  Tile.SIZE);
		
	}
}