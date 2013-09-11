package continuous;

import java.awt.Graphics;

import continuous.entity.Entity;
import continuous.gfx.GUI;

public class Game extends Thread {
    
    public static void main(String[] args) {
        Game game = new Game();
        game.start();
    }
    
    private static final String TITLE = "Continuous";
    protected Entity entity;
    protected GUI gui;
    
    public Game() {
        entity = new Entity();
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
        entity.tick();
        gui.tick();
        // gui.render();
    }
    
    public GUI getFrame() {
        return gui;
    }
    
    public String getTitle() {
        return TITLE;
    }
    
    public void paint(Graphics g) {
        entity.paint(g);
    }
}