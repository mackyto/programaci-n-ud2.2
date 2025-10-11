/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package up2a3.simarroolivaresjavier;

import java.util.Scanner;

/**
 * 
 * 5. Una empresa quiere validar si dos precios introducidos por el usuario son
 *    exactamente iguales. Si son iguales, el programa mostrará true, si no, false.
 *    Usa operadores lógicos y de comparación.
 * 
 * 
 * @author Javier Simarro Olivares
 */

public class Ejercicio05 {
        
    public static void main(String [] args){
    
        Scanner keyld =new Scanner(System.in);                                                                                          // 
                                                                                                                                        // 
        System.err.println("Por favor introduce solo números con comas para maximo dos decimales o dará error");                        // 
        System.out.printf("\nSe va a proceder a comparar dos precios con hasta dos decimales he indicar si son iguales\n\n");           // 
                                                                                                                                        // 
        System.out.print("Introduzca el primer precio ");                                                                               // 
        double precio1 = keyld.nextDouble();                                                                                            // 
                                                                                                                                        // 
        System.out.printf("\n\nIntroduzca el segundo precio ");                                                                         // 
        double precio2 = keyld.nextDouble();                                                                                            // 
                                                                                                                                        // 
        String mensaje = precio1 == precio2 ? "iguales" : "diferentes";                                                                 // Se comparan los precios y se envia el menjaje true false en español y adaptado a los requisitos 
                                                                                                                                        // 
        System.out.printf("\n\nLos precios introducidos de %.2f€ y %.2f€ son %s\n\n", precio1, precio2, mensaje);                       // Imprime el resultado
                
    }
        
}
