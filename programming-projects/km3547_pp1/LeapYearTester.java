/**
*
* This class is the tester for the leap year program.
* You should not make any changes to this class.
*
* @author: KOFI MEIGHAN
* @date: <the date here>
*
*/

import java.util.Scanner;

public class LeapYearTester
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a year");
        int year_input = input.nextInt();
        Year the_year = new Year(year_input);

        if (the_year.isLeapYear())
            System.out.println("That's a leap year!");
        else
            System.out.println("That's not a leap year!");
    }
}



