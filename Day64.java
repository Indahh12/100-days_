
package day.pkg64;


public class Day64 {

    public static void main(String[] args) {
       int array [] = {97,30,50,35,75};
        int elemenTerkecil = array[0];

        for (int i = 0; i < array.length; i++) {
            if(array[i] < elemenTerkecil){
                elemenTerkecil = array[i];
            }
        }
        System.out.println("elemen array terkecil : " + elemenTerkecil);
    }

    }
    

