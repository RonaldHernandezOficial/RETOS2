import java.util.Random;
import java.util.Scanner;

public class reto1{
    public static void main(String[] args) {
        //Declarar variables
        String nombre;
        double saldo;
        int numJuegos = 0;
        double valorApuesta;
        double gananciasTotales = 0;
        double perdidasTotales = 0;

        //Instanciar clases
        Scanner lectura=new Scanner(System.in);
        Random random=new Random();

        System.out.println("Ingresa tu nombre por favor: ");
        nombre = lectura.nextLine();

        System.out.println("Ingresa tu saldo inicial 100000: ");
        saldo = lectura.nextInt();
        saldo = saldo;

        System.out.println("Bienvenido a jugar el juego de Ahorcados, diviertete adivinando la palabra");

        System.out.println("El número de intentos que tienes son 10");
        numJuegos = lectura.nextInt();

        //Crear la condición
        for(int i = 0; i < numJuegos; i++){
            System.out.println(i+1);
        
            System.out.println(nombre + " tu saldo actual es: " + saldo);
            System.out.println("Ingresa el valor que quieres apostar: ");
            valorApuesta = lectura.nextDouble();
        
        if(valorApuesta > saldo){
            System.out.println("Lo siento, no tienes suficiente dinero para hacer la apuesta");
        } else {
            //Seleccionar la palabra a adivinar
            String[] palabras = {"programacion", "java", "computador", "algoritmo", "messi"};

            String palabraSeleccionada = palabras[random.nextInt(palabras.length)];

            String[] palabraAdivinada=new String[palabraSeleccionada.length()];
        
            for(int j = 0; j < palabraAdivinada.length; j++){
                palabraAdivinada[j] = "_";
            }
        
            //Iniciamos el contandor de intentos y aciertos
            int intentos = 10;
            int aciertos = 0;
        
            //Ciclo para saber si adivino la palabra o pierde intentos
            while(intentos > 0 && aciertos < palabraSeleccionada.length()){
                //Estado actual del juego
                System.out.println(String.valueOf(palabraAdivinada));
                System.out.println("Te quedan: " + intentos);
        
                //Ahora pediremos la letra
                System.out.println("Por favor ingresa una letra: ");

                String letra = lectura.next().toLowerCase();
        
                //Verificaremos si la letra ingresada esta en la palabra
                boolean acierto = false;
                for(int m = 0; m < palabraSeleccionada.length(); m++){
                    if(palabraSeleccionada.charAt(m) == letra.charAt(0)){
                        palabraAdivinada[m] = letra;
                        aciertos ++;
                        acierto = true;
                    }
                }
        
                // Restar un intento si no se adivinó la letra
                if(!acierto){
                    intentos--;
                    System.out.println("Lo siento, no adivinaste la letra, te quedan: " + intentos + "intentos");
                }else{
                    System.out.println("Felicidades adivinaste, te quedan " + intentos + " intentos ");
                }
            }
        
            //Actualizar saldo del jugador
            if(aciertos == palabraSeleccionada.length()){
                saldo += valorApuesta * 2;
                gananciasTotales += valorApuesta * 2;
                System.out.println("¡Felicitaciones! Adivinaste la palabra y ganaste: " + valorApuesta * 2);
            } else {
                saldo -= valorApuesta;
                perdidasTotales += valorApuesta;
                System.out.println("Lo siento, no adivinaste la palabra");
            }

            System.out.println("La palabra era: " + palabraSeleccionada);
        }
    }

    //Limpiar el buffer
     lectura.close();
    }
}