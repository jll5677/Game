package game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class MainController {
    MainModel m_model;
    MainView m_view;
    OptionsModel o_model;
    
    MainController(final MainModel m_model, final MainView m_view) {
        this.m_model = m_model;
        this.m_view = m_view;
      
       class ButtonListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                JButton clickSource = (JButton)e.getSource();
                if(clickSource == m_view.updatePlayerLabel) {
                    m_view.playerLabel.setText("PLAYER INFO -- Sprite Color: " + m_model.getPlayerColorString() + "  Background Color: " + 
                            m_model.getBackgroundColorString() + "  Sprite Size: " + m_model.getPlayerSize());
                }
            }
        }
        m_view.addUpdatePlayerLabelButtonListener(new ButtonListener());
    }
}

