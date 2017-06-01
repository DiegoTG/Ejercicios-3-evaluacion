package practica80;

public class Practica80 {

    
    public static void main(String[] args) {
        
    Menu m= new Menu();
    Cubo c1= new Cubo();
    c1.setArea(m.setLado());
    m.setCalc(c1.getArea());
    }
    
}
