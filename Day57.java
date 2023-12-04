
package day.pkg57;

import java.util.Scanner;

public class Day57 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan usia: ");
        int usia = sc.nextInt();

        String kategoriUsia = (usia < 18) ? "Remaja" : (usia < 65) ? "Dewasa" : "Lansia";


        System.out.println("Kategori usia: " + kategoriUsia);
            }
    
}
