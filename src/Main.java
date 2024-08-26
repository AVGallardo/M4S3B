import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 101;
        float signo;
        int zeros = 0;
        int positive = 0;
        int negative = 0;

        while( number > 100 ) {
            System.out.println("Ingrese un número del 1 al 100");
            number = sc.nextInt();

            if (number > 100 ) {
                System.out.println("--------------ERROR");
            } else {
                System.out.print((number % 2 == 0) ? ("Pares: " + number/2 + " Impares: "+ number/2) : ("Pares: " + number/2 + " Impares: "+ (number/2 + 1)));
            }
        }

        for( int i = 1; i <= 10; i++ ) {
            System.out.println(" ");
            System.out.println("Introduce número: ");
            number = sc.nextInt();
            signo = Math.signum(number);

            if ( signo == 0 ) {
                zeros = zeros + 1;
            } else if ( signo == 1 ) {
                positive = positive + 1;
            } else if ( signo == -1 ) {
                negative = negative + 1;
            }
        }
        System.out.println("El numero de ceros: " + zeros);
        System.out.println("El numero de positivos: " + positive);
        System.out.println("El numero de negativo: " + negative);
    }
}