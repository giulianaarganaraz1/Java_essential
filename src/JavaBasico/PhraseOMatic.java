package JavaBasico;

public class PhraseOMatic {
    public static void main (String[] args) {

        // crear tres listas de palabras para elegir (¡agregá las tuyas!)
        String[] wordListOne = {"24/7","multiTier","30,000 foot","B-to-B","win-win","frontend","web-based","pervasive","smart","sixsigma","critical-path","dynamic"};

        String[] wordListTwo = {"empowered", "sticky",
                "value-added", "oriented", "centric", "distributed",
                "clustered", "branded","outside-the-box", "positioned",
                "networked", "focused", "leveraged", "aligned",
                "targeted", "shared", "cooperative", "accelerated"};

        String[] wordListThree = {"process", "tippingpoint", "solution", "architecture", "core competency",
                "strategy", "mindshare", "portal", "space", "vision",
                "paradigm", "mission"};

        String[]wordListEmotion= { "happy","afraid","sad","hot","amused","bored","anxiouns","cold"
        };

        // averiguar cuántas palabras hay en cada lista
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;
        int fourLength = wordListEmotion.length;

        // generar tres números aleatorios
        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);
        int rand4 = (int) (Math.random()* fourLength);

        // construir una frase
        String phrase = wordListOne[rand1] + " " +
                wordListTwo[rand2] + " " +
                wordListThree[rand3]+ " "+wordListEmotion[rand4];

        // imprimir la frase
        System.out.println("Lo que necesitamos es una " + phrase);

    }
}