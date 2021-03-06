package brickBreaker2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Timer;

import javax.swing.JFrame;

public class Gameplay extends JFrame implements ActionListener, KeyListener {
    
    // So game doesn't start right away.
    private boolean play = false;
    // Start score at 0
    private int score = 0;
    // Since 700 wide, 7 x 3 = 21
    private int bricks = 21;
    // Get timer
    private Timer timer;
    // Control timer delay
    private int delay = 8;
    // Only need X for player since movement is left/right
    private int playerX = 310;
    // Ball x coord.
    private int ballposX = 120;
    // Ball y coord.
    private int ballposY = 350;
    // Bounce off for X speed to be equal to contact
    private int balldirX = -1;
    // Bounce off for Y speed to be 2 times contact
    private int balldirY = -2;
    
    // Giving parameters to gameplay for use
    public Gameplay() {
        addKeyListener(this); // so we can use the key listener 
        setFocusable(true); // user can focus on different options 
        setFocusTraversalKeysEnabled(false); // user can use traversal keys to navigate focus
        timer = new Timer(delay, this); // creating the timer for game
        timer.start();
    }
    
    // this function gets graphics object 'g' which 
    // lets us draw the ball, boundaries, bricks, etc.
    public void paint(Graphics g) {
        // background
        g.setColor(Color.black);
        g.fillRect(1, 1, 692, 592);
        
        // borders for top, left, right
        // didn't add bottom because I want the game to end when it goes out of screen
        g.setColor(Color.yellow);
        g.fillRect(0, 0, 3, 592);
        g.fillRect(0, 0, 692, 3);
        g.fillRect(691, 0, 3, 592);
        
        // paddle with controllable x position
        g.setColor(Color.green);
        g.fillRect(playerX, 550, 100, 8);
        
        // the ball 20x20 with variable x and y position
        g.setColor(Color.yellow);
        g.fillRect(ballposX, ballposY, 20, 20);
        
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
        // To designate which key is used
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // To detect when key is pressed
        if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
            // To check if the paddle doesn't cross the right border.
            if(playerX >= 600) {
                playerX = 600; // set the paddle to static position to prevent out of bounds
            } else {
                moveRight(); //moveRight method still has to be created.
            }
        }
        if(e.getKeyCode() == KeyEvent.VK_LEFT) {
            // To check if the paddle doesn't cross the left border.
            if(playerX <= 100) {
                playerX = 100; // set the paddle to static position to prevent out of bounds
            } else {
                moveLeft(); //moveLeft method still has to be created.
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // To detect when key is released
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // How the code reacts to the action
        
    }
    //add motion animation for still image of ball
}
