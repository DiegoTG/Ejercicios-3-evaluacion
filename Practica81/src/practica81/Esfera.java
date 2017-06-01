package practica81;
/**
 * 
 * @author Diego
 */
public class Esfera {
    float radio;
    double area;
    double volumen;
/**
 * Introducir radio
 * @param radio 
 */    
public Esfera(float radio){
    this.radio= radio;    
}
/**
 * Calcular area
 */  
public void setArea(){
    this.area= 4*Math.PI*Math.pow(radio, 2);
}
/**
 * Calcular volumen
 */
public void setVolumen(){
    this.volumen= (4/3)*Math.PI*Math.pow(radio, 3);
}
/**
 * Mostrar resultado area
 * @return area
 */
public double getArea(){
    return area;
}
/**
 * Mostrar resultado volumen
 * @return volumen
 */
public double getVolumen(){
    return volumen;
}
}
