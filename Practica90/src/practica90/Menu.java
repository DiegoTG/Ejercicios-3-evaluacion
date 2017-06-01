package practica90;

import java.util.regex.Pattern;
import java.util.Scanner;
/**
 * 
 * @author Diego
 */
public class Menu {
   Scanner teclado= new Scanner(System.in);
   boolean check;
   String digit;
/**
 * Mostrar mensaje de bienvenida y introducir DNI
 */   
public void Welcome(){
    System.out.println("Welcome");
    System.out.println("");
    System.out.println("Introduzca su DNI");
}
/**
 * Teclado para introducir DNI
 */
public void setDigit(){
    digit= teclado.nextLine();
}
/**
 * Return teclado de DNI
 * @return 
 */
public String getDigit(){
    return digit;
}
/**
 * Mostrar letra del DNI
 * @param digit
 * @return 
 */
public boolean SanityCheck(String digit){
    boolean patron= Pattern.matches("\\d{8}", digit);
    return patron;            
}
/**
 * Error y volver al menu de introduccion del DNI (reiniciar)
 */
public void showOff(){
    System.out.println("Error");
}
}
