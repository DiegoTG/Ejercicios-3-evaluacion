package practica90;

public class Practica90 {

    public static void main(String[] args) {
        NIF f= new NIF();
        Menu m= new Menu();
        
        m.Welcome();
        m.setDigit();
        
        {
        if (m.SanityCheck(m.getDigit()))
        {
            f.setDNI(m.getDigit());
            f.Calculate();
            f.Selection();
            
            System.out.println("La letra NIF es:"+f.getLetraNIF());
        }
        else
        {
            m.showOff();
        }
        }
    }
    
}
