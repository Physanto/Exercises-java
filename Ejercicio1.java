/*
 *@author Manuel Figueroa
 */

import java.util.Scanner;

public class Ejercicio1{

    public static void main(String[] args){
        
        // ALGORITHM: Send greeting to person.

        Scanner stdin = new Scanner(System.in);
        
        System.out.print("Saludar a la persona cuando ingrese su nombre.\n\n");

        System.out.print("Ingresa tu nombre: ");
        String name = stdin.nextLine();
        
        System.out.println(sendGreeting(name));
    }

    /*
    * Send greeting the name entered to console.
    *
    * @param name is the name of a person.
    * @return a message greetings.
    */
    public static String sendGreeting(String name) { return "Hola " + name + " vamos aprender POO."; }
}

