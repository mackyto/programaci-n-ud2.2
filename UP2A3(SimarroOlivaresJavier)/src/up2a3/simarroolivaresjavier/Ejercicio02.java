/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package up2a3.simarroolivaresjavier;

import java.util.Scanner; // Importa la clase Scanner

/**
 *
 * 2. Una empresa química necesita calcular una magnitud representada por la
 * siguiente fórmula matemática basada en concentraciones:
 *
 * 𝑹=(𝒄𝟏+𝒄𝟐)∗(𝒄𝟑−𝒄𝟒)/𝟐
 *
 * Donde c1, c2, c3 y c4 son concentraciones introducidas por el usuario como
 * valores decimales. El programa debe imprimir por pantalla el resultado con
 * dos decimales.
 *
 *
 * @author Javier Simarro Olivares
 */
public class Ejercicio02 {

    public static void main(String[] args) {

        Scanner keyld = new Scanner(System.in);                                                                                           // Define la instancia para la lectura del teclado keyld.
     
        System.err.println("Por favor introduce solo números como decimales o dará error");                                               // Aviso de introduccion de tipos
        System.out.println("Se va a poceder a calcular la magnitud del aplicativo 2, para ello debe introducir cuatro concentraciones");  // Imprime instrucciones de Uso

        System.out.print("Introduce la primera concentracion ");                                                                          // Solicita la primera concentración.
        double concentA = keyld.nextDouble();                                                                                       // Carga el valor introducido por teclado en primeraConcentracion.

        System.out.print("Introduce la segunda concentracion ");                                                                          // Solicita la primera concentración.
        concentA += keyld.nextDouble();                                                                                      // Carga el valor introducido por teclado de la segundaConcentracion en concentracionA.

        System.out.print("Introduce la tercera concentracion ");                                                                          // Solicita la tercera concentración.
        double concentB = keyld.nextDouble();                                                                                        // Carga el valor introducido por teclado en terceraConcentracion.

        System.out.print("Introduce la cuarta concentracion ");                                                                           // Solicita la cuarta concentración.
        concentB -= keyld.nextDouble();                                                                                       // Carga el valor introducido por teclado en cuartaConcentracion.        

        System.out.printf("La magnitud resultante es %.4f %n %n", concentA * concentB / 2);                                             // Imprime el Resultado

    }

}
