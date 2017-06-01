package practica82;

import java.util.Scanner;
/**
 * 
 * @author Diego
 */
public class Menu {
Scanner teclado= new Scanner(System.in);
private int dinero;
/**
 * Introducir cantidad
 * @return 
 */
public int setDinero(){
    System.out.println("Introduzca la cantidad");
    dinero= teclado.nextInt();
    System.out.println("");
    return dinero;
}
/**
 * Mostrar el cambio en billetes
 * @param cambiando 
 */
public void showResult(int [][] cambiando){
    
    for (int i=0; i< cambiando.length-1; i++)
    {
        for (int j=0; j< cambiando[0].length; j++)
        {
    System.out.println("Tiene "+cambiando[i+1][j]+" billete(s) de "+cambiando[i][j]);
        }
    }
}
}
