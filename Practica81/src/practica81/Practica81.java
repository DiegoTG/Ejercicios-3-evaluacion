package practica81;

public class Practica81 {
    
    public static void main(String[] args) {
    
    Menu m= new Menu();
    Esfera e1= new Esfera(m.setRadio());
    e1.setArea();
    e1.setVolumen();
    m.setArea(e1.getArea());
    m.setVolumen(e1.getVolumen());
    }
    
}
