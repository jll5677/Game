package game;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class NavView extends JFrame{
    
    NavModel model;
    NavViewPanel nVpanel;
    
    NavView(NavModel model)
    {
        super("Box Jump");
        this.model = model;
                          
        setSize(700, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        nVpanel = new NavViewPanel();
        
        add(nVpanel);    
    }
    
    public void switchToOptionsPanel(OptionsView o_view) {
        nVpanel.removeSplash();
        nVpanel.removeMain();
        nVpanel.removeInstruction();
        nVpanel.removeCredits();
        nVpanel.removeStartGame();
        nVpanel.addOptions(o_view);        
    }
    
    public void switchToMainPanel(MainView m_view) {
        nVpanel.removeSplash();
        nVpanel.removeOptions();
        nVpanel.removeInstruction();
        nVpanel.removeCredits();
        nVpanel.removeStartGame();
        nVpanel.addMain(m_view);        
    }
    
    public void switchToInstructionPanel(InstructionView i_view) {
        nVpanel.removeSplash();
        nVpanel.removeMain();
        nVpanel.removeOptions();
        nVpanel.removeCredits();
        nVpanel.removeStartGame();
        nVpanel.addInstruction(i_view); 
    }
    
    public void switchToCreditsPanel(CreditsView c_view) {
        nVpanel.removeSplash();
        nVpanel.removeMain();
        nVpanel.removeOptions();
        nVpanel.removeInstruction();
        nVpanel.removeStartGame();
        nVpanel.addCredits(c_view); 
    }
    
    public void switchToStartGamePanel(GamePanel g_panel) {
        nVpanel.removeSplash();
        nVpanel.removeMain();
        nVpanel.removeOptions();
        nVpanel.removeInstruction();
        nVpanel.removeCredits();
        nVpanel.addStartGame(g_panel);
    }
    
    public void addOptionsButtonListener(ActionListener al) {    
        nVpanel.menu.optionsButton.addActionListener(al);
    }    
                    
    public void addMainButtonListener(ActionListener al) {    
        nVpanel.menu.mainButton.addActionListener(al);
    }
        
    public void addInstructionButtonListener(ActionListener al) {
        nVpanel.menu.instructionsButton.addActionListener(al);
    }
    
    public void addCreditsButtonListener(ActionListener al) {
        nVpanel.menu.creditsButton.addActionListener(al);
    }
    
    public void addstartButtonListener(ActionListener al) {
        nVpanel.menu.startButton.addActionListener(al);
    }
    
    //TODO: Add listeners to switch to other Panels
    
}

