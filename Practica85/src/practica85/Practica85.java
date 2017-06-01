package practica85;

import java.util.ArrayList;

public class Practica85 {

    
    public static void main(String[] args) {
        int i;
        ArrayList <Cuenta> Cuentas= new ArrayList <Cuenta>();;
        Menu m= new Menu();
        
        m.Welcome();
        boolean menu1= true;
        
        while(menu1)
        {
            m.MainMenu();
            m.receiver();
            switch(m.getSel())
            {
                case "1":
                {   
                    Cuentas.add(new Cuenta (m.Name(), m.LastName1(), 
                                m.LastName2(),m.Dni(), m.Num(), m.Inttype(), 
                                m.saldo()));
                    System.out.println("");
                    break;
                }
                
                case "2":
                {
                    m.accountElection();
                    for ( i=0; i<Cuentas.size(); i++)
                    {
                        System.out.println((i+1)+" - "+ Cuentas.get(i).getNom()+
                        " "+ Cuentas.get(i).getApell1()+
                        " "+ Cuentas.get(i).getApell2());
                    }
                    System.out.println((i+1)+"Return menu");
                    m.receiver();
                    
                    int election= Integer.parseInt(m.getSel());
                    
                    if((election) <= Cuentas.size())
                    {                    
                    
                    m.showSir(Cuentas.get(election-1).getNom(), 
                              Cuentas.get(election-1).getApell1(), 
                              Cuentas.get(election-1).getApell2());
                    
                    boolean menu2= true;
                    while(menu2)
                    {
                        m.setOptions();
                        m.receiver();
                        
                        switch(m.getSel())
                            {
                                case "1":
                                {
                                    m.dataView(Cuentas.get(election-1).getNom(),
                                    Cuentas.get(election-1).getApell1(), 
                                    Cuentas.get(election-1).getApell2(), 
                                    Cuentas.get(election-1).getDni(), 
                                    Cuentas.get(election-1).getNum(), 
                                    Cuentas.get(election-1).getInttype());
                                    break;
                                }
                        
                                case "2":
                                {
                                    m.ingQuest();
                                    m.setDraw();
                                    Cuentas.get(election-1).setIngreso(m.getDraw());
                                    m.ingConfirm(m.getDraw());
                                    break;
                                }
                                
                                case "3":
                                {
                                    m.drawQuest();
                                    m.setDraw();
                                    if(m.getDraw()>Cuentas.get(election-1).getSaldo())
                                    {
                                        m.denyDraw();
                                        m.setDrawto0();
                                    }
                                    else
                                    {
                                        Cuentas.get(election-1).setRetiro(m.getDraw());
                                        m.retConfirm(m.getDraw());
                                    }
                                    break;
                                }
                                
                                case "4":
                                {
                                    m.transAccElec();
                                    
                                    for ( i=0; i<Cuentas.size(); i++)
                                    {
                                        if((election-1) == i)
                                        {
                                            
                                        }
                                        else
                                        {
                                        System.out.println((i+1)+" - "+ Cuentas.get(i).getNom()+
                                        " "+ Cuentas.get(i).getApell1()+
                                        " "+ Cuentas.get(i).getApell2());
                                        }
                                    }
                                    System.out.println((i+1)+"Anular operacion");
                                    m.receiver();
                                    int aux= Integer.parseInt(m.getSel());
                                    
                                    if((aux) <= Cuentas.size())
                                    {
                                    m.transQuest();
                                    m.setDraw();
                                    
                                    if(m.getDraw()>Cuentas.get(election-1).getSaldo())
                                    {
                                        m.denyDraw();
                                        m.setDrawto0();
                                    }
                                    else
                                    {
                                        Cuentas.get(election-1).setRetiro(m.getDraw());
                                        Cuentas.get(aux-1).setIngreso(m.getDraw());
                                        m.transConfirm(m.getDraw());
                                    }
                                    }
                                    break;
                                }
                                
                                case "5":
                                {
                                    System.out.println("Saldo: "+Cuentas.get(election-1).getSaldo());
                                    System.out.println("");
                                    break;
                                }
                                
                                case "6":
                                {
                                    menu2= false;
                                    break;
                                }
                                
                                default:
                                {
                                    m.showdefault();
                                }
                            }
                    }
                }
                    System.out.println("");
                    break;
                }
                
                case "3":
                {
                    m.showOff();
                    menu1= false;
                    break;
                }
                
                default:
                {
                    m.showdefault();
                }
            }
        }
    }
}
