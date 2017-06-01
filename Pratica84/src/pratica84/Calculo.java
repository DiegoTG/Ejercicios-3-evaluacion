package pratica84;
/**
 * 
 * @author Diego
 */
public class Calculo {
    private float total, total2;
/**
 * Calcular ingreso
 * @param saldo
 * @param ingreso 
 */
public void Ingreso(float saldo, float ingreso){
    total= saldo + ingreso;
}
/**
 * Calcular retiro
 * @param saldo
 * @param retiro 
 */
public void Retiro (float saldo, float retiro){
    total= saldo - retiro;
}
/**
 * Calcular transferencia
 * @param saldo1
 * @param saldo2
 * @param trans 
 */
public void Transfer(float saldo1, float saldo2, float trans){
    total= saldo1 - trans;
    total2= saldo2 + trans;
}
/**
 * Mostral el total de una cuenta
 * @return 
 */
public float getTotal(){
    return total;
}
/**
 * Mostrar el total de otra cuenta
 * @return 
 */
public float getTotal2(){
    return total2;
}
    
}
