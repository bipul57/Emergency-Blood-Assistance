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
public class BloodGroupVerifier extends InputVerifier{

    @Override
    public boolean verify(JComponent input) {
        JComboBox jbx = (JComboBox) input;
         if(jbx.getSelectedIndex()!=0)
             return true;
         else{
             JOptionPane.showMessageDialog(input, "Kindly select blood group", "Invalid Input", JOptionPane.ERROR_MESSAGE);
             return false;
         }
        
    }
    
}
