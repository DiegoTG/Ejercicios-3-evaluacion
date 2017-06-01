package practica89;

public class Practica89 {

    public static void main(String[] args) {
    
    Fecha f1= new Fecha();
    Menu m= new Menu();
    
    boolean loop1=true;
    
     while(loop1)
     {
         m.Hello();
         m.setSel();
         
         switch(m.getSel())
         {
             case "1":
             {
                 m.ProbeDay();
                 m.setIntValue();
                 f1.setDaytemp(m.getIntValue());
                 
                 m.ProbeMonth();
                 m.setIntValue();
                 f1.setMonthtemp(m.getIntValue());
                 
                 m.ProbeYear();
                 m.setIntValue();
                 f1.setYeartemp(m.getIntValue());
                 
                 f1.SanityCheck();
                 
                 if (f1.getCheck()==true)
                 {
                     System.out.println("La fecha es correcta");
                     System.out.println("");
                     f1.SaveData();
                     System.out.println("La fecha "+f1.getDayInt()+"/"+f1.getMonthInt()+"/"+f1.getYearInt()+" ha sido añadida");
                 }
                 else
                 {
                     System.out.println("Error");
                 }
                f1.setCheckToFalse();
                 break;
             }
             
             case "2":
             {
                 m.FechaAct(f1.getFechact());
                 break;
             }
             
             case "3":
             {
                 loop1=false;
                 m.showOff();
                 break;
             }
         }
     }
    }
    
}
