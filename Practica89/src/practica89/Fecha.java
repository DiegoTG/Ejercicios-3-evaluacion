package practica89;

import java.util.*;
/**
 * 
 * @author Diego
 */
public class Fecha {
    
    Calendar c=Calendar.getInstance();
    private int dayint, monthint,yearint;
    private int daytemp, monthtemp, yeartemp;
    private int dayact, monthact, yearact;
    private String fechact;
    private boolean check;
/**
 * Calcular fecha (dias meses y años)
 */ 
public Fecha(){
    this.dayact= c.get(Calendar.DAY_OF_MONTH);
    this.monthact= 1+c.get(Calendar.MONTH);
    this.yearact= c.get(Calendar.YEAR);
    this.fechact= dayact+"/"+monthact+"/"+yearact;
}
public void SaveData(){
    dayint=daytemp;
    monthint=monthtemp;
    yearint=yeartemp;
}
/**
 * return dia
 * @return 
 */
public int getday(){
    return daytemp;
}
/**
 * return mes
 * @return 
 */
public int getmonth(){
    return monthtemp;
}
/**
 * return año
 * @return 
 */
public int getyear(){
    return yeartemp;
}
/**
 * Set dia
 * @param daytemp 
 */
public void setDaytemp(int daytemp){
    this.daytemp= daytemp;
}
/**
 * Set mes
 * @param monthtemp 
 */
public void setMonthtemp(int monthtemp){
    this.monthtemp= monthtemp;
}
/**
 * Set año
 * @param yeartemp 
 */
public void setYeartemp(int yeartemp){
    this.yeartemp= yeartemp;
}
/**
 * Return dia
 * @return 
 */
public int getDayInt(){
    return dayint;
}
/**
 * Return mes
 * @return 
 */
public int getMonthInt(){
    return monthint;
}
/**
 * Return año
 * @return 
 */
public int getYearInt(){
    return yearint;
}
/**
 * Calcular año dia y mes
 */
public void SanityCheck(){        
        check=false;
        int day=daytemp;
        int month=monthtemp;
        int year=yeartemp;
        
        if (day > 31 || month > 12 ){}
        else if (day > 30 && (month==4 || month==6 || month==9 || month==11)){}
        else if (day > 28 && month==2 && year%4!=0){}
        else if (day > 29 && month==2 && year%400==0){}
        else if (day > 28 && month==2 && (year%400!=0 && year%100==0)){}
        else if (day > 29 && month==2 && year%4==0){}
        else
        {
            check=true;
        }
    }
/**
 * Return a calcular año dia y mes
 * @return 
 */
public boolean getCheck(){
    return check;
}
/**
 * Return al menu si falla
 * @return 
 */
public boolean setCheckToFalse(){
        check=false;
        return check;
    }
/**
 * Return fecha
 * @return 
 */
public String getFechact(){
    return fechact;
}
}
