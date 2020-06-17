/**
 * This program converts a number of days, weeks, and years into hours.
 * 
 * @author: Kofi Meighan
 * @date: February 7th, 2020
 */

import java.util.Scanner;

public class Hours
{
    public static void main(String[] args)
    {
        //variable declaration and assignment
        Scanner days_input = new Scanner(System.in);
        System.out.println("Please enter a number of days:");
        long days = days_input.nextInt();
        
        Scanner weeks_input = new Scanner(System.in);
        System.out.println("Please enter a number of weeks:");
        long weeks = weeks_input.nextInt();
        
        Scanner years_input = new Scanner(System.in);
        System.out.println("Please enter a number of years:");
        long years = years_input.nextInt();
        
        //calculations
        long hours = (days*24) + (weeks*168) + (years*8760);
        System.out.println("There are "+hours+" hours in "+years+" years, "+weeks+" weeks, and "+days+" days.");
    }
}
 
