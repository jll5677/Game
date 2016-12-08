package game;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;


public class OptionsController {
    
    OptionsModel o_model;
    OptionsView o_view;
    MainModel m_model;
    Player player;
    
    OptionsController(final OptionsModel o_model, final OptionsView o_view, final MainModel m_model, final Player player)
    {
        this.o_model = o_model;
        this.o_view = o_view;
        this.m_model = m_model;
        
        class ButtonListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                JButton clickSource = (JButton)e.getSource();
                if(clickSource == o_view.redButton) {
                    o_model.setPlayerColor(Color.RED);
                    m_model.setPlayerColor(Color.RED);
                    player.setPlayerColor(Color.RED);
                    
                }
                if(clickSource == o_view.greenButton) {
                    o_model.setPlayerColor(Color.GREEN);
                    m_model.setPlayerColor(Color.GREEN);
                    player.setPlayerColor(Color.GREEN);
                }
                if(clickSource == o_view.blueButton) {
                    o_model.setPlayerColor(Color.BLUE);
                    m_model.setPlayerColor(Color.BLUE);
                    player.setPlayerColor(Color.BLUE);
                }
                if(clickSource == o_view.blackButton) {
                    o_model.setBackgroundColor(Color.BLACK);
                    m_model.setBackgroundColor(Color.BLACK);
                }
                if(clickSource == o_view.grayButton) {
                    o_model.setBackgroundColor(Color.GRAY);
                    m_model.setBackgroundColor(Color.GRAY);
                }
                if(clickSource == o_view.cyanButton) {
                    o_model.setBackgroundColor(Color.CYAN);
                    m_model.setBackgroundColor(Color.CYAN);
                }
                if(clickSource == o_view.savePlayerInfoButton) {
                    if(o_view.playerSizeSlider.getValue() == 0) {
                        o_model.setPlayerSize(32);
                        m_model.setPlayerSize(32);
                    }
                    if(o_view.playerSizeSlider.getValue() == 1) {
                        o_model.setPlayerSize(37);
                        m_model.setPlayerSize(37);
                    }
                    if(o_view.playerSizeSlider.getValue() == 2) {
                        o_model.setPlayerSize(42);
                        m_model.setPlayerSize(42);
                    }
                    if(o_view.playerSizeSlider.getValue() == 3) {
                        o_model.setPlayerSize(47);
                        m_model.setPlayerSize(47);
                    }
                }
                if(clickSource == o_view.showPlayerInfoButton) {
                    o_view.playerInfoLabel.setText("Challenger is ready to play!");
                    o_view.playerColorLabel.setText("USER COLOR: " + o_model.getPlayerColorString());
                    o_view.backgroundColorLabel.setText("BACKGROUND COLOR: " + o_model.getBackgroundColorString());
                    o_view.playerSizeLabel.setText("PLAYER SIZE: " + o_model.getPlayerSize());
                }
            }
        }
        o_view.addRedButtonListener(new ButtonListener());
        o_view.addGreenButtonListener(new ButtonListener());
        o_view.addBlueButtonListener(new ButtonListener());
        o_view.addBlackButtonListener(new ButtonListener());
        o_view.addGrayButtonListener(new ButtonListener());
        o_view.addCyanButtonListener(new ButtonListener());
        o_view.addSavePlayerInfoButtonListener(new ButtonListener());
        o_view.addShowPlayerInfoButtonListener(new ButtonListener());
    }
    
}

