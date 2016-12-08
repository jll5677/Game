package game;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPanel;

public class GamePanel extends JPanel{
    Game game;
    
    GamePanel() {
        JButton SAMPLEBUTTON = new JButton("SAMPLE");
        SAMPLEBUTTON.setBackground(Color.yellow);
        SAMPLEBUTTON.setForeground(Color.RED);
        
        game = new Game();
        game.start();
        
        setVisible(true);
        
        //add(SAMPLEBUTTON);
        
    }
}

