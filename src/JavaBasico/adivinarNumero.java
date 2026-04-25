package JavaBasico;

    class GuessGame {
        Player p1;
        Player p2;
        Player p3;

        public void startGame() {

            p1 = new Player();
            p2 = new Player();
            p3 = new Player();

            int guessp1 = 0;
            int guessp2 = 0;
            int guessp3 = 0;

            boolean p1isRight = false;
            boolean p2isRight = false;
            boolean p3isRight = false;

            int targetNumber = (int) (Math.random() * 10);

            System.out.println("Estoy pensando en un número entre 0 y 9...");

            while(true) {

                System.out.println("El número a adivinar es " + targetNumber);

                p1.guess();
                p2.guess();
                p3.guess();

                guessp1 = p1.number;
                System.out.println("El jugador uno adivinó " + guessp1);

                guessp2 = p2.number;
                System.out.println("El jugador dos adivinó " + guessp2);

                guessp3 = p3.number;
                System.out.println("El jugador tres adivinó " + guessp3);

                if (guessp1 == targetNumber) {
                    p1isRight = true;
                }

                if (guessp2 == targetNumber) {
                    p2isRight = true;
                }

                if (guessp3 == targetNumber) {
                    p3isRight = true;
                }

                if (p1isRight || p2isRight || p3isRight) {
                    System.out.println("¡Tenemos un ganador!");
                    System.out.println("¿El jugador uno acertó? " + p1isRight);
                    System.out.println("¿El jugador dos acertó? " + p2isRight);
                    System.out.println("¿El jugador tres acertó? " + p3isRight);
                    System.out.println("El juego terminó.");
                    break; // termina el juego, sale del bucle
                } else {
                    // seguimos porque nadie acertó
                    System.out.println("Los jugadores tendrán que intentar otra vez.");
                } // fin if/else

            } // fin del bucle
        } // fin del método
    } // fin de la clase
    class Player {
        int number = 0; // where the guess go
        public void guess() {
            number = (int) (Math.random() * 10);
            System.out.println("I’m guessing"
                    + number);
        }
    }
    class GameLauncher {
        public static void main(String[] args) {
            GuessGame game = new GuessGame();
            game.startGame();
        }
    }
