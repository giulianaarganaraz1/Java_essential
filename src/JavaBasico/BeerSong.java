package JavaBasico;

public class BeerSong {
    public static void main (String[] args) {
        int beerNum = 99;

        while (beerNum > 0) {
            String word = (beerNum == 1) ? "bottle" : "bottles";

            System.out.println(beerNum + " " + word + " de cerveza en la pared");
            System.out.println(beerNum + " " + word + " de cerveza.");
            System.out.println("Baja una.");
            System.out.println("Pásala.");

            beerNum = beerNum - 1;


        if (beerNum > 0) {
                word = (beerNum == 1) ? "bottle" : "bottles";
                System.out.println(beerNum + " " + word + " de cerveza en la pared");
            } else {
                System.out.println("No hay más botellas de cerveza en la pared");
            } // fin del else

        } // fin del while
    } // fin del main
} // fin de la clase

