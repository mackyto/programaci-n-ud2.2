/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package up2a1.simarroolivaresjavier;

/**
 *3.  Escribe un programa que inicialice una variable con el valor 3 e inicialice una segunda
 *    cuyo valor será el resultado de primero sumar uno a la variable previa y después
 *    cinco a ese resultado.
 *    @author macky
 */
public class Ejercicio3 {
        public static void main(String[] args) {
            int x =3;
            int resultado =5;
            resultado += ++x;
            System.out.println(resultado);
    }   
}
