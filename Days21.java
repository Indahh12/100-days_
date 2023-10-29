package days.pkg21;

import java.util.Scanner;

public class Days21 {
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        
        //Masukkan jumlah hari
        System.out.println("Masukkan jumlah hari: ");
        int jumlahHari = input.nextInt();
        
        
        //Hitung jumlah bulan 
        int jumlahBulan = jumlahHari / 30 ;
        
        System.out.println("Jumlah bulan dalam " + jumlahHari + "hari adalah: " + jumlahBulan + "bulan");
    }
    
}
