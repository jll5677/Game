package game;
import java.awt.BorderLayout;
import javax.swing.JPanel;


public class NavViewPanel extends JPanel{
    NavViewBottomMenuPanel menu;
    NavViewSplashPanel splash;
    
    OptionsView o_view;
    MainView m_view;
    InstructionView i_view;
    CreditsView c_view;
    
    Window window;
    
    public NavViewPanel() {
        super();
        setLayout(new BorderLayout());     
        menu = new NavViewBottomMenuPanel();
        splash = new NavViewSplashPanel();
        
        add(menu, BorderLayout.SOUTH);        
        add(splash, BorderLayout.CENTER);                        
    }
    
    //Note: Splash scrren is only shown on startup.  No need to navigate back to it.
    public void addStartGame() {
        new Window(800, 600, "Game", new Game());
    }
    
    public void addOptions(OptionsView o_view) {
        this.o_view = o_view; //maintain handle to this view so we can remove it
        add(o_view, BorderLayout.CENTER);
        revalidate();
        repaint();
    }

    public void addMain(MainView m_view) {
        this.m_view = m_view;  //maintain handle to this view so we can remove it
        add(m_view, BorderLayout.CENTER);
        revalidate();
        repaint();
    }    
    
    public void addInstruction(InstructionView i_view) {
        this.i_view = i_view;
        add(i_view, BorderLayout.CENTER);
        revalidate();
        repaint();
    }
    
    public void addCredits(CreditsView c_view) {
        this.c_view = c_view;
        add(c_view, BorderLayout.CENTER);
        revalidate();
        repaint();
    }
    
    public void addSplash(NavView n_view) {
        add(n_view, BorderLayout.CENTER);
        revalidate();
        repaint();
    }
    
    
    public void removeOptions() {
        if (this.o_view != null)
            remove(this.o_view);
    }
    
    public void removeMain() {
        if (this.m_view != null)
            remove(this.m_view);
    }    
    
    public void removeInstruction() {
        if (this.i_view != null)
            remove(this.i_view);
    }
    
    public void removeCredits() {
        if (this.c_view != null)
            remove(this.c_view);
    }
        
    public void removeSplash() {
        remove(splash);
    }

          
}

