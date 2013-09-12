package continuous.gfx;

import java.awt.Graphics;

import javax.swing.JFrame;

import continuous.Game;

public class GUI {
    Game continuous;
    JFrame frame;
    GameView gameView;
    
    public GUI(Game game) {
        this.continuous = game;
        gameView = new GameView(game);
        gameView.setFocusable(true);
        gameView.requestFocusInWindow();
        frame = new JFrame(game.getTitle());
        frame.setContentPane(gameView);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
        // frame.setFocusable(true);
        frame.pack();
    }
    
    public void addInput(Input input) {
        gameView.addInput(input);
    }
    
    public void render() {
        Graphics g = gameView.getGraphics();
        gameView.paint(g);
    }
    
    public void tick() {
        frame.repaint();
    }
}
