/*
 * @author Manuel Figueroa
 */

import java.util.Scanner;

public class Ejercicio5{

    //ALGORITHM: Check if the number is even or odd.

    public static void main(String[] args){

        Scanner stdin = new Scanner(System.in);

        System.out.print("Verificar si un número ingresado por consola es par o impar.\n\n");

        System.out.print("Ingresa un número: ");
        int number = stdin.nextInt();

       System.out.println(number + checkEvenOrOdd(number)); 
       
    }

    /*
    * Verify if the number is even or odd
    *
    * @param number is the number that will be verified.
    * @return a message that confirm if the number is even or odd.
    */
    public static String checkEvenOrOdd(int number) { return number % 2 == 0 ? " es par" : " es impar"; }
}
