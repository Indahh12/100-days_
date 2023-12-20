
package day.pkg73;

import java.util.Scanner;

public class Day73 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = sc.nextInt();

        // Menggunakan operator ternary untuk menentukan apakah angka genap atau ganjil
        String jenisAngka = (angka % 2 == 0) ? "genap" : "ganjil";

        System.out.println("Angka " + angka + " adalah angka " + jenisAngka + ".");

        sc.close();
    }
    
}
