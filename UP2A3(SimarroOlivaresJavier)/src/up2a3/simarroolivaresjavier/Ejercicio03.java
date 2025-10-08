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
 * @author 29160712r
 */
public class Ejercicio03 {

    public static void main(String[] args){
        

        Scanner keyld=new Scanner(System.in);                                                 

        System.err.println("¡¡¡Aviso!!! introduce solo numeros positivos o dará error");
        System.out.print("Calculo de raizes cuadradas, Introduce el numero ");

        double numero=keyld.nextDouble();

        System.out.println("La raiz cuadrada de " + numero + " es " + Math.sqrt(numero));
    
    }

    
}
