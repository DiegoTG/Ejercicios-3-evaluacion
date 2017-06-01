package practica79;

import java.util.Scanner;
/**
 * 
 * @author Diego
 */
public class Menu {
    Scanner teclado= new Scanner(System.in);
    float lngld;
    float apt;
/**
 * Introduzca longitud
 * @return 
 */
public float setLngld(){
    System.out.println("Introduzca la longitud");
    System.out.println("");
    lngld= teclado.nextFloat();
    return lngld;
}
/**
 * Introduzca apotema
 * @return 
 */
public float setapt(){
    System.out.println("Introduzca la apotema");
    System.out.println("");
    apt= teclado.nextFloat();
    return apt;
}
/**
 * mostrar resultado y devolver area
 * @param result mostrar area
 */
public void setCalc(double result){
    System.out.println("El area es: "+result);
}
}
