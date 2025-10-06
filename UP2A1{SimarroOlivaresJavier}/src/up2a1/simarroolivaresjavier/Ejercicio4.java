/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package up2a1.simarroolivaresjavier;

/**
 *4.  Desarrolla una calculadora de Índice de Masa Corporal (IMC) utilizando el peso en
 *    kilogramos y la altura en metros (double). Los datos se definen en variables y el
 *    resultado se almacena en otra variable diferente.
 *    @author macky.
 */
public class Ejercicio4 {
        public static void main(String[] args) {
            double peso = 70.0;
            double altura = 1.75;
            double imc;
            imc = peso/(altura*altura);
            System.out.println(imc);
    }    
}
