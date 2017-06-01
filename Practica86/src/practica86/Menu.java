package practica86;

import java.util.Scanner;
/**
 * 
 * @author Diego
 */
public class Menu {
    Scanner teclado= new Scanner(System.in);
    private String sel;
    private double calc;
    private int num;
/**
 * Mensaje contador
 */   
public void Pres(){
    System.out.println("Contador");
    System.out.println("");
}
/**
 * Elegir la operacion que deseamos
 */
public void setSel()
{
    System.out.println("¿Que operacion desea?");
    System.out.println("");
    System.out.println("1- Sumar");
    System.out.println("2- Restar");
    System.out.println("3- Mostrar valor");
    System.out.println("4- Cerrar");
    sel= teclado.nextLine();
    System.out.println("");
}
/**
 * return menu
 * @return 
 */
public String getSel(){
    return sel;
}
/**
 * Cerrar
 */
public void Off(){
    System.out.println("Cerrar");
    System.out.println("");
}
/**
 * Error y volver al menu (reiniciar)
 */
public void Error(){
    System.out.println("Error");
    System.out.println("");
}
/**
 * Elegir la cantidad que deseamos sumar
 */
public void setSumCalc()
{
    System.out.println("¿Que cantidad desea sumar?");
    calc= teclado.nextDouble();
    teclado.nextLine();
    System.out.println("");
}
/**
 * Elegir la cantidad que deseamos restar
 */
public void setRestCalc(){
    System.out.println("¿Que cantidad desea restar?");
    calc= teclado.nextDouble();
    teclado.nextLine();
    System.out.println("");
}
/**
 * devolver lo ocalculado
 * @return 
 */
public double getCalc(){
    return calc;
}
/**
 * Elegir las veces que deseamos realizar diferentes operaciones
 */
public void setNum(){
    System.out.println("¿Cuantas veces desea realizar la operacion?");
    num= teclado.nextInt();
    teclado.nextLine();
}
/**
 * volver al menu
 * @return 
 */
public int getNum(){
    return num;
}
}


