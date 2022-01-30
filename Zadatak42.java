//42. Napisati funkciju koja proverava da li u nizu niski imena postoji "Marija" ili "Petar".

package Domaci1712;

public class Zadatak42 {
    public static void main(String[] args) {

        String[] niz = {"Stefan", "Marija", "Andjela", "Nikola", "Dusan"};

        if(ime(niz) == true){
            System.out.println("U vasem nizu se nalazi osoba sa imenom Marija ili Petar.");
        }
        else{
            System.out.println("U vasem nizu se ne nalazi osoba sa imenom Marija ili Petar.");
        }

    }

    public static boolean ime(String[] n){
        boolean imaImena = false;
        for(int i = 0; i < n.length; i++){
            if(n[i] == "Marija" || n[i] == "Petar"){
                imaImena = true;
                break;
            }
            else{
                imaImena = false;
            }
        }
        return  imaImena;
    }


}

