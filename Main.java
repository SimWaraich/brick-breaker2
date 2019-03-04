// Brick Breaker 2 game. b
package brickBreaker2;

import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
        
        // Creating the frame and its properties.
        JFrame frame = new JFrame();
        frame.setBounds(10, 10, 700, 600);
        frame.setTitle("Brick Breaker 2");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        // Adding gameplay into the frame.
        Gameplay gamePlay = new Gameplay();
        frame.add(gamePlay);
    }

}
