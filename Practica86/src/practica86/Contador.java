package practica86;
/**
 * 
 * @author Diego
 */
public class Contador {
    private double total;
/**
 * Calcular el total+incremento
 * @param incremento
 * @param num 
 */
public void setInc(double incremento, int num){
    total=total+incremento*num;
}
/**
 * Calcular lo que tenemos total-disminucion*numero
 * @param disminucion
 * @param num 
 */
public void setDis(double disminucion, int num){
    total= total-disminucion*num;
}
/**
 * return total
 * @return total
 */
public double getTotal(){
    return total;
}
}
