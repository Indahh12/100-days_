
package day.pkg15;

import java.util.Scanner;

public class Day15 {

    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
        System.out.println("Masukkan nama tumbuhan: ");
        String Jawaban = input.nextLine();
        
        if (Jawaban.equalsIgnoreCase("Mawar")){
            System.out.println("Tumbuhan ini berbunga");
        }else if (Jawaban.equalsIgnoreCase("Pakis")){
            System.out.println("Tumbuhan ini tidak berbunga");
        }else if (Jawaban.equalsIgnoreCase("Lumut")){
            System.out.println("Tumbuhan ini tidak berbunga");
        }else if (Jawaban.equalsIgnoreCase("Jamur")){
            System.out.println("Tumbuhan ini tidak berbunga");
        }else if (Jawaban.equalsIgnoreCase("Pohon Ek")){
            System.out.println("Tumbuhan ini berbunga");
        }else if (Jawaban.equalsIgnoreCase("Teratai")){
            System.out.println("Tumbuhan ini berbunga");
        }else if (Jawaban.equalsIgnoreCase("Tulip")){
            System.out.println("Tumbuhan ini berbunga");
        }else if (Jawaban.equalsIgnoreCase("Rumput laut")){
            System.out.println("Tumbuhan ini tidak berbunga");
        }else if (Jawaban.equalsIgnoreCase("Melati")){
            System.out.println("Tumbuhan ini berbunga");

            
        }else{
            System.out.println("Jawaban tidak diketahui");
           
        }
    }
    
}
