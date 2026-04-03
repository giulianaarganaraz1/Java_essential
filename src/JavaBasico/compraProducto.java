package JavaBasico;
import java.util.Scanner;

public class compraProducto {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresá tu nombre: ");
        String nombreCliente = sc.nextLine();

        System.out.print("Ingresá cuantos productos quiere: ");
        int cantidadCliente = Integer.parseInt(sc.nextLine());

        int precioCortina= 500;

        int Totalcompra= precioCortina*cantidadCliente;// el precio por la cantidad que quiere el cliente
        double Descuento= Totalcompra*0.5;//descuento del 50% del total

        if (cantidadCliente == 100) {
            System.out.print("Felicidades!!!, se le aplicado un descuento del 50%, por hacer una comprar de 100 unidades ");
            double totalDescuento=Totalcompra-Descuento;//aplicamos el descuento al total de la compra
            System.out.println(nombreCliente + "El total de su compra es "+ totalDescuento );
        } else{
            System.out.println(nombreCliente + "El total de su compra es "+ Totalcompra );
        }

    }

}
