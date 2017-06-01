package practica78;

import java.util.Scanner;
/**
 * 
 * @author Diego
 */
public class Menu {
    float altura;
    float base;
    Scanner teclado= new Scanner(System.in);
/**
 * Introducir altura
 * @return altura
 */
public float setAltura(){
    System.out.println("Introduzca la altura");
    altura= teclado.nextFloat();
    return altura;
}
/**
 * Introducir base
 * @return base
 */
public float setBase(){
    System.out.println("Introduzca la base");
    base= teclado.nextFloat();
    return base;
}
/**
 * Resultado area
 * @param result area
 */
public void setCalc(double result){
    System.out.println("El area es: "+result);
}
}


