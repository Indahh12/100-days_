
package day.pkg77;

import java.util.Scanner;

public class Day77 {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan kecepatan (km/jam): ");
        double kecepatan = sc.nextDouble();

        System.out.print("Masukkan waktu (jam): ");
        double waktu = sc.nextDouble();

        double jarak = kecepatan*waktu;

        System.out.println("Jarak tempuh: " + jarak + " kilometer");

        sc.close();
    }
    
}
