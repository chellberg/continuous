package continuous.gfx;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;
import javax.swing.JTextField;

import continuous.Game;
import continuous.world.Board;

public class GameView extends JPanel {
    
    public static final int HEIGHT = 600;
    public static final int WIDTH = 800;
    
    private Game game; // no longer final to accomodate setBoard method
   
    
    public GameView(Game game) {
        this.game = game;
        addKeyListener(new Input()
        );
    }
    
  public void setBoard(Board b) {
	   this.game = game;
   }
    public Dimension getPreferredSize() {
        return new Dimension(WIDTH, HEIGHT); // might change later to fit board size
    }        
    
    public void paint(Graphics g) {
        game.paint(g);
    }
     
}

