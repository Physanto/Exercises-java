/*
 *author Manuel Figueroa
 */

import java.util.Scanner;

public class Ejercicio4{
    
    // ALGORITHM: Convert degrees celsius to fahrentheit

    public static void main(String[] args){

        Scanner stdin = new Scanner(System.in);

        System.out.print("Convertir de grados celsius a grados fahrentheit.\n\n");

        System.out.print("Ingresa los grados celsius: ");
        int celsius = stdin.nextInt();

       System.out.println(celsius + " grados celsius es igual a " + ConvertCelsiusToFahrent(celsius) + " grados fahrentheit"); 
       
    }

    /*
    * Convert degress celsius to fahrentheit
    *
    * @param celsius is the number in degress that will be converted.
    * @return the degress convert to fahrentheit
    */
    public static float ConvertCelsiusToFahrent(float celsius){

        float fahrentheit = 32 + (9 * celsius / 5);

        return fahrentheit;
    }
}