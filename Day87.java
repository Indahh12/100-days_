
package day.pkg87;

import java.util.Scanner;

public class Day87 {
    
    public static void main(String[] args) {
        
         // Membuat objek Scanner untuk input dari user
        Scanner sc = new Scanner(System.in);

        // Input data gaji karyawan
        System.out.print("Masukkan gaji karyawan: ");
        double gajiKaryawan = sc.nextDouble();

        // Input data potongan
        System.out.print("Masukkan jumlah potongan: ");
        double potongan = sc.nextDouble();

        // Menghitung gaji bersih
        double gajiBersih = gajiKaryawan - potongan;

        // Menampilkan hasil
        System.out.println("Gaji Bersih: " + gajiBersih);

        // Menutup scanner
        sc.close();
    }
    
}
