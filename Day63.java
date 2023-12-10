
package day.pkg63;

public class Day63 {

    public static void main(String[] args) {
        System.out.println("hello world");
        int[][][] angka= new int[3][4][5];
        
        for (int i = 0; i < angka.length; i++) {
            for (int j = 0; j < angka[i].length; j++) {
                for (int k = 0; k < angka[i][j].length; k++) {
                    angka[i][j][k] = i + j + k;
                    System.out.print(angka[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
    
    

