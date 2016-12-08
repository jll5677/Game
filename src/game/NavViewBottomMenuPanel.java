package game;
import javax.swing.JButton;
import javax.swing.JPanel;


public class NavViewBottomMenuPanel extends JPanel{
    JButton mainButton;
    JButton startButton;
    JButton optionsButton;
    JButton instructionsButton;
    JButton creditsButton;
    
    public NavViewBottomMenuPanel() {
        super();       
        mainButton = new JButton("Main");
        startButton = new JButton("Start Game");
        optionsButton = new JButton("Options");
        instructionsButton = new JButton("Instructions");
        creditsButton = new JButton("Credits");
        
                               
        add(mainButton);
        add(startButton);   
        add(optionsButton);
        add(instructionsButton);
        add(creditsButton);
    }          
}

