package practica88;

import java.util.ArrayList;

public class Practica88 {

    public static void main(String[] args) {
        
        int i;
        ArrayList <Libro> Libros= new ArrayList <Libro>();
        Menu m= new Menu();
        m.Welcome();
        
        boolean loop1= true;
        
        while(loop1)
        {
            m.Options();
            m.setSel();
            
            switch(m.getSel())
            {
                case "1":
                {
                    Libros.add(new Libro (m.setBookName(), m.setBookISBN(), m.setBookEdit()));
                    break;
                }
                
                case "2":
                {
                    m.Prestamo();                    
                    for (i=0; i<Libros.size(); i++)
                    {
                        System.out.println((i+1)+"- "+Libros.get(i).getLibro());
                    }
                    System.out.println(i+1+"- Volver atras");
                    m.setSel();
                    
                    int election= Integer.parseInt(m.getSel());
                    
                    if (election<=Libros.size())
                    {
                        m.fechaPrestamo();
                        m.setSel();
                        m.fechaPrestamoConfirm(m.getSel());
                        
                        if(m.getProbe()!=null)
                        { 
                            m.Matcher(m.getProbe());
                            m.SanityCheck(m.getDay(), m.getMonth(), m.getYear());
                            System.out.println(m.getCheck());
                            
                            if (m.getCheck())
                            {
                                Libros.get(election-1).Prestar(m.getDay(), m.getMonth(), m.getYear());
                                Libros.get(election-1).setEstado();
                                System.out.println("Correcto");
                            }
                            else
                            {
                                m.showDef();
                            }
                        m.setCheckToFalse();
                        }
                        else
                        {
                            m.showDef();
                        }
                        //Libros.get(election-1).Prestar()
                    }
                    break;
                }
                
                case "3":
                {
                    m.introBook();
                    for (i=0; i<Libros.size(); i++)
                    {
                        m.BookData(Libros.get(i).getLibro(), Libros.get(i).getISBN(), Libros.get(i).getEditorial(),Libros.get(i).getEstado());
                    }
                    System.out.println(i+1+"Menu");
                    m.setSel();                    
                    break;
                }
                
                case "4":
                {
                    loop1=false;
                    m.showOff();
                    break;
                }
                
                default:
                {
                    m.showDef();
                }
                
                
            }
        }
    }
    
}
