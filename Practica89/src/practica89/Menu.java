package practica89;

import java.util.Scanner;
/**
 *
 * @author Diego
 */
public class Menu {
    int value;
    String sel;
Scanner teclado= new Scanner(System.in);    
/**
 * Introducir lo que se des hacer
 */
public void Hello(){
    System.out.println("Que desea hacer?");
    System.out.println("");
    System.out.println("1 Comprobar validez");
    System.out.println("2 Fecha");
    System.out.println("3 Cerrar");
}
/**
 * teclado sel
 */
public void setSel(){
    sel= teclado.nextLine();
}
/**
 * return teclado sel
 * @return 
 */
public String getSel(){
    return sel;
}
/**
 * teclado value
 */
public void setIntValue(){
    value= teclado.nextInt();
    teclado.nextLine();
}
/**
 * return teclado value
 * @return 
 */
public int getIntValue(){
    return value;
}
/**
 * Cerrar
 */
public void showOff(){
    System.out.println("Cerrar");
    System.out.println("");
    }
/**
 * Error y volver al menu( reiniciar )
 */    
public void showDef(){
    System.out.println("Error");
    System.out.println("");
    }
/**
 * Fecha
 * @param fechact 
 */
public void FechaAct(String fechact){
    System.out.println("Fecha");
    System.out.println("");
    System.out.println(fechact);
}
/**
 * Introducir dia
 */
public void ProbeDay(){
    System.out.println("Introduzca el dia");
}
/**
 * Introducir mes
 */
public void ProbeMonth(){
    System.out.println("Introduzca el mes");
}
/**
 * Introducir año
 */
public void ProbeYear(){
    System.out.println("Introduzca el año");
}
        
}
