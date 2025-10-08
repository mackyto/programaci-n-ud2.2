/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package up2a2.simarroolivaresjavier;
import java.util.Scanner; // Llamada a la clase Scanner.

/**
 * 
 * 2. Convierte una temperatura en grados Celsius a Kelvin, utilizando la fórmula apropiada,
 * partiendo de la temperatura dada por el usuario.
 * 
 * @author Javier Simarro Olivares
 */

public class Ejercicio02 {

    public static void main(String[] args){

        Scanner keyld = new Scanner(System.in); // Se instansia el objeto keyboar-load (keyld) de entrada por teclado hasta salto de linea.

        System.err.println("Por favor introduce solo números con comas para decimales o dará error"); // Aviso de limitación de introducción de tipos.
        System.out.print("\n\n\n");
        
        System.out.print("Indica una temperatura en grados celsius para calcular su valor en kelvin y fahrenheit "); // 
        Double celsius =  keyld.nextDouble();

        System.out.printf("\n\n%.3fº Celsius" , celsius);
        System.out.printf(" son %.3fº kelvin" , celsius+273.15);
        System.out.printf(" y son %.3fº fahrenheit\n\n\n", (celsius*9/5)+32);

    }
  
}
