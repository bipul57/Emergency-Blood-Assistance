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
public class AgeVerifier extends InputVerifier{
    @Override
    public boolean verify(JComponent input) {
        JTextField jtf=(JTextField) input;
        if(jtf.getText()!=null&&jtf.getText().matches("[\\p{Digit}&&[1234567890]]+")&&Integer.parseInt(jtf.getText())>=19&&Integer.parseInt(jtf.getText())<=50)
            return true;
        else{
        JOptionPane.showMessageDialog(input, "Kindly enter valid age between 19 and 50", "Invalid Input", JOptionPane.ERROR_MESSAGE);
        return false;
        }
    }
}
