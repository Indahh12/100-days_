
package day.pkg12;
public class Day12 {
    public static void main(String[] args) {
        int nilaiUAS = 80 ;
        int nilaiTugas = 90;
        int nilaiQuiz = 75;
        int total = (nilaiUAS + nilaiTugas + nilaiQuiz)/3;
        System.out.println("nilai total: " + total);
        
        
        if (total >= 70){
            System.out.println("Anda lulus");
            
        } else if (total >= 50){
            System.out.println("Anda tidak lulus");
            
        }else{
            System.out.println("Anda lanngsung di DO ");
            
        }
      }
    
}
