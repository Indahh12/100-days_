
package day.pkg86;

import java.util.Scanner;

public class Day86 {
    public static void main(String[] args) {
        // Membuat objek scanner untuk input dari pengguna
        Scanner sc = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan jari-jari lingkaran
        System.out.print("Masukkan jari-jari lingkaran: ");
        double jariJari = sc.nextDouble();

        // Menghitung luas lingkaran
        double luasLingkaran = hitungLuasLingkaran(jariJari);

        // Menampilkan hasil
        System.out.println("Luas lingkaran dengan jari-jari " + jariJari + " adalah: " + luasLingkaran);

        // Menutup scanner
        sc.close();
    }

    // Fungsi untuk menghitung luas lingkaran
    public static double hitungLuasLingkaran(double jariJari) {
        double luas = Math.PI * Math.pow(jariJari, 2);
        return luas;
    }
    
}
