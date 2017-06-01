package practica82;

public class Practica82 {

    
    public static void main(String[] args) {
    
    Menu m= new Menu();
    Cambio c1= new Cambio(m.setDinero());
    c1.setCalc();
    m.showResult(c1.getCalc());    
    
    }
    
}
