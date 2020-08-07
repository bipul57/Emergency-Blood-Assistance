/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emergencybloodassistance;
import javax.swing.*;
/**
 *
 * @author Bipul Sapkota
 */
public class GenderVerifier extends InputVerifier{

    @Override
    public boolean verify(JComponent input) {
        JRadioButton jrb=(JRadioButton)input;
        if(jrb.isSelected())
            return true;
        else{
            JOptionPane.showMessageDialog(input, "Kindly select gender", "Invalid Input", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
}
