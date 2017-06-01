package practica88;
/**
 * 
 * @author Diego
 */
public class Libro {
    String libro, ISBN, editorial;
    private String fechapres, fechadev, estado;
    private int diap, mesp, añop;
    private int diad, mesd, añod;
/**
 * Informacion sobre el libro escogido
 * @param libro
 * @param ISBN
 * @param editorial 
 */
public Libro(String libro, String ISBN, String editorial){
    this.libro= libro;
    this.ISBN= ISBN;
    this.editorial= editorial;
    this.estado="Reserva";
}
/**
 * Informacio nsobre la devolucion del libro escogido
 * @param diad
 * @param mesd
 * @param añod 
 */
public void Prestar(int diad, int mesd, int añod){
    this.diad= diad;
    this.mesd= mesd;
    this.añod= añod;
    this.fechadev= diad+"/"+mesd+"/"+añod;
}
/**
 * Mensaje de Prestado
 */
public void setEstado(){
    this.estado="Prestado";
}
/**
 * return estado
 * @return estado
 */
public String getEstado(){
    return estado;
}
/**
 * return fecha adquirido
 * @returnfechapres 
 */
public String getPrestamo(){
    return fechapres;
}
/**
 * return fecha devolucion
 * @return 
 */
public String getDevolucion(){
    return fechadev;
}
/**
 * return libo
 * @return 
 */
public String getLibro(){
    return libro;
}
/**
 * return fecha devolucion
 * @return 
 */
public String getFechaDev(){
    return fechadev;
}
/**
 * return ISBN
 * @return 
 */
public String getISBN(){
    return ISBN;
}
/**
 * return editorial
 * @return 
 */
public String getEditorial(){
    return editorial;
}
}
