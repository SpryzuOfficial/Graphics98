package main;

import frames.MainFrame;
import javax.swing.UIManager;

public class Graphics98 
{
    public static void main(String[] args) 
    {
        try 
        {
            UIManager.setLookAndFeel("com.jtattoo.plaf.luna.LunaLookAndFeel");
        } 
        catch (Exception ex) 
        {
            System.err.println("Error, " + ex);
        }
        
        MainFrame mainFrame = new MainFrame();
    }
}
