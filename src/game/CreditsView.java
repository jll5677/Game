package game;

import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;



public class CreditsView extends JPanel{

    JLabel credit1;
    JLabel credit2;
    JLabel credit3;
    
    CreditsView()
    {
    GridLayout grid = new GridLayout(3,1);
    setLayout(grid);
        
    credit1 = new JLabel("Cody Farrell");
    credit2 = new JLabel("Jian Li");
    credit3 = new JLabel("Daniel Backer");
    
    add(credit1);
    add(credit2);
    add(credit3);
    }

    
    

    
}

