package game;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;


public class OptionsView extends JPanel{
    JLabel playerColorInstructions;
    JButton redButton;
    JButton greenButton;
    JButton blueButton;
    JLabel backgroundColorInstructions;
    JButton blackButton;
    JButton grayButton;
    JButton cyanButton;
    JLabel playerSizeInstructions;
    JSlider playerSizeSlider;
    JButton savePlayerInfoButton;
    JButton showPlayerInfoButton;
    JLabel playerInfoLabel;
    JLabel playerColorLabel;
    JLabel backgroundColorLabel;
    JLabel playerSizeLabel;
    
    OptionsModel o_model;
        
    OptionsView(OptionsModel o_model) {
        this.o_model = o_model;
        
        playerColorInstructions = new JLabel("Pick the color for your sprite.");
            
        redButton = new JButton("Red");
        redButton.setBackground(Color.RED);
        greenButton = new JButton("Green");
        greenButton.setBackground(Color.GREEN);
        blueButton = new JButton("Blue");
        blueButton.setForeground(Color.WHITE);
        blueButton.setBackground(Color.BLUE);
        
        backgroundColorInstructions = new JLabel("Pick the color for your background");
        
        blackButton = new JButton("Black");
        blackButton.setForeground(Color.WHITE);
        blackButton.setBackground(Color.BLACK);
        grayButton = new JButton("Gray");
        grayButton.setBackground(Color.GRAY);
        cyanButton = new JButton("Cyan");
        cyanButton.setBackground(Color.CYAN);
        
        playerSizeInstructions = new JLabel("Select the size of your sprite.  This number is then multiplied by 5 and added to 32.");
           
        playerSizeSlider = new JSlider(JSlider.HORIZONTAL, 0, 3, 1);
        playerSizeSlider.setMajorTickSpacing(1);
        playerSizeSlider.setPaintTicks(true);
        playerSizeSlider.setPaintLabels(true);
           
        savePlayerInfoButton = new JButton("Save Info");
        showPlayerInfoButton = new JButton("Show Info");
        
        playerInfoLabel = new JLabel("No Info Yet");
        playerColorLabel = new JLabel("No Sprite Color Selected Yet");
        backgroundColorLabel = new JLabel("No Background Color Selected Yet");
        playerSizeLabel = new JLabel("No Sprite Size Selected Yet");
        
            
        GridLayout grid = new GridLayout(17,1);
        setLayout(grid);
            
        add(playerColorInstructions);
        add(redButton);
        add(greenButton);
        add(blueButton);
        add(backgroundColorInstructions);
        add(blackButton);
        add(grayButton);
        add(cyanButton);
        add(playerSizeInstructions);
        add(playerSizeSlider);
        add(savePlayerInfoButton);
        add(showPlayerInfoButton);
        add(playerInfoLabel);
        add(playerColorLabel);
        add(backgroundColorLabel);
        add(playerSizeLabel);
    }
        
    public void addRedButtonListener(ActionListener alPR) {
        redButton.addActionListener(alPR);
    }
    public void addGreenButtonListener(ActionListener alPG) {
        greenButton.addActionListener(alPG);
    }
    public void addBlueButtonListener(ActionListener alPB) {
        blueButton.addActionListener(alPB);
    }
    public void addBlackButtonListener(ActionListener alBB) {
        blackButton.addActionListener(alBB);
    }
    public void addGrayButtonListener(ActionListener alBG) {
        grayButton.addActionListener(alBG);
    }
    public void addCyanButtonListener(ActionListener alBC) {
        cyanButton.addActionListener(alBC);
    }
    public void addSavePlayerInfoButtonListener(ActionListener alSave) {
        savePlayerInfoButton.addActionListener(alSave);
    }
    public void addShowPlayerInfoButtonListener(ActionListener alShow) {
        showPlayerInfoButton.addActionListener(alShow);
    }
}

