package game;

import javax.swing.*;


public class NavViewSplashPanel extends JPanel{
    JButton splashButton;
    JLabel optionsLabel;
    NavViewSplashPanel()
    {
            splashButton = new JButton(new ImageIcon("src/images/SplashScreen.png"));            
            add(splashButton);
            
            optionsLabel = new JLabel("No options selected yet.");
            add(optionsLabel);
            
    }    
}

