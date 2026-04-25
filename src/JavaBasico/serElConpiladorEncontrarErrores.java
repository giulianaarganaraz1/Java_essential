package JavaBasico;

public class serElConpiladorEncontrarErrores {
    public static void main(String[] args){
        System.out.println("Clase principal");
    }
}

class CExercise1b {
    public static void main(String[] args){
        int x = 5;
        while ( x > 1 ) {
            x = x - 1;
            if ( x < 3) {
                System.out.println("x chico");
            }
        }
    }
}

class AExercise1b {
    public static void main(String [] args) {
        int x = 1;
        while ( x < 10 ) {
            x = x + 1;
            if ( x > 3) {
                System.out.println("x grande");
            }
        }
    }
}

class BExercise1b {
    public static void main(String [] args) {
        int x = 5;
        while (x > 1) {
            x = x - 1;
            if (x < 3) {
                System.out.println("x chico");
            }
        }
    }
}