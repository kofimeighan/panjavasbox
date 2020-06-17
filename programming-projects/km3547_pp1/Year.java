/**
*
* This class represents a calendar year. It contains 
* a method that determines if the year is a leap year.
* 
* @author: KOFI MEIGHAN
* @date: 2/10/20
*
*/

public class Year{
    private  int year;
    public boolean isLeap;
    
    public Year(int y){
        year=y;
    }
    public boolean isLeapYear(){
        isLeap = false;
        if ((year%400 == 0)||((year%4 == 0)&&(year%100 != 0))){
            isLeap = true;
        }
        return isLeap;
    }
}

