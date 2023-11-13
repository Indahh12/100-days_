
package day.pkg36;
public class Day36 {
    public static void main(String[] args) {
        
        //Mencetak angka ganjil 1-200 menggunakan do while
        int angka = 1;
        
        do {
            if (angka % 2 != 0){
                System.out.println(angka);
            }
            angka++;
            
        } while (angka <=200);
    }
    
}
