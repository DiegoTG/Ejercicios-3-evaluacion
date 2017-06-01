package pratica84;
/**
 * 
 * @author Diego
 */
public class Cuenta {
    private String nom, apell1, apell2, dni, num, inttype;
    private float saldo;
    
public Cuenta(){
    
}
/**
 * Introducir valores de nombre, apellido 1 y 2, dni, numero de telefono e interes
 * @param nom
 * @param apell1
 * @param apell2
 * @param dni
 * @param num
 * @param inttype 
 */    
public Cuenta(String nom, String apell1, String apell2, String dni, String num, String inttype){
    this.nom= nom;
    this.apell1= apell1;
    this.apell2= apell2;
    this.dni= dni;
    this.num= num;
    this.inttype= inttype;
}
/**
 * mostrar datos cuenta
 * @param cuenta 
 */
public Cuenta(Cuenta cuenta){
    this.nom= cuenta.nom;
    this.apell1= cuenta.apell1;
    this.apell2= cuenta.apell2;
    this.dni= cuenta.dni;
    this.num= cuenta.num;
    this.inttype= cuenta.inttype;    
}
/**
 * devolver nombre
 * @return 
 */
public String getNom(){
    return nom;
}
/**
 * devolver apellido 1
 * @return 
 */
public String getApell1(){
    return apell1;
}
/**
 * devolver apellido 2
 * @return 
 */
public String getApell2(){
    return apell2;
}
/**
 * devolver dni
 * @return 
 */
public String getDni(){
    return dni;
}
/**
 * devolver numero
 * @return 
 */
public String getNum(){
    return num;
}
/**
 * devolver interes
 * @return 
 */
public String getInttype(){
    return inttype;
}
/**
 * mostrar total saldo
 * @param total 
 */
public void setSaldo(float total){
    saldo=total;
}
/**
 * devolver saldo
 * @return 
 */
public float getSaldo(){
    return saldo;
}
}
