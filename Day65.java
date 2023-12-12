
package day.pkg65;

public class Day65 {

    public static void main(String[] args) {
      
        
        int[] array = {2, 6, 12, 200, 42, 32, 24 };

        // Variabel untuk menyimpan elemen terbesar
        int terbesar = array[0];

        // Iterasi melalui array untuk mencari elemen terbesar
        for (int i = 1; i < array.length; i++) {
            if (array[i] > terbesar) {
                terbesar = array[i];
            }
        }

                System.out.println("Elemen terbesar dalam array adalah: " + terbesar);
    }

}