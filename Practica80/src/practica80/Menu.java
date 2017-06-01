package practica80;

import java.util.Scanner;
/**
 * 
 * @author Diego
 */
public class Menu {
    Scanner teclado = new Scanner(System.in);
    float lado;
/**
 * Introducir la longitud (lado)
 * @return 
 */ 
public float setLado(){
    System.out.println("Introduzca la longitud");
    System.out.println("");
    lado= teclado.nextFloat();
    System.out.println("");
    return lado;
}
/**
 * Mostrar resultado area
 * @param area 
 */
public void setCalc(double area){
    System.out.println("El area es: "+area);
}
}
