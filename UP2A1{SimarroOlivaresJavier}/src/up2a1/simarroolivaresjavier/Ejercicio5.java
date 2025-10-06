/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package up2a1.simarroolivaresjavier;

/**
 *5.  Implementa un conversor de euros a dólares y libras esterlinas usando tipos de
 *    cambio fijos. Los tipos de cambio se definirán como constantes.
 *    @author macky
 */
public class Ejercicio5 {
        public static void main(String[] args) {
            double EURO_DOLARES=1.1726;
            double DOLAR_LIBRAS=0.74487324;
            double euros=35;
            double dolares;
            double libras;
            dolares=euros*EURO_DOLARES;
            libras=dolares*DOLAR_LIBRAS;
            System.out.println("Euros = "+euros);
            System.out.println("Dolar = "+dolares);
            System.out.println("Libras = "+libras);        
        }    
}
