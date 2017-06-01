package practica85;

import java.util.Scanner;
/**
 * 
 * @author Diego
 */
public class Menu {
    private String sel, data;
    private float draw, saldo;
    Scanner teclado= new Scanner(System.in);
/**
 * mostrar mensaje
 */   
public void Welcome(){
    System.out.println("Welcome");
    System.out.println("");
}
/**
 * Mostar opciones
 */
public void MainMenu(){    
    System.out.println("1 Nueva cuenta");
    System.out.println("2 Cuenta existente");
    System.out.println("3 Cerrar");
    System.out.println("");
}
/**
 * 
 */
public void receiver(){
    sel= teclado.nextLine();
    System.out.println("");
}
/**
 * volver a menu
 * @return 
 */
public String getSel(){
    return sel;
}
/**
 * Introducir nombre 
 * @return 
 */
public String Name(){
    System.out.println("Introduzca su nombre");
    data= teclado.nextLine();
    return data;
}
/**
 * Introducr apellido 1
 * @return 
 */
public String LastName1(){
    System.out.println("Introduzca su primer apellido");
    data= teclado.nextLine();
    return data;
}
/**
 * Introducir apellido 2
 * @return 
 */
public String LastName2(){
    System.out.println("Introduzca su segundo apellido");
    data= teclado.nextLine();
    return data;
}
/**
 * Introducir dni
 * @return 
 */
public String Dni(){
    System.out.println("Introduzca su dni");
    data= teclado.nextLine();
    return data;
}
/**
 * Introducir numero cuenta
 * @return 
 */
public String Num(){
    System.out.println("Introduzca su numero de cuenta");
    data= teclado.nextLine();
    return data;
}
/**
 * Introducir interes
 * @return 
 */
public String Inttype(){
    System.out.println("Introduzca el tipo de interes");
    data= teclado.nextLine();
    return data;
}
/**
 * Elegir la cuenta
 */  
public void SelectionPanel(){
    System.out.println("Elija la cuenta con la que desee trabajar");
    System.out.println("");
    System.out.println("1 Diego Troncho Grande");
    System.out.println("2 Manolo Ramon de la Cruz");
    System.out.println("3 Return menu");
    System.out.println("");
}
/**
 * Elegir la operacion que deseamos realizar
 */
public void setOptions(){
    System.out.println("¿Que operacion desea realizar?");
    System.out.println("");
    System.out.println("1- Consultar sus datos");
    System.out.println("2- Ingresar");
    System.out.println("3- Retirar");
    System.out.println("4- Transferencia");
    System.out.println("5- Consultar saldo");
    System.out.println("6- Cerrar");
    System.out.println("");
}
/**
 * Mostrar mensaje de bienvenida
 * @param nom
 * @param apell1
 * @param apell2 
 */
public void showSir(String nom, String apell1, String apell2){
    System.out.println("Bienvenido "+nom+" "+apell1+" "+apell2);
    System.out.println("");
}
/**
 * Elegir una de las cuentas
 */
public void accountElection(){
    System.out.println("Elija una de las cuentas");
    System.out.println("");
}
/**
 * Cerrar porgrama
 */
public void showOff(){
    System.out.println("Cerrando");
    System.out.println("");
}
/**
 * Mensaje de Error
 */
public void showdefault(){
    System.out.println("Opcion erronea...Vuelva a elegir");
    System.out.println("");
}
/**
 * Mensaje de reinicio
 */
public void showDef(){
    System.out.println("Error, se reiniciara el programa");
    System.out.println("");
}
public void accountTrans(){
    System.out.println("");
}
/**
 * Cantidad que deseamos ingresar
 */
public void ingQuest(){
    System.out.println("¿Que cantidad desea ingresar?");
    System.out.println("");   
}
/**
 * Cantidad que deseamos retirar
 */
public void drawQuest(){
    System.out.println("¿Que cantidad desea retirar?");
    System.out.println("");   
}
/**
 * Cantidad que deseamos transferir
 */
public void transQuest(){
    System.out.println("Que cantidad desea transferir?");
    System.out.println("");
}
/**
 * Elegir cuenta para transferencia
 */
public void transAccElec(){
    System.out.println("Elija la cuenta a la que desea efectuar la transferencia");
    System.out.println("");
}
/**
 * Mensaje de no hay suficiente dinero
 */
public void denyDraw(){
    System.out.println("No cuenta con suficiente money");
    System.out.println("");
}
/**
 * return menu
 * @return 
 */
public float setDrawto0(){
    draw=0;
    return draw;
}
public void setDraw(){
    draw= teclado.nextFloat();
    teclado.nextLine();
}
/**
 * Mensaje de correcto
 * @param draw 
 */
public void ingConfirm(float draw){
    System.out.println("La cantidad de "+draw+" ha sido ingresada correctamente");
    System.out.println("");
}
/**
 * Mensaje de retirada correcto
 * @param draw 
 */
public void retConfirm(float draw){
    System.out.println("La cantidad de "+draw+" ha sido retirada correctamente");
    System.out.println("");
}
/**
 * Mensaje de transferencia correcto
 * @param draw 
 */
public void transConfirm(float draw){
    System.out.println("La cantidad de "+draw+" ha sido transferida correctamente");
    System.out.println("");
}
/**
 * devolver menu
 * @return 
 */
public float getDraw(){
    return draw;
}
/**
 * Datos personales sobre nuestra cuenta
 * @param nom
 * @param apell1
 * @param apell2
 * @param dni
 * @param num
 * @param inttype 
 */
public void dataView(String nom, String apell1, String apell2, String dni,
                     String num, String inttype){

    System.out.println("Datos personales");
    System.out.println("");
    System.out.println("Nombre: "+nom);
    System.out.println("Primer Apellido: "+apell1);
    System.out.println("Segundo Apellido: "+apell2);
    System.out.println("Dni: "+dni);
    System.out.println("Numero de cuenta: "+num);
    System.out.println("Tipo de interes: "+inttype);
    System.out.println("");
}
/**
 * devolver saldo
 * @return 
 */
public float saldo(){
    saldo=0;
    return saldo;
}

}        


