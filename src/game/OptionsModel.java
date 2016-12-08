package game;

import java.awt.Color;

public class OptionsModel {
    private Color playerColor;
    private Color backgroundColor;
    private int playerSize;
    
    OptionsModel(){}
    
    public void setPlayerColor(Color playerColor) {
        this.playerColor = playerColor;
    }
    public void setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
    }
    public void setPlayerSize(int playerSize) {
        this.playerSize = playerSize;
    }
    
    public Color getPlayerColor() {
        return this.playerColor;
    }
    public Color getBackgroundColor() {
        return this.backgroundColor;
    }
    public int getPlayerSize() {
        return this.playerSize;
    }
    
    public String getPlayerColorString() {
        String PCString = "";
        if(playerColor == Color.RED) {
            PCString = "Red";
        }
        if(playerColor == Color.BLUE) {
            PCString = "Blue";
        }
        if(playerColor == Color.GREEN) {
            PCString = "Green";
        }
        return PCString;
    }
    public String getBackgroundColorString() {
        String BCString = "";
        if(backgroundColor == Color.BLACK) {
            BCString = "Black";
        }
        if(backgroundColor == Color.GRAY) {
            BCString = "Gray";
        }
        if(backgroundColor == Color.CYAN) {
            BCString = "Cyan";
        }
        return BCString;
    }
}

