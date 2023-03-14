import java.util.Scanner;

public class reto2 {
    public static void main(String[] args) {
        // Declarar variables
        String palabra;
        int derecha;
        int izquierda = 0;
        
        // Instanciar array
         char[] palindromo;
        
        // Instanciar clases
        Scanner lectura = new Scanner(System.in);
        
        // Pedir al usuario que ingrese la palabra
        System.out.println("Ingrese la palabra que desea: ");
        palabra = lectura.nextLine();

        // Crear la condición
        palabra = palabra.toLowerCase(); // Convertir a minúsculas
        palabra = palabra.replace(" ", ""); // Eliminar espacios en blanco
        palindromo = palabra.toCharArray(); // Convertir a arreglo de caracteres
        derecha = palindromo.length - 1;
        
        // Verificar si es palíndromo
        while (izquierda < derecha) {
            if (palindromo[izquierda] == palindromo[derecha]) {
                derecha--;
                izquierda++;
            } else {
                System.out.println("La palabra no es un palíndromo");
                lectura.close();
                return; // Salir del programa
            }
        }
        System.out.println("La palabra si es un palíndromo");
        
        // Cerrar Scanner
        lectura.close();
    }
}