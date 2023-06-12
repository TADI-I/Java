package tadii_ant;

import javax.swing.JOptionPane;
public class HypMath2 {
    public static void main(String [] args){
    
    
    double x = Double.parseDouble(JOptionPane.showInputDialog("How long is side X?"));
    double y = Double.parseDouble(JOptionPane.showInputDialog("How long is side y?"));
    
    double z = Math.sqrt((x*x)+(y*y));
    
    JOptionPane.showMessageDialog(null, Math.round(z));
  
    
    
    
    
    
    }
}
