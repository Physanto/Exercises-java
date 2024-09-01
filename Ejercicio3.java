/*
 *@author Manuel Figueroa
 */

import java.util.Scanner;

public class Ejercicio3{

    public static void main(String[] args){
        
        // ALGORITHM: show double and triple of a number

        Scanner stdin = new Scanner(System.in);
        
        System.out.print("Mostrar el doble y triple del número digitado.\n\n");

        System.out.print("Ingresa un número: ");
        int number = stdin.nextInt();
        
        System.out.println(doubleAndTripleNumber(number));
    }

    /*
    * Show the double and triple of a number
    *
    * @param number is the number for show
    * @return a message showing the double and triple {@code number}
    */
    public static String doubleAndTripleNumber(int number) { return "El doble del número digitado es: " + (number * 2) + "\nEl triple del número digitado es: " + (number * 3); }
}
