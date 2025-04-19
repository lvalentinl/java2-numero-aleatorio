import java.util.Random;
import java.util.Scanner;

public class NumeroAleatorio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(100);
        int intentos = 0;
        int intentosMaximo = 5;
        boolean intentoAdivinado = false;

        System.out.println("Ingrese un numero entre 0 y 100");
        int numeroIngresado = scanner.nextInt();

        System.out.println("El numero aleatorio es: " + numeroAleatorio);

        while (intentos < intentosMaximo){
            ++intentos;
            int intentosRestantes = intentosMaximo - intentos;
            String palabraIntentos = (intentosRestantes == 1)? "intento" : "intentos";

            if (numeroIngresado == numeroAleatorio){
                System.out.println("Lo Lograste en: " + intentos + " " + palabraIntentos);
                intentoAdivinado = true;
                break;
            }else {
                if (numeroIngresado < numeroAleatorio){
                    System.out.println("PISTA: El número es mayor... te queda " + intentosRestantes + " " + palabraIntentos);
                }else {
                    System.out.println("PISTA: El número es menor... te queda " + intentosRestantes + " " + palabraIntentos);
                }
                if (intentosRestantes == 0){
                    break;
                }else {
                    numeroIngresado = scanner.nextInt();
                }
            }
        }

        if (!intentoAdivinado){
            System.out.println("Se acabaron los intentos :(");
        }
        scanner.close();
    }
}
