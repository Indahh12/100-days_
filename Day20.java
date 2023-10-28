
package day.pkg20;

import java.util.Scanner;

public class Day20 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        //Meminta pengguna memasukan pendapatan tahunan
        System.out.println("Masukkan pendapatan tahunan anda: ");
        double pendapatanTahunan = input.nextDouble();
        
        //Menghitung pajak berdasarkan tarif pajak yang berlaku 
        double pajak = 0.0;
        
        if (pendapatanTahunan <= 50000) {
            pajak = pendapatanTahunan * 0.05;
        } else if (pendapatanTahunan <= 100000) {
            pajak = 50000 * 0.05 + (pendapatanTahunan - 50000 * 0.10);
        } else {
            pajak = 50000 * 0.05 + 50000 * 0.10 + (pendapatanTahunan - 100000) * 0.15;
        }
        //Menampilkan jumlah pajak yang harus dibayarkan 
        System.out.println("Jumlah pajak yang harus dibayarkan: " + pajak);
    }
    
}
