/*
 * by: Manuel Figueroa
 */

import java.util.Scanner;

public class NumberElevated{

    public static void main(String[] args){
        
        /*Algoritmo para mostrar el doble y triple de un numero */

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingresa un numero: ");
        int number = sc.nextInt();
        
        System.out.println(doubleAndTripleNumber(number));
    }

    public static String doubleAndTripleNumber(int number){
        
        return "El doble del numero digitado es: " + (number * 2) + "\nEl triple del numero digitado es: " + (number * 3);

    }
}
