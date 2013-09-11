package continuous.gfx;

import java.awt.Graphics;

import javax.swing.JFrame;

import continuous.Game;

public class GUI {
    GameView gameView;
    Game continuous;
    
    JFrame frame;
    
    public GUI(Game game) {
        this.continuous = game;
        
        gameView = new GameView(game);
        frame = new JFrame(game.getTitle());
        frame.setContentPane(gameView);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.pack();
    }
    
    public void render() {
        Graphics g = gameView.getGraphics();
        gameView.paint(g);
    }
    
    public void tick() {
        frame.repaint();
    }
}
