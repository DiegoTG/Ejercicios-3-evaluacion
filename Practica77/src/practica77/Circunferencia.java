package practica77;
/**
 * Objeto circunferencia
 * @author Diego
 */
class Circunferencia {
   double radio;
   double resultlong;
   double resultarea;
/**
 * Introducir radio
 * @param radio el valor de radio
 */
public  Circunferencia(double radio) {
    this.radio= radio;
}
public void setRadio(double radio){
    this.radio= radio;
}
/**
 * Calcular y resultado longitud
 */
public void setLongresult(){
    this.resultlong= 2*radio*Math.PI;
}
/**
 * Calcular y resultado area
 */
public void setArearesult(){
    this.resultarea= Math.PI*Math.pow(radio,2);
}
/**
 * devolver resultado longitud
 * @return resultlong
 */
public double getLongresult(){
    return resultlong;
}
/**
 * devolver resultado area
 * @return resultarea
 */
public double getArearesult(){
    return resultarea;
}
}

