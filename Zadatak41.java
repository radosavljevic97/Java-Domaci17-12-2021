//41. Napisati funkciju koja racuna prosecnu vrednost double[] niza.

package Domaci1712;

public class Zadatak41 {

    public static void main(String[] args) {

        double[] niz = {2, 4, 5, 7, 11, 17, 19};
        System.out.println("Prosecna vrednost zadatog niza je " + prosecnaVrednostNiza(niz));
    }

    public static double prosecnaVrednostNiza(double[] x){
        double suma = 0;
        double prosecnaVrednost = 0;
        for( int i = 0; i < x.length; i++){
            suma = suma + x[i];
            prosecnaVrednost = suma / x.length;
        }
        return prosecnaVrednost;
    }



}

