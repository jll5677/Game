/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.LinkedList;

/**
 *
 * @author Jimmy
 */
public class Player extends GameObject{

    private float width = 32, height = 32; //Player size

    private float gravity = 0.5f;
    private final float MAX_SPEED = 10;
    private Camera cam;
    private Handler handler;
    
    public Player(float x, float y, Handler handler, Camera cam, ObjectId id) {
        super(x, y, id);
        this.handler = handler;
        this.cam = cam;
    }

    public void tick(LinkedList<GameObject> object) {
        x += velX;
        y += velY;
        
        if(falling || jumping){
            velY += gravity;
            
            if(velY > MAX_SPEED)
                velY = MAX_SPEED;
        }
        
        Collision(object);
    }
    
    private void Collision(LinkedList<GameObject> object){
        for(int i = 0; i < handler.object.size(); i++){
            GameObject tempObject = handler.object.get(i);
            
            if(tempObject.getId() == ObjectId.Block){
                if(getBoundsTop().intersects(tempObject.getBounds())){
                    y = tempObject.getY() + height;
                    velY = 0;
                }
                if(getBounds().intersects(tempObject.getBounds())){
                    y = tempObject.getY()- height;
                    velY = 0;
                    jumping = false;
                    falling = false; 
                }else
                    falling = true;
                if(getBoundsRight().intersects(tempObject.getBounds())){
                    x = tempObject.getX() - width;
                }
                if(getBoundsLeft().intersects(tempObject.getBounds())){
                    x = tempObject.getX() + width;
                }
            }else if(tempObject.getId() == ObjectId.Flag){
                if(getBounds().intersects(tempObject.getBounds())){
                handler.switchLevel();
                cam.setX(0);
                }
            }
        }
    }
    
    public void render(Graphics g) {
        g.setColor(Color.green); //change player color
        g.fillRect((int)x,(int)y, (int)width, (int)height);
    }

    public Rectangle getBounds() {
        return new Rectangle((int) ((int)x+(width/2)-((width/2)/2)), (int) ((int)y+(height/2)), (int)width/2, (int)height/2);
    }
    public Rectangle getBoundsTop() {
        return new Rectangle((int) ((int)x+(width/2)-((width/2)/2)),(int)y, (int)width/2, (int)height/2);
    }
    public Rectangle getBoundsRight() {
        return new Rectangle((int) ((int)x+width-5),(int)y+5, (int)5, (int)height-10);
    }
    public Rectangle getBoundsLeft() {
        return new Rectangle((int)x,(int)y+5, (int)5, (int)height-10);
    }
    
}
