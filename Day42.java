
package day.pkg42;
public class Day42 {
    public static void main(String[] args) {
        //Operator || pada kondisi switch
        
        int pilihan = 2;
        
        switch (pilihan){
            case 1:
            case 2:
                System.out.println("Pilihan 1 atau 2 terpenuhi.");
                break;
            case 3:
                System.out.println("Pilihan 3 terpenuhi.");
                break;
            default:
                System.out.println("Pilihan tidak terpenuhi");
        }
    }
    
}
