/*
 *@author Manuel Figueroa
 */

import java.util.Scanner;

public class Ejercicio2{

    public static void main(String[] args){
        
        // ALGORITHM: Verify if the age entered is older or younger.

        Scanner stdin = new Scanner(System.in);
        
        System.out.print("Verificar si la edad ingresada es mayor o menor de edad.\n\n");

        System.out.print("Ingresa la edad: ");
        byte age = stdin.nextByte();
        
        System.out.println(age + checkOlderOrYounger(age));
    }

    /*
    * Validate if the age entered is older or younger
    *
    * @param age is the number that equal age of a person
    * @return a message showing if is older or younger
    */
    public static String checkOlderOrYounger(int age) { return age >= 18 ? " Es mayor de edad" : " Es menor de edad"; }
}
