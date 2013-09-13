package continuous.world;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import continuous.entity.Entity;

public class Board {
	
	Tile[][] board;
	int numRows, numCols;
	
	public Board(int w, int h) {
		numCols = w;
		numRows = h;
		
		board = new Tile[w][h];
		
		for (int y = 0; y < h; y++) {
			for (int x = 0; x < w; x++) {
				board[x][y] = new Tile(x, y);     // fill the board with tiles 
			}
		}
	}
	
	public void tick() {
		for (int y = 0; y < numRows; y++) {
			for (int x = 0; x < numCols; x++) {
				board[x][y].tick();               // tick every tile on the board
			}
		}
	}
	
	public Tile getTileAt(int x, int y) {
	//	Tile tile = null;
		x %= Tile.SIZE * numCols; // calculate absolute x position;
		y %= Tile.SIZE * numRows; // calculate absolute absolute y position;
		x /= Tile.SIZE;           // convert to coordinate values
		y /= Tile.SIZE;
		return board[x][y];
	
	}
	
	public int getHeight() {          // unsure if these are needed at this stage
		return numRows * Tile.SIZE;
	}
	
	public int getWidth() {
		return numCols * Tile.SIZE;
	}
	
	public int getTileSize() {
		return Tile.SIZE;
	}
	
	public void paint(Graphics g) {
		  List<Entity> entities = new ArrayList<Entity>();
		for (int y = 0; y < numRows; y++) {
			for (int x = 0; x < numCols; x++) {
				Tile t = board[x][y];              
				t.paint(g);                        // paints the tile
				 entities.addAll(t.getEntities());   // gets any entities present
			}
		}
		
		 for (int i = 0; i < entities.size(); i++) {
			entities.get(i).paint(g);
		}
	}
	
	
	
	
	
	
	
	
	
	
}
