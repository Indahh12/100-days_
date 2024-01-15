
package day.pkg99;

public class Day99 {

   
        // Metode dengan dua parameter bertipe data double
    static double hitungLuasSegitiga(double alas, double tinggi) {
        return 0.5 * alas * tinggi;
    }

    public static void main(String[] args) {
        // Panggil metode hitungLuasSegitiga dengan parameter dan cetak hasilnya
        double luasSegitiga = hitungLuasSegitiga(5.0, 8.0);
        System.out.println("Luas segitiga: " + luasSegitiga);
    }
    
}
