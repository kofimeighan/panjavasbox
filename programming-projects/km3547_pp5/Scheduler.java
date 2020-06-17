//******************************************************************************
//*KOFI MEIGHAN                                                                *
//*KM3547                                                                      *
//*Scheduler.java - A class of static methods to create a schedule given a text*
//*document with speaker name, start time, and end times.                      *
//******************************************************************************

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.NoSuchElementException;
import java.io.*;

public class Scheduler
{

    public static ArrayList<Talk> makeTalks(String fileName) throws IOException
    {
        ArrayList<Talk> list = new ArrayList<Talk>();
        File inputFile = new File(fileName);
        Scanner input = new Scanner(inputFile);
        
        try
        {
            while(input.hasNext())
            {
                String line = input.nextLine();
                String[] lineArray = line.split("\\s+");
                int startTime = Integer.parseInt(lineArray[1]);
                int endTime = Integer.parseInt(lineArray[2]);
                
                
                if((startTime>endTime) || (startTime > 2359) || 
                   (endTime > 2359) || ((startTime%100) > 59) ||
                   ((endTime%100) > 59))
                {
                    throw new IOException();
                }
                else
                {
                    Talk tempTalk = new 
                        Talk(lineArray[0], lineArray[1], lineArray[2]);
                    list.add(tempTalk);   
                }

                
            }

            return list;
        }
        catch(NumberFormatException nfe)
        {
            System.out.println("Please format the times correctly");
            ArrayList<Talk> temp = new ArrayList<Talk>();
            return temp;
        }
        catch(NoSuchElementException NSEE)
        {
            System.out.println("There is no such element.");
            ArrayList<Talk> temp = new ArrayList<Talk>();
            return temp;
        }
        catch(IOException IOE)
        {
            System.out.println("There was a problem reading "
                               +"times in your file.");
            ArrayList<Talk> temp = new ArrayList<Talk>();
            return temp;
        }
    }
    
    public static ArrayList<Talk> scheduleTalks(ArrayList<Talk> talks) 
                                  throws IndexOutOfBoundsException
    {
        Collections.sort(talks);
        
        ArrayList<Talk> schedule = new ArrayList<Talk>();
        try
        {
            schedule.add(talks.get(0));
            talks.remove(0);
        
            for(Talk element:talks)
            {
                if(schedule.get(schedule.size()-1).getEndTime() 
                   <= element.getStartTime())
                {
                    schedule.add(element);
                }
            }
        
            return schedule;   
        }
        catch(IndexOutOfBoundsException IOOBE)
        {
            ArrayList<Talk> temp = new ArrayList<Talk>();
            return temp;
        }
    }
}