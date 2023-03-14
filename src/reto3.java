import java.util.Scanner;

public class reto3 {
    public static void main(String[] args) {
        //Instanciar clases
        Scanner lectura=new Scanner(System.in);

        System.out.println("Ahora vamos a simular una maquina expendedora");

        //Instanciar matriz
        String[][] productos = new String[16][2];

        //Crear la condición
        // Permitir llenar la maquina con 16 nombres de productos y su respectivo precio
        for (int i = 0; i < productos.length; i++) {
            System.out.println("Por favor ingresa el nombre del producto en la posición " + (i+1) + ": ");
            productos[i][0] = lectura.nextLine();
            System.out.println("Por favor ingresa el precio del producto en la posición " + (i+1) + ": ");
            productos[i][1] = lectura.nextLine();
        }

        // Mostrar el catalogo de productos con el codigo del producto (posicion), nombre y precio de cada producto ingresado
        System.out.println("Código del producto | Nombre del producto | Precio del producto");
        for (int i = 0; i < productos.length; i++) {
            System.out.println(i + " | " + productos[i][0] + " | $" + productos[i][1]);
        }

        //Limpiar el bufffer
        lectura.close();
    }
}
