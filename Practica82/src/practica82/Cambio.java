package practica82;
/**
 * 
 * @author Diego
 */
public class Cambio {
int dinero;
int [][] cambiando;
/**
 * Introducir dinero
 * @param dinero 
 */
public Cambio(int dinero){
    this.dinero= dinero;
     cambiando= new int [][]{{500, 200, 100, 50, 20, 10, 5, 2, 1},{0, 0, 0, 0, 0, 0, 0, 0, 0}};
}
/**
 * Cambio de dinero
 */
public void setCalc(){
    for (int i=0; i< cambiando.length-1; i++)
    {
        for (int j=0; j< cambiando[0].length; j++)
        {
            cambiando [i+1][j]= dinero/cambiando[i][j];
            dinero= dinero%cambiando[i][j];
        }
    }
}
/**
 * Devolver el camibo
 * @return 
 */
public int [][] getCalc(){
    return cambiando;   
}


}
