package tadii_ant;

import javax.swing.JOptionPane;
public class Distance2 {
    public static void main(String [] args){
    // declarations 
    float fkm;
    float fm;
    float fcm;
    //code
    
    fkm = Float.parseFloat(JOptionPane.showInputDialog("How many km did you walk today?"));
    
    fm = fkm * 1000;
    fcm = fkm * 10000;
    
   
    JOptionPane.showMessageDialog(null, "You walked "+ fm +"m and walked "+ fcm+ "cm");
    
    }
}
