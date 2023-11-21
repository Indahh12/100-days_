
package day.pkg44;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day44 {
    public static void main(String[] args) throws IOException {
        String nama;
        String alamat;
        int umur;
        
        
        InputStreamReader isr = new InputStreamReader (System.in);
        BufferedReader br = new BufferedReader (isr);
        
        System.out.println("Masukkan nama anda: ");
        nama = br.readLine();
        
        System.out.println("Masukkan alamat anda: ");
        alamat = br.readLine();
        
        System.out.println("Masukkan umur anda: ");
        umur = br.read();
        
        
    }
    
}
