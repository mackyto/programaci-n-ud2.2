/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package up2a3.simarroolivaresjavier;
import java.util.Scanner;

/**
 *
 * 6. Desarrolla un programa que calcule una estimación simple de la huella de carbono mensual de una persona basándose en:
 *
 *          a. Kilómetros recorridos en coche (0.2 kg CO2 por km)
 *
 *          b. Consumo eléctrico en kWh (0.4 kg CO2 por kWh)
 * 
 *          c. Consumo de gas natural en m³ (2.1 kg CO2 por m³)
 *
 *    Estos datos deben introducirse por teclado.
 * 
 * @author Javier Simarro Olivares
 */

public class Ejercicio07 {

    public static void main(String[] args){
    
        Scanner keyld = new Scanner(System.in);                                                                         // Definicion de instancia de carga por teclado keyboard load (keyld).

        System.err.println("Por favor intoduzca solo numeros con comas para los decimales o dara error");               // Define la limitacion de entrada de parametros.
        
        System.out.printf("\n————————————————————————————————————————————————————————————————————————————\n");          // #############################
                                                                                                                        // # 
        System.out.printf("Se va a proceder a calcular la huella de carbono mensual de un ciudadano\ntomamdo de base:");// # 
        System.out.printf("\n\n\ta. - Los kilómetros recorridos en coche sumando 0.2 kg CO2 por km");                   // # Descripción de la operación
        System.out.printf("\n\n\tb. - El consumo eléctrico en kWh siendo 0.4 kg CO2 por kWh");                          // # del programa.
        System.out.printf("\n\n\tc. - El consumo de gas natural en m³ con un valor de 2.1 kg CO2 por m³");              // # 
                                                                                                                        // # 
        System.out.printf("\n\n————————————————————————————————————————————————————————————————————————————\n");        // #############################
 
        System.out.printf("\nIntroduce los kilometros recorridos en coche este mes: ");                                 // Solicita los kilometros recorridos este mes.
        double carbono = 0.2 * keyld.nextDouble();                                                                      // Calcula la huella de carbono procedente del uso del vehiculo y lo guarda en carbono.
        
        System.out.printf("\nIntroduce el consumo en KW del ultimo mes: ");                                             // Solicita el consumo de KW del ultimo mes.
        carbono += 0.4 * keyld.nextDouble();                                                                            // Calcula la huella de carbono del consumo de electricidad y sumalo al valor anterio de carbono.
        
        System.out.printf("\nIntroduce el consumo de gas en m3 del ultimo mes: ");                                      // Solicita el consumo de gas
        carbono += 2.1 * keyld.nextDouble();                                                                            // Calcula su hueaal de carbono y añadelo a carbono

        System.out.printf("\n————————————————————————————————————————————————————————————————————————————\n\n");        // Imprime Separador
        System.out.printf("El total de huella de carbono del mes pasado es de %.2fg\n\n",carbono);                      // Imprime resultado
        
        
    }
    
}
