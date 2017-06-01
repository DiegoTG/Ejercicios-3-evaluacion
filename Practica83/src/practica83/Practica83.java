package practica83;

public class Practica83 {

    public static void main(String[] args) {
    Menu m= new Menu();
    Ecuacion e1= new Ecuacion(m.setA(), m.setB(), m.setC());
    e1.Calcx1();
    e1.Calcx2();
    m.valor(e1.getX1(), e1.getX2());
    }
    
}
