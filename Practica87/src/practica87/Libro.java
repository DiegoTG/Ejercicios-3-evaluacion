package practica87;
/**
 * 
 * @author Diego
 */
public class Libro {
    String libro, fechapres, fechadev;
    private int diap, mesp, añop;
    private int diad, mesd, añod;
/**
 * Introducir libro,dia,mes,años,fecha
 * @param libro
 * @param diap
 * @param mesp
 * @param añop
 * @param diad
 * @param mesd
 * @param añod 
 */
public Libro(String libro, int diap, int mesp, int añop, int diad, int mesd, int añod){
    this.libro= libro;
    this.diap= diap;
    this.mesp= mesp;
    this.añop= añop;
    this.diad= diad;
    this.mesd= mesd;
    this.añod= añod;
    this.fechapres=diap+"/"+mesp+"/"+añop;
    this.fechadev=diad+"/"+mesd+"/"+añod;
}
/**
 * return fecha adquisicion
 * @return fechapres 
 */
public String getPrestamo(){
    return fechapres;
}
/**
 * return fecha devolucion
 * @return fechadev
 */
public String getDevolucion(){
    return fechadev;
}
/**
 * return libro
 * @return libro
 */
public String getLibro(){
    return libro;
}


}
