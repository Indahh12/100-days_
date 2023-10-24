package day.pkg16;

import java.util.Scanner;

public class Day16 {
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       
        System.out.println("Masukkan panjang alas segitiga : ");
        double alas = input.nextDouble();
        
        System.out.println("Masukkan tinggi segitiga : ");
        double tinggi = input.nextDouble();
        
        double luas = 0.5 * alas * tinggi ;
        System.out.println("Luas segitiga adalah " + luas);
    }
    
}
