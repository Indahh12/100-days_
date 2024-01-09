
package day.pkg93;
public class Day93 {
    public static void main(String[] args) {
       String buah [] = {"mangga","pisang","durian","apel","anggur","rambutan"};
        int i = 0;
        while (i < buah.length){
            if (i % 2 == 1){
                System.out.println(buah[i]);

            }
            i++;
        }
    }
    
}
