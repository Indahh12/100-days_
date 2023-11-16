
package days39;

import java.util.Scanner;


public class Days39 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan warna lampu (merah, kuning, hijau): ");
        String warnaLampu = input.nextLine();
        
        if (warnaLampu.equalsIgnoreCase("merah")){
            System.out.println("Berhenti!");
        }else if (warnaLampu.equalsIgnoreCase("kuning")){
            System.out.println("Hati-hati, siap-siap berhenti!");
        }else if (warnaLampu.equalsIgnoreCase("Hijau")){
            System.out.println("Silahkan jalan!");
        }else{
            System.out.println("Warna lampu tidak valid!");
        }
        
        
    }
    
}

            
    

