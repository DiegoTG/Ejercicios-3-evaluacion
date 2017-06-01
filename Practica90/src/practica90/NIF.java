package practica90;
/**
 * 
 * @author Diego
 */
public class NIF {
    private char letraNIF;
    private int i, DNI, total;
/**
 * Integrar DNI
 * @param DNI 
 */    
public void setDNI(String DNI){
    this.DNI= Integer.parseInt(DNI);
}
/**
 * Calcular DNI entre los posibles 23 casos
 */
public void Calculate(){
    total=DNI%23;
}
/**
 * DIferentes casos de la letra del DNI
 */
public void Selection(){
    switch(total)
    {
        case 0:
            letraNIF='W'; break;
        case 1:
            letraNIF='T'; break;
        case 2:
            letraNIF='R'; break;
        case 3:
            letraNIF='G'; break;
        case 4:
            letraNIF='M'; break;
        case 5:
            letraNIF='A'; break;
        case 6:
            letraNIF='F'; break;
        case 7:
            letraNIF='P'; break;
        case 8:
            letraNIF='Y'; break;
        case 9:
            letraNIF='D'; break;
        case 10:
            letraNIF='J'; break;
        case 11:
            letraNIF='B'; break;
        case 12:
            letraNIF='N'; break;
        case 13:
            letraNIF='X'; break;
        case 14:
            letraNIF='Z'; break;
        case 15:
            letraNIF='S'; break;
        case 16:
            letraNIF='Q'; break;
        case 17:
            letraNIF='V'; break;
        case 18:
            letraNIF='H'; break;
        case 19:
            letraNIF='L'; break;
        case 20:
            letraNIF='C'; break;
        case 21:
            letraNIF='K'; break;
        case 22:
            letraNIF='E'; break;
    }
}
/**
 * Return seleccion letra del DNI
 * @return 
 */
public char getLetraNIF(){
    return letraNIF;
}
}
