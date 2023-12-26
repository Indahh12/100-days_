
package day.pkg79;

import java.util.Scanner;

public class Day79 {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan panjang persegi panjang: ");
        double panjang = sc.nextDouble();

        System.out.print("Masukkan lebar persegi panjang: ");
        double lebar = sc.nextDouble();

        // Hitung luas dan keliling persegi panjang
        double luas = panjang * lebar;
        double keliling = 2 * (panjang + lebar);

        // Tampilkan hasil
        System.out.println("Luas persegi panjang: " + luas);
        System.out.println("Keliling persegi panjang: " + keliling);

        sc.close();
    }
    
}
