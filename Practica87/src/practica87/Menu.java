package practica87;

import java.util.*;
/**
 * 
 * @author Diego
 */
public class Menu {
    Scanner teclado= new Scanner(System.in);
    String sel;
 /**
  * Mensaje de bienvenida
  */  
public void Hola(){
        System.out.println("Welcome");
        System.out.println("");
    }
/**
 * Que se des realizar
 */    
public void setElection(){
        System.out.println("¿Que desea hacer?");
        System.out.println("1- Consultar estados");
        System.out.println("2- Cerrar");
        System.out.println("");
    }
/**
 * Elegir los libro/s
 * @param l1
 * @param l2
 * @param l3 
 */   
public void setBookElection(String l1, String l2, String l3){
        System.out.println("Libros actuales");
        System.out.println("1 "+l1);
        System.out.println("2 "+l2);
        System.out.println("3 "+l3);
        System.out.println("4 Menu");
    }
 /**
  * Informacion sobre el libro que hemos adquirido
  * @param libro
  * @param fechapres
  * @param fechadev 
  */   
public void BookData(String libro, String fechapres, String fechadev){
        System.out.println("Datos "+libro);
        System.out.println("");
        System.out.println("Nombre: "+libro);
        System.out.println("Fecha de prestamo: "+ fechapres);
        System.out.println("Fecha devolucion: "+fechadev);
    }  
 public void setSel(){
        sel=teclado.nextLine();
    }
/**
 * return sel
 * @return sel
 */   
public String getSel(){
        return sel;
    }
/**
 * Cerrar programa
 */    
public void showOff(){
    System.out.println("Cerrar");
    System.out.println("");
    }
/**
 * Error programa y vovler am enu (reinicio)
 */    
public void showDef(){
    System.out.println("Error");
    System.out.println("");
}
}
