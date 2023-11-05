
package day.pkg28;

public class Day28 {

    public static void main(String[] args) {
        //Membuat array integer
        int [] numbers = {10, 20, 30, 40, 50};
        
        //Menghitung rata-rata elemen dalam array 
        int sum = 0;
        for (int i= 0; i < numbers.length; i++){
            sum += numbers[i];
        }
        
        
        double average = (double) sum / numbers.length;
        System.out.println("Rata-rata: " + average);
        
    }
    
}
