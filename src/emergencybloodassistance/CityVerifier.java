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
public class CityVerifier extends InputVerifier{

    @Override
    public boolean verify(JComponent input) {
        JTextField jtf=(JTextField) input;
       if(jtf.getText()!=null&&jtf.getText().matches("^[a-zA-Z\\s]*$")&&jtf.getText().length()>0)
           return true;
       else{
           JOptionPane.showMessageDialog(input, "Kindly enter valid city", "Invalid Input", JOptionPane.ERROR_MESSAGE);
           return false;
       }
    }
    
}
