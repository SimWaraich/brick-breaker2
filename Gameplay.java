package brickBreaker2;

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
    private Timer time;
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

    }
    
    @Override
    public void keyTyped(KeyEvent e) {
        // To designate which key is used
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // To detect when key is pressed
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // To detect when key is released
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // How the code reacts to the action
        
    }
    
}
