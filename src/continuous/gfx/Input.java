package continuous.gfx;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Input extends KeyAdapter {
    
    public boolean leftPressed, rightPressed, upPressed, downPressed;
    double[] delta = new double[2];
    
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            leftPressed = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            rightPressed = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            upPressed = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            downPressed = true;
        }
    }
    
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            leftPressed = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            rightPressed = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            upPressed = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            downPressed = false;
        }
    }
    
    public double[] getDelta() {
    	delta[0] = 0;
    	delta[1] = 0;
    	
    	if (leftPressed) {
    		delta[0] += -0.3;
    	}
    	if (rightPressed) {
    		delta[0] += 0.3;
    	}
    	if (upPressed) {
    		delta[1] += -0.3;
    	}
    	if (downPressed) {
    		delta[1] += 0.3;
    	}
    	
    	return delta;
    	
       }
    
    public void keyTyped(KeyEvent e) {
        if (e.getKeyChar() == 27) {
            System.exit(0);
        }
    }
}