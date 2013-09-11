package continuous.gfx;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;
import javax.swing.JTextField;

import continuous.Game;

public class GameView extends JPanel {
    
    public static final int HEIGHT = 600;
    public static final int WIDTH = 800;
    
    private final Game game;
    
    public GameView(Game game) {
        this.game = game;
        addKeyListener(new Input()
        );
    }
    
    public void paint(Graphics g) {
        game.paint(g);
    }
    
    public Dimension getPreferredSize() {
        return new Dimension(WIDTH, HEIGHT);
    }
}
    

