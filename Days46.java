
package days.pkg46;

import java.util.Scanner;

public class Days46 {

    public static void main(String[] args) {
          Scanner sc = new Scanner (System.in);
        
        System.out.println("1.bakso");
        System.out.println("2.ayam goreng");
        System.out.println("3.pizza");
        System.out.println("4.burger");
        System.out.println("5.ayam bakar");
        System.out.println("Input makanan yang anda inginkan: ");
        int pilihanMakanan = sc.nextInt();
       
        
        
        switch (pilihanMakanan){
            case 1:
                System.out.println("Anda memilih bakso seharga 25k!");
                break;
            case 2:
                System.out.println("Anda memilih ayam goreng seharga 40k!");
                break;
            case 3: 
                System.out.println("Anda memilih pizza seharga 100k!");
                break;
            case 4:
                System.out.println("Anda memilih burger seharga 50k!");
                break;
            case 5:
                System.out.println("Anda memilih ayam bakar seharga 70k");
                break;
            default:
                System.out.println("Menu makanan yang anda pilih tidak tersedia!!");
                
                                
                
        }
        
        
    }
    
}

    
    

