/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package up2a1.simarroolivaresjavier;

/**
 *7.  Desarrolla un programa que convierta un número de segundos en su equivalente en
 *    horas, minutos y segundos.
 *    @author macky
 */
public class Ejercicio7 {
        public static void main(String[] args) {
            int segundos =1874635640;
            int minutos;
            int horas;
            double x; 
            horas=segundos/3600;
            minutos=segundos%3600;
            segundos=minutos%60;
            minutos/=60;
            System.out.println(horas+" horas");
            System.out.println(minutos+" minutos");
            System.out.println(segundos+" segundos");
    }    
}
