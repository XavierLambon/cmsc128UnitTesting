/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cmsc128;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Reginald Neil C. Recario
 */
public class CMSC128PanelAddButtonListener implements ActionListener {

    private CMSC128Panel c128p;
    //private CMSC128 aThis;
    
    public CMSC128PanelAddButtonListener(CMSC128Panel c128p){
        this.c128p = c128p;
    }
        
    @Override
    public void actionPerformed(ActionEvent ae) {
        Float weightA, weightB, weightSum;
        String strSum;
        
        weightA = Float.parseFloat(this.c128p.getOperandJTextField1().getText());
        weightB = Float.parseFloat(this.c128p.getOperandJTextField2().getText());
        
        //compute the sum of the weights
        weightSum = weightA + weightB;
        
        //put the sum on the sum field
        strSum = Float.toString(weightSum);
        this.c128p.getSumJTextField().setText(strSum);
    }
    
}
