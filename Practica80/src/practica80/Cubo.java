package practica80;
/**
 * 
 * @author Diego
 */
public class Cubo {
    private double area;
/**
 * Cacular area apartir de un lado
 * @param lado 
 */
public void setArea(float lado){
    this.area= Math.pow(lado, 3);
}
/**
 * Mostrar resultado area
 * @return area
 */
public double getArea(){
    return area;
}
}
