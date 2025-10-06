/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package up2a1.simarroolivaresjavier;

/**
 *9. Implementa un programa que calcule el área y perímetro de diferentes figuras
 *   geométricas (círculo, cuadrado y rectángulo). Utiliza la constante Math.PI cuando
 *   corresponda
 *   @author macky
 */
public class Ejercicio9 {
        public static void main(String[] args) {
            double PI=3.14159264;
            double ladoRadio=7;
            double areaCirculo;
            double areaCuadrado;
            double areaRectangulo;
            double perimetroCirculo;
            double perimetroCuadrado;
            double perimetroRectangulo;
            areaCirculo=2*PI*(ladoRadio/2);
            areaCuadrado=4*ladoRadio;
            areaRectangulo=((ladoRadio*2)+ladoRadio)*2;
            perimetroCirculo=PI*(ladoRadio/2)*(ladoRadio/2);
            perimetroCuadrado=ladoRadio*ladoRadio;
            perimetroRectangulo=(ladoRadio*2)*ladoRadio;
            System.out.println("El lado mide "+ladoRadio+"cm igual que el diametro, la base del rectangolo es el doble de la altura que es igual al lado y diametro");
            System.out.println("el perimetro del circulo es "+areaCirculo+"cm y su area es "+perimetroCirculo+"cm");
            System.out.println("el perimetro del cuadrado es "+areaCuadrado+"cm y su area es "+perimetroCuadrado+"cm");
            System.out.println("el perimetro del rectangulo es "+areaRectangulo+"cm y su area es "+perimetroRectangulo+"cm");
    }    
}
