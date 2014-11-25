/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package srwgcdolstringeditor;

import javax.swing.JFrame;
import javax.swing.UIManager;

/**
 *
 * @author Jonatan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try
        {
           UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch (Exception e)
        {
           e.printStackTrace();
        }
        UserInterfaceDSE UI = new UserInterfaceDSE();
        UI.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        UI.setLocation(200, 50);
        //UI.setPreferredSize(new java.awt.Dimension(568, 500));
        UI.setVisible(true);
    }

}
