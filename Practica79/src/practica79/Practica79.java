package practica79;

public class Practica79 {

    
    public static void main(String[] args) {
    Menu m= new Menu();
    Pentagono p1= new Pentagono();
    p1.setArea(m.setapt(), m.setLngld());
    m.setCalc(p1.getArea());
    }
    
}
