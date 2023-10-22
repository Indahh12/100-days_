package day.pkg14;

import java.util.Scanner;

public class Day14 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Masukkann jenis ikan : ");
        String jenisIkan = input.next();
        
        double hargaIkan = 0.0;
        
        if (jenisIkan.equalsIgnoreCase("Nila")){
            hargaIkan = 20.0;
        }else if (jenisIkan.equalsIgnoreCase("Gurame")){
            hargaIkan = 50.0;
        }else if (jenisIkan.equalsIgnoreCase("Bandeng")){
            hargaIkan = 25.0;
        }else if (jenisIkan.equalsIgnoreCase("Lele")){
            hargaIkan = 30.0;
        }else if (jenisIkan.equalsIgnoreCase("Hiu")){
            hargaIkan = 200.0;
        }else if (jenisIkan.equalsIgnoreCase("Paus")){
            hargaIkan = 250.0;
        }else if (jenisIkan.equalsIgnoreCase("Dori")){
            hargaIkan = 40.0;
        
            
        }else{
            System.out.println("Jenis ikan yang anda masukkan tidak dikenali");
        
           
          
            
        }
        System.out.println("harga ikan " + jenisIkan + " adalah : Rp " + hargaIkan);
    }
    
}
