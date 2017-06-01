package practica79;
/**
 * 
 * @author Diego
 */
public class Pentagono {
    double area; 
/**
 * Calcular y resultado area
 * @param lngld longitud
 * @param apt apotema
 */
public void setArea(float lngld, float apt){
    this.area= (5*lngld*apt)/2;    
}
/**
 * devolver resultado area
 * @return area
 */
public double getArea(){
    return area;
}
}
