
package day.pkg47;

import javax.swing.JOptionPane;

public class Day47 {

   
    public static void main(String[] args) {
       String nama , NIM;
       
       nama = JOptionPane.showInputDialog("Inputkan nama anda: ");
       String msg = "Hello" + nama + "!";
       JOptionPane.showMessageDialog(null,msg);
       
       NIM = JOptionPane.showInputDialog("Inputkan NIM anda: ");
       String nim = "Nim anda adalah : " + NIM + "!";
       JOptionPane.showMessageDialog(null,nim);

    }
    
}
