package day.pkg18;

import java.util.Scanner;

public class Day18 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        
        System.out.println("Masukkan panjang sisi atas trapesium : ");
        double sisiAtas = input.nextDouble();
        
        System.out.println("Masukkan panjang sisi bawah trapesium : ");
        double sisiBawah = input.nextDouble();
        
        System.out.println("Masukkan tinggi trapesium : ");
        double tinggi = input.nextDouble();
        
        double luas = 0.5 * ( sisiAtas + sisiBawah ) * tinggi;
        
        System.out.println("Luas trapesium adalah : " + luas);
    }
    
}
