package continuous.gfx;
import continuous.Game;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class Input extends KeyAdapter {

	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			Game.leftPressed = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			Game.rightPressed = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			Game.upPressed = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			Game.downPressed = true;
		}
	}
	
	public void keyReleased(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			Game.leftPressed = false;
			}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			Game.rightPressed = false;
			}
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			Game.upPressed = false;
			}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			Game.downPressed = false;
			}
		}
		
	public void keyTyped(KeyEvent e) {
		if (e.getKeyChar() == 27) {
			System.exit(0);
			}
		}
		
	public void tick() {
		
		}	
}