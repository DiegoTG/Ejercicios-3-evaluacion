package pratica84;

public class Pratica84 {

    public static void main(String[] args) {
       
        Menu m= new Menu();
        Calculo calc= new Calculo();
        Cuenta c1= new Cuenta("Diego", "Troncho", "Grande", "79646278P", "2789MN11", "3 %");
        Cuenta c2= new Cuenta("Jaime", "Ramon", "Cruz", "54927853W", "7483MP85", "2.42 %");
        
        while(!m.getSel().equals("3"))
        {
            m.SelectionPanel();
            
            switch(m.getSel())
                {
                    case "1":
                    {
                        m.showSir(c1.getNom(), c1.getApell1(), c1.getApell2());
                        break;
                    }
                    
                    case "2":
                    {
                        m.showSir(c2.getNom(), c2.getApell1(), c2.getApell2());
                        break;
                    }
                    
                    case "3":
                    {
                        m.showOff();
                        break;
                    }
                    
                    default:
                    {
                        m.showDef();
                        System.out.println(m.getSel());
                    }
                }
            
            if (m.getSel().equals("1") || m.getSel().equals("2"))
            {                
                while(!m.getTrans().equals("6"))
                {   
                    m.setOptions();
                    
                    switch (m.getSel())
                    {
                        case "1":
                        {
                            m.setSwitchM2(m.getTrans(), c1.getSaldo(), c1.getNom(), c1.getApell1(), c1.getApell2(), c1.getDni(), c1.getNum(), c1.getInttype());
                            break;
                        }
                        
                        case "2":
                        {
                            m.setSwitchM2(m.getTrans(), c2.getSaldo(), c2.getNom(), c2.getApell1(), c2.getApell2(), c2.getDni(), c2.getNum(), c2.getInttype());
                            break;
                        }
                    }                 
                                        
                    if (m.getTrans().equals("2") || m.getTrans().equals("3") || m.getTrans().equals("4"))
                    {
                        if (m.getSel().equals("1"))
                        {
                         switch (m.getTrans())
                            {
                                case "2":
                                {
                                    calc.Ingreso(c1.getSaldo(), m.getDraw());
                                    c1.setSaldo(calc.getTotal());
                                    break;
                                }
                        
                                case "3":
                                {
                                    calc.Retiro(c1.getSaldo(), m.getDraw());
                                    c1.setSaldo(calc.getTotal());
                                    break;
                                }
                        
                                case "4":
                                {
                                    calc.Transfer(c1.getSaldo(), c2.getSaldo(), m.getDraw());
                                    c1.setSaldo(calc.getTotal());
                                    c2.setSaldo(calc.getTotal2());
                                    break;
                                }
                            }
                        }
                        
                        if (m.getSel().equals("2"))
                        {
                         switch (m.getTrans())
                            {
                                case "2":
                                {
                                    calc.Ingreso(c2.getSaldo(), m.getDraw());
                                    c2.setSaldo(calc.getTotal());
                                    break;
                                }
                        
                                case "3":
                                {
                                    calc.Retiro(c2.getSaldo(), m.getDraw());
                                    c2.setSaldo(calc.getTotal());
                                    break;
                                }
                        
                                case "4":
                                {
                                    calc.Transfer(c2.getSaldo(), c1.getSaldo(), m.getDraw());
                                    c2.setSaldo(calc.getTotal());
                                    c1.setSaldo(calc.getTotal2());
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            m.setTransto0(); 
        }
    }
}
    

