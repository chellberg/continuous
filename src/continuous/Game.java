package continuous;

import continuous.entity.Entity;
import continuous.gfx.GUI;

public class Game extends Thread {
	protected Entity entity;
	protected GUI gui;

	
	public Game() {
		entity = new Entity();
		gui =  new GUI(this);
		
	}

	public void run() {
		while (true) {
			tick();

			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void tick() {
		entity.tick();
		gui.tick();
	}
	
	public GUI getFrame() {
		return gui;
	}
	
	public static void main(String[] args) {
	
		Game game = new Game();
		game.start(); 
	}
}