/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package up2a3.simarroolivaresjavier;
import java.util.Scanner;

// import java.util.Formatter;

/**
 * 
 * 4. La dirección de un parque quiere conocer el área de una fuente circular.
 *    El programa pedirá el radio al usuario y calculará el área usando Math.PI
 *    y Math.pow.
 * 
 * 
 * La Clase fundamental Math es una clase que ofrece una serie
 * de operaciones y constantes mátematica de java para facilitar
 * la realización de calculos complejos en la programación, aparte de 
 * las primitivas del lenguaje: suma, resta, multiplicación y división
 * así como los operadores lógicos.
 * Math.sqrt es la función para la realización de raizes cuadradas.
 * 
 * 
 * Clase Math metodos más comunes
 * 
 * 
 * abs(x): Devuelve el valor absoluto de x.
 * 
 * ceil(x): Devuelve el entero más pequeño que es mayor o igual a x.
 * 
 * floor(x): Devuelve el entero más grande que es menor o igual a x.
 * 
 * max(x, y): Devuelve el mayor de x e y.
 * 
 * min(x, y): Devuelve el menor de x e y.
 * 
 * pow(x, y): Devuelve x elevado a la potencia de y.
 * 
 * random(): Devuelve un número aleatorio entre 0 y 1.
 * 
 * round(x): Devuelve el entero más cercano a x.
 * 
 * sqrt(x): Devuelve la raíz cuadrada de x.
 * 
 * 
 * Las constantes mas utilizadas:
 * 
 * 
 * E: el número de Euler (2.718281828459045)
 * 
 * PI: el número pi (3.141592653589793)
 * 
 * 
 * 
 * @author Javier Simarro Olivares
 */ 

public class Ejercicio04 {
   
    public static void main(String[] args){
    
        Scanner keyld = new Scanner(System.in);                                                         // Define la instancia Scanner.
        
        System.err.println("Por favor introduce solo numeros con comas para decimales o dara error");   // Aviso de limitación de introducción de tipos.
        System.out.printf("\nSe procedera a calcular el area del circulo de la fuente");                // Imprime la operación del programa.
        
        System.out.printf("\n\nIntroduzcz el radio de la fuente en metros ");                           // Imprime mensaje de petición del radio.
        double radio = keyld.nextDouble();                                                              // Captura con la instancia keyld el radio introducido por teclado y lo carga en la variable radio.
        
        double areaCirculo = Math.PI*Math.pow(radio,2);                                                 // Define la variable AreaaCirculo y resuelve el perimetro con el valor de π obtenido con la funcion Math.PI
                                                                                                        // y elevando el radio al cuadrado con la función Math.pow ambas de la clase Math.
        
        System.out.printf("\nEl area del circulo es %.3fmts2.\n\n",areaCirculo);                        // Imprime el resultado
        
    }
    
}
