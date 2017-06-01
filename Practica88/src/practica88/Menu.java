package practica88;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
/**
 * 
 * @author Diego
 */
public class Menu {
    Scanner teclado = new Scanner (System.in);
    boolean check;
    String sel, data, probe;
    int day, month, year;
/**
 * Mensaje bienvenida
 */    
public void Welcome(){
        System.out.println("Welcome");
    }
/**
 * Elegir opcion
 */
public void Options(){
        System.out.println("¿Que deseas hacer?");
        System.out.println("");
        System.out.println("1 Registrar");
        System.out.println("2 Prestar");
        System.out.println("3 Consultar estados");
        System.out.println("4 Cerrar");
    }
/**
 * Mostrar lista de libros
 */    
public void Prestamo(){
        System.out.println("Lista de libros");
    }
/**
 * Mostrar fecha devolucion
 */    
public void fechaPrestamo(){
        System.out.println("Escriba la fecha de la devolucion");
    }
/**
 * data de devolucion
 * @param confirm 
 */    
public void fechaPrestamoConfirm(String confirm){        
        probe=null;
        boolean patron= Pattern.matches("^\\d{2}[/]\\d{2}[/]\\d{4}$", confirm);        
        if(patron)
        {
            probe=confirm;
        }
    }
/**
 * return probe
 * @return 
 */   
public String getProbe(){
        return probe;
    }
/**
 * fecha
 * @param probe 
 */
public void Matcher(String probe){
        Pattern patron= Pattern.compile("^(\\d+)[/](\\d+)[/](\\d+)");
        Matcher ex= patron.matcher(probe);
        ex.find();
        this.day= Integer.parseInt(ex.group(1));
        this.month= Integer.parseInt(ex.group(2));
        this.year= Integer.parseInt(ex.group(3));
    }
/**
 * fecha en dias meses y año
 * @param day
 * @param month
 * @param year 
 */
public void SanityCheck(int day, int month, int year){        
        check=false;
        if (day > 31 || month > 12 ){}
        else if (day > 30 && (month==4 || month==6 || month==9 || month==11)){}
        else if (day > 28 && month==2 && year%4!=0){}
        else if (day > 29 && month==2 && year%400==0){}
        else if (day > 28 && month==2 && (year%400!=0 && year%100==0)){}
        else if (day > 29 && month==2 && year%4==0){}
        else
        {
            check=true;
        }
    }

public boolean setCheckToFalse(){
        check=false;
        return check;
    }

public boolean getCheck(){
        return check;
    }
/**
 * return day
 * @return 
 */    
public int getDay(){
        return day;
    }
/**
 * return mes
 * @return 
 */    
public int getMonth(){
        return month;
    }
/**
 * return año
 * @return 
 */    
public int getYear(){
        return year;
    }
    
public void TakingDate(){
        
    }
/**
 * Introducir nombre
 * @return 
 */   
public String setBookName(){
        System.out.println("Escriba el Nombre");
        data= teclado.nextLine();
        return data;
    }
/**
 * Introducir ISBN
 * @return 
 */    
public String setBookISBN(){
        System.out.println("Escriba el ISBN");
        data= teclado.nextLine();
        return data;
    }
/**
 * Introducir editorial
 * @return 
 */    
public String setBookEdit(){
        System.out.println("Escriba la Editorial");
        data= teclado.nextLine();
        return data;
    }
/**
 * Teclado sel
 */    
public void setSel(){
        sel= teclado.nextLine();
    }
/**
 * return sel
 * @return 
 */    
public String getSel(){
        return sel;
    }
/**
 * Cerrar
 */    
public void showOff(){
    System.out.println("Cerrar");
    System.out.println("");
    }
/**
 * Error y volver a menu( reiniciar )
 */   
public void showDef(){
    System.out.println("Error");
    System.out.println("");
    }
/**
 * Mostrar datos
 */    
public void introBook(){
        System.out.println("Datos");
        System.out.println("");
    }
/**
 * Mostrar datos anteriores
 * @param nombre
 * @param ISBN
 * @param editorial
 * @param estado 
 */    
public void BookData(String nombre, String ISBN, String editorial, String estado){
        System.out.println("Nombre: "+nombre);
        System.out.println("ISBN: "+ISBN);
        System.out.println("Editorial: "+editorial);
        System.out.println("Estado: "+estado);
        System.out.println("");
    }
}
