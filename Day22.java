
package day.pkg22;

public class Day22 {
    public static void main(String[] args) {
        
        //Harga barang 
    double hargaBarang = 100.0;
    
    //Diskon (jika ada)
    double diskon = 10.0; //misalnya 10 %
    
    //Menghitung harga setelah diskon 
    double hargaSetelahDiskon = hargaBarang - (hargaBarang * (diskon / 100));
    
        System.out.println("harga barang: " + hargaBarang);
        System.out.println("Diskon: " + diskon + "%");
        System.out.println("Harga setelah diskon: " + hargaSetelahDiskon);
            }
    
}
