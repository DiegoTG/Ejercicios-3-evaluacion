package practica86;

public class Practica86 {

    public static void main(String[] args) {
    
    boolean loop1=true;
    Menu m= new Menu();
    Contador c1= new Contador();
    
    m.Pres();
    while (loop1)
            {
                
                m.setSel();
                
                switch(m.getSel())
                {
                    case "1":
                    {
                        m.setSumCalc();
                        m.setNum();
                        c1.setInc(m.getCalc(), m.getNum());
                        System.out.println("El contador es: "+c1.getTotal());
                        break;
                    }
                    
                    case "2":
                    {
                        m.setRestCalc();
                        m.setNum();
                        c1.setDis(m.getCalc(), m.getNum());
                        System.out.println("El contador es: "+c1.getTotal());
                        break;
                    }
                    
                    case "3":
                    {
                        System.out.println("El valor del contador es: "+c1.getTotal());
                        break;
                    }
                    
                    case"4":
                    {
                        loop1=false;
                        m.Off();
                        break;
                    }
                    
                    default:
                    {
                        m.Error();
                    }
                }
            }
    }
    
}
