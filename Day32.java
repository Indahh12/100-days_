
package day.pkg32;

import java.util.Scanner;

public class Day32 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Masukkan kode barang: ");
        int kode = sc.nextInt();
        
        double harga = 0;
        switch (kode) {
            case 1 :
                harga = 10.0;
                break;
            case 2 :
                harga = 20.0;
                break;
            case 3 :
                harga = 30.0;
                break;
            case 4 :
                harga = 40.0;
                break;
            default :
                System.out.println("Kode barang tidak valid!");
                break;
                        
        }
        if (harga > 0){
            System.out.println("Harga barang dengan kode " + kode + " adalah: " + harga);
        }
        sc.close();
                
    }
    
}
