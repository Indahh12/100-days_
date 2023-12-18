
package day.pkg71;

import java.util.Scanner;

public class Day71 {

    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       //Input jumlah angka
        System.out.println("Masukkan jumlah angka:");
        int jumlahAngka = sc.nextInt();
        
         // Inisialisasi array untuk menyimpan angka-angka
        int[] angkaArray = new int[jumlahAngka];
        
        //Input angka-angka
        for (int i = 0; i < jumlahAngka; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            angkaArray[i]= sc.nextInt();
            
        }
        //Hitung total
        int total = 0;
        for (int angka : angkaArray){
            total += angka;
        }
        //Hitung rata-rata
        double rataRata = (double) total / jumlahAngka;
         // Output hasil
        System.out.println("Rata-rata dari angka-angka tersebut adalah: " + rataRata);

        sc.close();
    }
    
}
