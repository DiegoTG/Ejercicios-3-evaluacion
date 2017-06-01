package practica83;
/**
 * 
 * @author Diego
 */
public class Ecuacion {
    private int A, B, C;
    private double X1, X2;
/**
 * Introducir valores A, B y C
 * @param A
 * @param B
 * @param C 
 */
public Ecuacion(int A, int B, int C){
    this.A= A;
    this.B= B;
    this.C= C;
}
/**
 * Calcular x1 a partir de los valores introducidos
 */
public void Calcx1(){
    X1= (-B+Math.sqrt(Math.pow(B, 2)-4*A*C))/(2*A);
}
/**
 * Calcular x2 a partir de los valores introducidos
 */
public void Calcx2(){
    X2= (-B-Math.sqrt(Math.pow(B, 2)-4*A*C))/(2*A);
}
/**
 * Mostrar resultado x1
 * @return X1
 */
public double getX1(){
    return X1;
}
/**
 * Mostrar resultado x2
 * @return X2
 */
public double getX2(){
    return X2;
}
}
