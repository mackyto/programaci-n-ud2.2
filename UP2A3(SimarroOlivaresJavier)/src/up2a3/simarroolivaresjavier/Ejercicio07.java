/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package up2a3.simarroolivaresjavier;
import java.util.Scanner;

/**
 *
 * 7. Crea un programa que lea dos números. El primero será la base, y el segundo el exponente.
 *    Utiliza Math.pow para mostrar el resultado.
 * 
 * @author Javier Simarro Olivares
 */

public class Ejercicio07 {
    
    public static void main(String[] args){
    
        Scanner keyld = new Scanner(System.in);                                                                                     // Define la instancia keyld de captura de datos por teclado.
    
        System.err.println("¡¡¡AVISO!!! Introduce solo numeros o dara error. Ambos mumeros seran enteros.");                        // Aviso de limitacion de tipos.
        System.out.printf("\nSe va a calcular la potencia del numero X elevado al numero Y.");                                      // Mensaje explicacion funcionalidad del programa
        System.out.printf("\n————————————————————————————————————————————————————————————————————————————");                        // Imprime Separador
            
        System.out.printf("\n\nPor favor introduzca el numero base ");                                                              // Imprime mensaje solicitando el dato base
        int base = keyld.nextInt();                                                                                                 // Carga el dato introducido entero en la variable base
        
        System.out.printf("\n\nPor favor indique el exponente ");                                                                   // Imprime mesaje solicitando el exponente
        int exponente = keyld.nextInt();                                                                                            // Carga el dato introducido en la variable exponente
        
        double resultado = Math.pow(base, exponente);                                                                               // Calcula la potencia con la clase Math.pow(x,y) y el resultado lo pone en resultado.

        System.out.printf("\n————————————————————————————————————————————————————————————————————————————");                        // Imprime Separador        
        System.out.printf("\n\nLa base %d elevado al exponente %d da como resultado %.0f\n", exponente, base, resultado);           // Imprime resultado
        System.out.printf("\n————————————————————————————————————————————————————————————————————————————\n\n");                    // Imprime Separador
        
    }
    
}
