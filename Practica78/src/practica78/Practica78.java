package practica78;

import java.util.Scanner;

public class Practica78 {

    public static void main(String[] args) {
    Menu m= new Menu();
    Triangulo t1= new Triangulo(m.setAltura(), m.setBase());    
    t1.setArearesult();
    m.setCalc(t1.getArearesult());
    }
    
}
