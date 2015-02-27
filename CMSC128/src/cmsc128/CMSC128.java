/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cmsc128;

import javax.swing.JFrame;

/**
 *
 * @author Reginald Neil C. Recario
 */
public class CMSC128 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CMSC128Panel c128p = new CMSC128Panel();
        CMSC128PanelAddButtonListener c128pabl = new CMSC128PanelAddButtonListener(c128p);
        
        JFrame frame = new JFrame("CMSC 128 Application");
        frame.setSize(600, 300);
        frame.setResizable(true);
        frame.setVisible(true);
        c128p.getAddJButton().addActionListener(c128pabl);
        frame.add(c128p);
        
    }
}
