/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cmsc128;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Reginald Neil C. Recario
 */
public class WeightAdditionJUnitTest {
    
    CMSC128Panel c128p = new CMSC128Panel();
    
    String k[] =new String[]{"1","2","3","4","5"};
    String l[] = new String[]{"1","2","3","*","5"};

   // public WeightAdditionJUnitTest() {
    //}
    
    @Test
    //test if all inputs in the first text field are 
    public void setOperandJTextField1Value(){
        
        int lengthTest = k.length;
        
        for(int i=0; i<lengthTest; i++){
            c128p.getOperandJTextField1().setText(k[i]);
            assertEquals(k[i], c128p.getOperandJTextField1().getText());
        }
    }
    
    @Test
    //test if the input field accepts non-numeric values except . and -
     public void setOperandJTextField1ValueIfAcceptingNonNumeric(){
        
        int lengthTest = l.length;
        Float diff;
        String diff2;
        for(int i=0; i<lengthTest; i++){
            c128p.getOperandJTextField1().setText(l[i]);
            diff = Float.parseFloat(l[i]) - Float.parseFloat(c128p.getOperandJTextField1().getText());
            diff2 = diff.toString();
            assertEquals(diff2, "0.0");
        }
    }   
    
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}