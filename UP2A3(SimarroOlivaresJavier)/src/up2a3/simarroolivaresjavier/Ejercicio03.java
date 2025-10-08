/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package up2a3.simarroolivaresjavier;
import java.util.Scanner;

/**
 *
 * 3. Desarrolla un programa que calcule la raíz cuadrada de un número positivo introducido por el usuario.
 *    El resultado debe mostrarse por pantalla, y el cálculo debe incluir un comentario explicando qué hace Math.sqrt.
 * 
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
public class Ejercicio03 {

    public static void main(String[] args){
        

        Scanner keyld=new Scanner(System.in);                                                 // 
                                                                                              //   La Clase fundamental Math es una clase que ofrece una serie
                                                                                              // de operaciones y constantes mátematica de java para facilitar
        System.err.println("¡¡¡Aviso!!! introduce solo numeros positivos o dará error");      // la realización de calculos complejos en la programación, aparte de 
        System.out.print("Calculo de raizes cuadradas, Introduce el numero ");                // las primitivas del lenguaje: suma, resta, multiplicación y división
                                                                                              // así como los operadores lógicos.
        double numero=keyld.nextDouble();                                                     //  
                                                                                              //   Math.sqrt es la función para la realización de raizes cuadradas.
        System.out.println("La raiz cuadrada de " + numero + " es " + Math.sqrt(numero));     // 
    
    }

    
}
