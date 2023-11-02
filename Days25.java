
package days.pkg25;

import java.util.Scanner;

public class Days25 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
       
        System.out.println("Selamat datang di aplikasi xx! ");
        System.out.println("Masukkan nama pengguna: ");
        String username = input.nextLine();
        System.out.println("Masukkan kata sandi: ");
        String password = input.nextLine();
        
        if (username.isEmpty() || password.isEmpty()){
            System.out.println("Username atau kata sandi tidak boleh kosong. Silahkan coba lagi. ");
        }else if (username.length() < 5 || password.length() < 8){
            System.out.println("Username harus memiliki minimal 5 karakter dan kata sandi minimal 8 karakter. ");
        }else{
            System.out.println("Akun telah berhasil dibuat!");
        }
       
    }
    
}

    
