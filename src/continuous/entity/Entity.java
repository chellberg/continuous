package continuous.entity;

import java.awt.Color;
import java.awt.Graphics;

import continuous.gfx.Input;

public class Entity {
    private double x, y, dx, dy;
    
    private final Input input = new Input();
    
    private static final int WIDTH = 32;
    private static final int HEIGHT = 32;
    
    public Entity() {
        x = 0;
        y = 0;
        dx = 0;
        dy = 0;
    }
    
    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.fillRect((int) x, (int) y, WIDTH, HEIGHT);
        g.drawRect((int) x, (int) y, WIDTH, HEIGHT);
    }
    
    public Entity(double x, double y) {
        this.x = x;
        this.y = y;
        moveTo(x, y);
        
    }
    
    // if no change, calls move with existing dx/dy
    public void move() {
        move(dx, dy);
    }
    
    public void move(double dx, double dy) {
        
        // if entity is at rest, start accelerating
        if (this.dx == 0 && this.dy == 0) {
            this.x = dx;
            this.y = dy;
        } else { // otherwise call moveTo with new velocity // removed else here
            moveTo(this.x + dx, this.y + dy);
        }
        
    }
    
    public void moveTo(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public void tick() {
        update();
    }
    
    public Input getInput() {
        return this.input;
    }
    
    public void update() {
        if (input.leftPressed) {
            dx += -.03;
        }
        if (input.rightPressed) {
            dx += .03;
        }
        if (input.upPressed) {
            dy += -.03;
        }
        if (input.downPressed) {
            dy += .03;
        }
        /*
         * if (Game.upPressed == false) { //simulating gravity dy += .01;
         * 
         * }
         */
        move(dx, dy);
    }
    
}
