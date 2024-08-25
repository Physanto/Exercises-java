/*
 * by: Manuel Figueroa
 */

import java.util.Scanner;

public class CelsiusToFahrentheit{
    
    /* Algoritmo para convertir de grados celsius a fahrentheit */

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa los grados celsius: ");
        int celsius = sc.nextInt();

       System.out.println(celsius + " grados celsius es igual a " + ConvertCelsiusToFahrent(celsius) + " grados fahrentheit"); 
       
    }

    public static float ConvertCelsiusToFahrent(float celsius){

        float fahrentheit = 32 + (9 * celsius / 5);

        return fahrentheit;

    }
}
