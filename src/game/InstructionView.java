package game;

import javax.swing.JLabel;
import javax.swing.JPanel;


public class InstructionView extends JPanel{
    InstructionView(){
        JLabel info = new JLabel("The objective of the game is to get to the yellow platform on the other side by moving the square");
        add(info);
        
        JLabel info1 = new JLabel("There will be a timer and the player has to get to the other side in the shortest amount of time possible.");
        add(info1);
        
        JLabel info2 = new JLabel("The player uses the left and right arrow keys to move and the up arrow key to jump.");
        add(info2);
    }
}

