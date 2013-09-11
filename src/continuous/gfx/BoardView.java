package continuous.gfx;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

import continuous.world.Board;

public class BoardView extends JPanel {

	public static final int WIDTH = 800;
    public static final int HEIGHT = 600;

  Board board;

  public BoardView(Board b) {
    this.board = b;
    addKeyListener(new Input());
  }

  public void setBoard(Board b) {
    this.board = b;
  }

  public Dimension getPreferredSize() {
    return new Dimension(WIDTH, HEIGHT);
  }

  public void paint(Graphics g) {
   board.paint(g);
  }
}