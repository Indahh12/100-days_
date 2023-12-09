
package day.pkg62;


public class Day62 {

    public static void main(String[] args) {
       int[][][] angka = {
            {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}},
            {{10, 11, 12}, {13, 14, 15}, {16, 17, 18}},
            {{19, 20, 21}, {22, 23, 24}, {25, 26, 27}}
        };
        for (int i = 0; i < angka.length; i++) {
            for (int j = 0; j < angka[i].length; j++) {
                for (int k = 0; k < angka[i][j].length; k++) {
                    System.out.print(angka[i][j][k] + " ");
                }    
        }
        
    }
    }
    
}
