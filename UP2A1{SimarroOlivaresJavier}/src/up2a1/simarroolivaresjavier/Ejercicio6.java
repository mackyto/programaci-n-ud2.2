/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package up2a1.simarroolivaresjavier;

/**
 *6.  Escribe un programa que declare e inicialice las variables y constantes necesarias
 *    para calcular una nómina. Se debe obtener el total de horas mensuales, el salario
 *    base, la retención de la seguridad social y el salario neto. Considera los siguientes
 *    valores:
 *
 *        a. Cada hora se paga a 7.5 euros.
 *        b. Cada jornada tiene 8 horas.
 *        c. Se trabajan 30 días al mes.
 *        d. La retención de la seguridad social es del 6.4%
 * 
 *    @author macky
 */
public class Ejercicio6 {
        public static void main(String[] args) {
            double HORA=7.5;
            double JORNADA=8.0;
            int DIAS=30;
            double RETENCION=6.4;
            double neto;
            double bruto;
            bruto=HORA*JORNADA*DIAS;
            neto=bruto-((bruto*RETENCION)/100);
            System.out.println("Precio Hora "+HORA);     
            System.out.println("Horas por dia "+JORNADA);
            System.out.println("Dias por mes "+DIAS);
            System.out.println("Retencion "+RETENCION);
            System.out.println("Sueldo Bruto "+bruto);
            System.out.println("Sueldo Neto "+neto);
    }
}
