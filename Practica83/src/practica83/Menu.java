package practica83;

import java.util.Scanner;
/**
 * 
 * @author Diego
 */
public class Menu {
Scanner teclado= new Scanner(System.in);
private int A, B, C;
/**
 * Introducir valor A
 * @return 
 */
public int setA(){
    System.out.println("Introduzca el valor de A");
    System.out.println("");
    A= teclado.nextInt();
    return A;
}
/**
 * Introducir valor B
 * @return 
 */
public int setB(){
    System.out.println("Introduzca el valor de B");
    System.out.println("");
    B= teclado.nextInt();
    return B;
}
/**
 * Introducir valor C
 * @return 
 */
public int setC(){
    System.out.println("Introduzca el valor de C");
    System.out.println("");
    C= teclado.nextInt();
    return C;
}
/**
 * Mostrar resultado X1 y X2
 * @param X1
 * @param X2 
 */
public void valor(double X1, double X2){
    System.out.println("El valor de x1 es: "+X1);
    System.out.println("El valor de x2 es: "+X2);
}
}
