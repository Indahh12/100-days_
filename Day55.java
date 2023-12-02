
package day.pkg55;

import java.util.Calendar;
import java.util.Scanner;

public class Day55 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Masukkan tahun kelahiran anda! ");
        int tahunKelahiran = sc.nextInt();
        
        int tahunSekarang = Calendar.getInstance().get(Calendar.YEAR);
        
        //Menghitung umur
        int umur = tahunSekarang - tahunKelahiran;
        
        //Menampilkan hasil
        System.out.println("Umur anda adalah: " + umur + "tahun");
        
        sc.close();
        
        
           }
    
}
