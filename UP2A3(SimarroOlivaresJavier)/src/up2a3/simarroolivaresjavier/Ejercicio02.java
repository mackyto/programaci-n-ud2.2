/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package up2a3.simarroolivaresjavier;
import java.util.Scanner; // Importa la clase Scanner
import java.text.DecimalFormat; // importa la clase DecimalFormat

/**
 *
 * 2. Una empresa química necesita calcular una magnitud representada por la siguiente fórmula matemática basada en concentraciones:
 *                   
 *                          𝑹=(𝒄𝟏+𝒄𝟐)∗(𝒄𝟑−𝒄𝟒)/𝟐
 * 
 * Donde c1, c2, c3 y c4 son concentraciones introducidas por el usuario como valores decimales.
 * El programa debe imprimir por pantalla el resultado con dos decimales.
 * 
 * 
 * @author Javier Simarro Olivares
 */
public class Ejercicio02 {
    
    public static void main(String[] args){
    
        Scanner keyld=new Scanner(System.in); // Define la instancia para la lectura del teclado keyld.
        DecimalFormat df=new DecimalFormat("#.00"); // Define la instancia del formato con dos decimales df 
        System.err.println("Por favor introduce solo números como decimales o dará error"); // Aviso de introduccion de tipos
        System.out.println("Se va a poceder a calcular la magnitud del aplicativo 2, para ello debe introducir cuatro concentraciones"); // Imprime instrucciones de Uso
        System.out.print("Introduce la primera concentracion 0."); // Solicita la primera concentración.
        double primeraConcentracion =Double.parseDouble("0."+keyld.nextLine()); // Carga el valor introducido por teclado en primeraConcentracion.
        System.out.print("Introduce la segunda concentracion 0."); // Solicita la primera concentración.
        double segundaConcentracion =Double.parseDouble("0."+keyld.nextLine()); // Carga el valor introducido por teclado en segundaConcentracion.
        System.out.print("Introduce la tercera concentracion 0."); // Solicita la tercera concentración.
        double terceraConcentracion =Double.parseDouble("0."+keyld.nextLine()); // Carga el valor introducido por teclado en terceraConcentracion.
        System.out.print("Introduce la cuarta concentracion 0."); // Solicita la cuarta concentración.
        double cuartaConcentracion =Double.parseDouble("0."+keyld.nextLine()); // Carga el valor introducido por teclado en cuartaConcentracion.        
        System.out.println("La magnitud resultante es "+df.format((primeraConcentracion+segundaConcentracion)*(terceraConcentracion-cuartaConcentracion)/2));
              
    }
    
}
