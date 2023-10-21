package day.pkg13;

import java.util.Scanner;

public class Day13 {
    public static void main(String[] args) {
        System.out.println("MENENTUKAN ZODIAK");
        Scanner input = new Scanner (System.in);
        
        System.out.println("Masukkan tanggal lahir : ");
        int tanggal = input.nextInt();
        
        System.out.println("Masukkan bulan kelahiran : ");
        int bulan = input.nextInt();
        
        if (tanggal > 31 || bulan > 12 ){
            System.out.println("Tanggal/bulan yang anda masukkan tidak valid");
        }else{   
            
            
            
            
            if (tanggal > 21 && bulan == 12 || tanggal < 20 && bulan == 1){
                System.out.println("ZODIAK ANDA ADALAH CAPRICORN");
            }else if (tanggal > 19 && bulan == 1 || tanggal < 19 && bulan == 2 ) { 
                System.out.println("ZODIAK ANDA ADALAH AQUARIUS");
            }else if (tanggal > 18 && bulan == 2 || tanggal < 21 && bulan == 3 ){
                System.out.println("ZODIAK ANDA ADALAH PISCES");
            }else if (tanggal > 20 && bulan == 3 || tanggal < 20 && bulan == 4 ){
                System.out.println("ZODIAK ANDA ADALAH ARIES");
            }else if (tanggal > 19 && bulan == 4 || tanggal < 21 && bulan == 5 ){
                System.out.println(" ZODIAK ANDA ADALAH TAURUS");
            }else if (tanggal > 20 && bulan == 5 || tanggal < 21 && bulan == 6 ){
                System.out.println("ZODIAK ANDA ADALAH GEMINI");
            }else if (tanggal > 20 && bulan == 6 || tanggal < 23 && bulan == 7 ){
                System.out.println("ZODIAK ANDA ADALAH CANCER");
            }else if (tanggal > 22 && bulan == 7 || tanggal < 23 && bulan == 8 ){
                System.out.println("ZODIAK ANDA ADALAH LEO");
            }else if (tanggal > 22 && bulan == 8 || tanggal < 23 && bulan == 9 ){
                System.out.println("ZODIAK ANDA ADALAH VIRGO");
            }else if (tanggal > 22 && bulan == 9 || tanggal < 23 && bulan == 10 ){
                System.out.println("ZODIAK ANDA ADALAH LIBRA");
            }else if (tanggal > 22 && bulan == 10|| tanggal < 22 && bulan == 11 ){
                System.out.println("ZODIAK ANDA ADALAH SCORPIO");
            }else if (tanggal > 21 && bulan == 11|| tanggal < 22 && bulan == 12 ){
                System.out.println("ZODIAK ANDA ADALAH SAGITARIUS");
         
            }else{
                System.out.println("input tidak dikenali");
            
            
    
            
            
        
            
            
            
        
            
            
         
                 
            }
        }
    }
    
}
