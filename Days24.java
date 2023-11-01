
package days.pkg24;

import java.util.Scanner;

public class Days24 {

    
    public static void main(String[] args) {
        //Username dan password yang benar
        String username = "Indah";
        String password = "semangat ngoding";
        
        //Membaca input dari pengguna
        Scanner input = new Scanner (System.in);
        
        System.out.println("Masukkan username: ");
        String inputUsername = input.nextLine();
        
        System.out.println("Masukkan password");
        String inputPassword = input.nextLine();
        
        //Memeriksa apakah input pengguna cocok dengan username dan password yang benar
       if (inputUsername.equals(username) && inputPassword.equals(password)){
           System.out.println("Login berhasil selamat datang, " + username);
       }else{
           System.out.println("Login gagal! username atau password salah.");
            
        }
    }
    
}
