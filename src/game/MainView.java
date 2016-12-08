package game;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class MainView extends JPanel{
    JLabel welcomeLabel;
    JLabel playerLabel;
    JButton updatePlayerLabel;
    MainModel m_model;
    
    MainView(final MainModel m_model)
    {
        this.m_model = m_model;
        
        GridLayout grid = new GridLayout(6,1);
        setLayout(grid);
        
        welcomeLabel = new JLabel("Welcome to Box Jump!");
        playerLabel = new JLabel("No info yet.");
        updatePlayerLabel = new JButton("Show Player Settings");
        
        add(welcomeLabel);
        add(playerLabel);
        add(updatePlayerLabel);
    }
    
    public void addUpdatePlayerLabelButtonListener(ActionListener alP1Label) {
        updatePlayerLabel.addActionListener(alP1Label);
    }
}

