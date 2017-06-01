package pratica84;

import java.util.Scanner;
/**
 * 
 * @author Diego
 */
public class Menu {
    private String sel="0", trans="0";
    private float draw;
    Scanner teclado= new Scanner(System.in); 
 /**
  * Elegir la cuenta
  */   
public void SelectionPanel(){
    System.out.println("Welcome");
    System.out.println("");
    System.out.println("Elija la cuenta");
    System.out.println("");
    System.out.println("1 Diego Troncho Grande ");
    System.out.println("2 Jaime Ramon de la Cruz");
    System.out.println("3 Cerrar");
    System.out.println("");
    sel= teclado.nextLine();
    System.out.println("");
}
/**
 * Volver al menu principal
 * @return 
 */
public String getSel(){
    return sel;
}
/**
 * Introducir lo que desea gestionar
 */
public void setOptions(){
    System.out.println("¿Que desea?");
    System.out.println("");
    System.out.println("1- Consultar");
    System.out.println("2- Ingresar");
    System.out.println("3- Retirar");
    System.out.println("4- Transferencia");
    System.out.println("5- Consultar saldo");
    System.out.println("6- Cerrar sesion");
    System.out.println("");
    trans= teclado.nextLine();
    System.out.println("");
}
/**
 * Volver al menu
 * @return 
 */
public String getTrans(){
    return trans;

}

public String setTransto0(){
    trans="0";
    return trans;
}
/**
 * mostrar mensaje
 * @param nom
 * @param apell1
 * @param apell2 
 */
public void showSir(String nom, String apell1, String apell2){
    System.out.println("Welcome "+nom+" "+apell1+" "+apell2);
    System.out.println("");
}
/**
 * Cerrar programa
 */
public void showOff(){
    System.out.println("Cerrar");
    System.out.println("");
}
/**
 * Error y volver a empezar desde el menu
 */
public void showDef(){
    System.out.println("Error, reiniciando");
    System.out.println("");
}
/**
 * Seleccionar el procedimiento que desea llevar a cavo
 * @param trans
 * @param saldo
 * @param nom
 * @param apell1
 * @param apell2
 * @param dni
 * @param num
 * @param inttype 
 */
public void setSwitchM2(String trans, float saldo, String nom, String apell1, String apell2, String dni, String num, String inttype){
    
    switch(trans)
            {
                case "1":
                {
                    System.out.println("Datos personales");
                    System.out.println("");
                    System.out.println("Nombre: "+nom);
                    System.out.println("Primer Apellido: "+apell1);
                    System.out.println("Segundo Apellido: "+apell2);
                    System.out.println("Dni: "+dni);
                    System.out.println("Numero de cuenta: "+num);
                    System.out.println("Tipo de interes: "+inttype);
                    System.out.println("");
                    break;
                }
                
                case "2":
                {
                    System.out.println("¿Que cantidad desea ingresar?");
                    draw= teclado.nextFloat();
                    teclado.nextLine();
                    System.out.println("");
                    System.out.println("La cantidad de "+draw+" ha sido añadida");
                    System.out.println("");                    
                    break;
                }
                
                case "3":
                {   
                    System.out.println("¿Que cantidad desea retirar?");
                    draw= teclado.nextFloat();
                    teclado.nextLine();
                    
                    if (draw > saldo)
                    {
                        System.out.println("Error");
                        draw= 0;
                    }
                    else
                    {
                        System.out.println("La cantidad de "+draw+" ha sido retirada");
                    }
                    System.out.println("");
                    break;
                }
                
                case "4":
                {
                    System.out.println("¿Que cantidad desea transferir?");
                    draw= teclado.nextFloat();
                    teclado.nextLine();
                 
                     if (draw > saldo)
                    {
                        System.out.println("Error");
                        draw= 0;
                        System.out.println("");
                    }
                    else
                    {
                        System.out.println("La cantidad de "+draw+" ha sido transferida");
                        System.out.println("");
                    }
                    break;
                }
                
                case "5":
                {
                    System.out.println("Saldo Actual: "+saldo);
                    System.out.println("");
                    break;
                }
                
                case "6":
                {
                    System.out.println("Cerrar");
                    System.out.println("");
                    break;
                }
                
                default:
                {
                    System.out.println("Error");
                    System.out.println("");
                }
                
            }        
}
/**
 * volver al menu
 * @return 
 */
public float getDraw(){
    return draw;
}


}

