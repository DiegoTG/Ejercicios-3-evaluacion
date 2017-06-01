package practica77;

import java.util.Scanner;
/**
 * 
 * @author Diego
 */
public class Menu {
    Scanner teclado= new Scanner(System.in);
    float radio;
    int option;
    Circunferencia cir1= new Circunferencia(radio);
/**
 * Introducir el radio
 * @return 
 */
public float setRadio(){
    System.out.println("Introduzca el radio");
    System.out.println("");    
    radio= teclado.nextFloat();
    return radio;
}
/**
 * Seleccionar operacion
 * @return 
 */
public int setOption(){
    System.out.println("Seleccione la operacion que dese");
    System.out.println("");
    System.out.println("1- Longitud ");
    System.out.println("2- Area");
    option= teclado.nextInt();
    return option;
}
/**
 * Calcular el radio y la longitud a partir de la opcion que deseemos
 * @param option
 * @param radio 
 */
public void setVar(int option, float radio){
    this.option= option;
    this.radio= radio;
    switch(option)
    {
        case 1:
        {
            cir1.setRadio(radio);
            cir1.setLongresult();
            System.out.println("La longitud es: "+ cir1.getLongresult());
            break;
        }
        case 2:
        {
            cir1.setRadio(radio);
            cir1.setArearesult();
            System.out.println("La area es:"+ cir1.getArearesult());
            break;
        }
        default:
        {
            System.out.println("Error");
        }
}
}
}


