
package day.pkg67;

import java.util.Arrays;

public class Day67 {

    public static void main(String[] args) {
         int nomor [] = {1,4,6,2,3,9,8,6,10,5};
        String nama [] = {"indah","indri","uma","cinta","randi","kaila","putra","manni","gibran","budi"};

        for (int i = 0; i < 10; i++) {
            Arrays.sort(nomor);
            Arrays.sort(nama);
            System.out.println(nomor[i]+ "." + " " + nama[i]);
    }
    
}
}