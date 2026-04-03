package JavaBasico;
import java.util.Scanner;

public class ContarNumerosBucle {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("ingrese un numero para contar hasta el");
        int NumeroparaContar= Integer.parseInt(sc.nextLine());
       // int i = 0;
       // while ( i < NumeroparaContar){
       //     System.out.print(i);
       //     i++;
       // }
        for (int i=0; i<NumeroparaContar;i++){
            System.out.print(i);
        }
    }
}
