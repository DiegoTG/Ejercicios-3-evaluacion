package practica87;

public class Practica87 {

    public static void main(String[] args) {
    
    Menu m= new Menu(); 
    Libro l1= new Libro("Bishock", 07,02,2017,04,06,2017);
    Libro l2= new Libro("El señor de los anillos",14,01,2017,12,07,2017);
    Libro l3= new Libro("Retrum", 22,02,2017,22,06,2017);
    
    boolean loop1= true;
    m.Hola();
     while (loop1)
     {
         m.setElection();
         m.setSel();
         
         switch(m.getSel())
         {
             case "1":
             {
                 boolean loop2=true;
                 while (loop2)
                 {
                     m.setBookElection(l1.getLibro(), l2.getLibro(), l3.getLibro());
                     m.setSel();
                     
                     switch(m.getSel())
                     {
                         case "1":
                         {
                             m.BookData(l1.getLibro(), l1.getPrestamo(), l1.getDevolucion());
                             break;
                         }
                         
                         case "2":
                         {
                             m.BookData(l2.getLibro(), l2.getPrestamo(), l2.getDevolucion());
                             break;
                         }
                         
                         case "3":
                         {
                             m.BookData(l3.getLibro(), l3.getPrestamo(), l3.getDevolucion());
                             break;
                         }
                         
                         case "4":
                         {
                             loop2=false;
                             m.showOff();
                             break;
                         }
                         
                         default:
                         {
                             m.showDef();
                         }
                     }
                 }
                 break;
             }
             
             case "2":
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
