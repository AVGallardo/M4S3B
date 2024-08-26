import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 101;

        while( number > 100 ) {
            System.out.println("Ingrese un número del 1 al 100");
            number = sc.nextInt();

            if (number > 100 ) {
                System.out.println("--------------ERROR");
            } else {
                System.out.print((number % 2 == 0) ? ("Pares: " + number/2 + " Impares: "+ number/2) : ("Pares: " + number/2 + " Impares: "+ (number/2 + 1)));
            }
        }

    }
}