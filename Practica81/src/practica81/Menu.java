package practica81;

import java.util.Scanner;
/**
 * 
 * @author Diego
 */
public class Menu {
Scanner teclado= new Scanner(System.in);
float radio;
/**
 * Introducir el radio
 * @return 
 */
public float setRadio(){
    System.out.println("Introduzca el radio");
    System.out.println("");
    radio= teclado.nextFloat();
    System.out.println("");
    return radio;
}
/**
 * Mostrar resultado area
 * @param area 
 */
public void setArea(double area){
    System.out.println("El area  es: "+area);
}
/**
 * Mostrar resultado volumen
 * @param volumen 
 */
public void setVolumen(double volumen){
    System.out.println("El volumen es: "+volumen);
}
}
