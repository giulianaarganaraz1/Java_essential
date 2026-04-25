package JavaBasico;

import java.util.ArrayList;
import java.util.Scanner;

public class recorrerCatalogoCafesArray {
    public static void main(String[] args){

        ArrayList<String> listaProductos = new ArrayList<>();

        listaProductos.add("Café Premium Molido");
        listaProductos.add("Té Verde Orgánico");
        listaProductos.add("Chocolate Amargo 80%");

        listaProductos.remove("Chocolate Amargo 80%");
        listaProductos.add("Cafe descafeinado");

        System.out.print("Bienvenido a nuestra Cafeteria, este es nuestro catalago 😀😁");

        for (String producto : listaProductos) {
            System.out.println(producto);
        }

        Scanner sc = new Scanner(System.in);
        



    }
}
