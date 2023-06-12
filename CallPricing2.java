//package tadii_ant;

import javax.swing.JOptionPane;
public class CallPricing2 {
    public static void main(String []args){
    
        int min;
    float f1 = 1.50f;
    float b3 = .50f;
    float pricing;
    float f2;
    float f3;
    float a3 = .15f;
    
    min=  Integer.parseInt(JOptionPane.showInputDialog("How long was your call? **in min**"));
    
    if (min >=3) {
    f2 = min-3;
    f3 =f2 *a3;
    pricing = f3+ f1;
    }
    else {pricing = min *b3;
    }
    
    JOptionPane.showMessageDialog(null, "The cost of your call is R"+pricing);
    
    
    }
    
}
