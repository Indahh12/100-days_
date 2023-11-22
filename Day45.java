
package day.pkg45;

import java.util.Scanner;

public class Day45 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
        System.out.println("Masukkan berat badan anda: ");
        int bb = sc.nextInt();
        
        System.out.println("Masukkan tinggi badan anda (meter): ");
        double tb = sc.nextDouble();
        
        double bbIdeal = (bb/(tb*tb));
        System.out.println("Berat badan ideal: " + bbIdeal);
        
        
    }
    
}
