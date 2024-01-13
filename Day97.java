
package day.pkg97;

import java.util.Scanner;

public class Day97 {
  
          // method fungsi menampilkan angka terbesar

    static int angkaTerbesar(){
        Scanner sc = new Scanner (System.in);

        System.out.print("masukan angka X : ");
        int X = sc.nextInt();

        System.out.print("masukan angka Y : ");
        int Y = sc.nextInt();

        if (X > Y){
            return X;
        }else{
            return Y;
        }

    }
    public static void main(String[] args) {
        System.out.println("angka terbesar adalah " + angkaTerbesar());


    }
    
}
