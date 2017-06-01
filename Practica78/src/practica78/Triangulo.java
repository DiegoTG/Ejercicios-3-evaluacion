package practica78;

import java.util.Scanner;
/**
 * 
 * @author Diego
 */
public class Triangulo {
    float altura;
    float base;
    double arearesult;
/**
 * Introducir la altura y la base
 * @param altura valor altura
 * @param base valor base
 */   
public Triangulo(float altura, float base){
    this.altura= altura;
    this.base= base;
}
/**
 * Calcular y resultado area
 */
public void setArearesult(){
    this.arearesult= (base*altura)/2;
}
/**
 * devolver resultado area
 * @return arearesult
 */
public double getArearesult(){
    return arearesult;
}
}
