//******************************************************************************
//*KOFI MEIGHAN                                                                *
//*KM3547                                                                      *
//*Talk.java - Talk class that describes a talk object with different speakers,*
//* start times, and end times.                                                *
//******************************************************************************


public class Talk implements Comparable<Talk>
{
    String speaker;
    int startTime,endTime;
    
    public Talk(String speaker, String startTime, String endTime)
    {
        this.speaker = speaker;
        this.startTime = Integer.parseInt(startTime);
        this.endTime = Integer.parseInt(endTime);
    }
    
    public int compareTo(Talk t)
    {
        if(this.endTime > t.endTime)
        {
            return 1;
        }
        else if(this.endTime < t.endTime)
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }
    
    public String toString()
    {
        
        String title = speaker + ": " + formatTime(startTime)
                       + " - " + formatTime(endTime);
        
        return title;
    }
    
    public int getStartTime()
    {
        return startTime;
    }
    
    public int getEndTime()
    {
        return endTime;
    }
    
    private String formatTime(int time)
    {
        String stringTime = String.valueOf(time);
        if(stringTime.length()==3)
        {
            stringTime = stringTime.substring(0,1)
                         + ":" + stringTime.substring(1,3);   
        }
        else
        {
            stringTime = stringTime.substring(0,2) 
                         + ":" + stringTime.substring(2,4);   
        }
        
        return stringTime;
    }
    
}