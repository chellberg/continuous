package continuous;

import java.awt.Graphics;

import continuous.entity.Entity;
import continuous.gfx.GUI;
import continuous.gfx.Input;
import continuous.world.Board;

public class Game extends Thread {

	public static void main(String[] args) {
		Game game = new Game();
		game.start();
		
	}

	private static final String TITLE = "Continuous";
	
	protected Entity entity;
	protected GUI gui;
	protected Input input;
	protected Board board;
	
	public static boolean leftPressed, rightPressed, upPressed, downPressed;

	public Game()  {
		input = new Input();
		board = new Board(16, 12);
		entity = new Entity(200.0,200.0, board);
		gui = new GUI(this);
	

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
		input.tick();
		entity.tick();
		board.tick();
	
		gui.tick();
		
			}

	public GUI getFrame() {
		return gui;
	}

	public String getTitle() {
		return TITLE;
	}
	
	public Board getBoard() {
		return board;
	}

	/*public void paint(Graphics g) {
	 *entity.paint(g);
	 *}
	 */
}
