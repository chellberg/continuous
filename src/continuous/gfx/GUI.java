package continuous.gfx;

import java.awt.Graphics;


import javax.swing.JFrame;

import continuous.Game;
import continuous.world.Board;

public class GUI {
    BoardView boardView;
    Game continuous;
    
    JFrame frame;
    
    public GUI(Game game) {
        this.continuous = game;
        
        boardView = new BoardView(game.getBoard());
        boardView.setFocusable(true);
        boardView.requestFocusInWindow();
        
        frame = new JFrame(game.getTitle());
        frame.setContentPane(boardView);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
      //  frame.setFocusable(true);
        frame.pack();
    }
    
  
    
    public void render() {
        Graphics g = boardView.getGraphics();
        boardView.paint(g);
    }
    
    public void setMap(Board board) {
    	this.boardView.setBoard(board);
    	frame.pack();
    }
    
    public void tick() {
        frame.repaint();
    }
}
