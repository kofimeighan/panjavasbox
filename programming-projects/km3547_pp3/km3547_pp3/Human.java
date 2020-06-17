/*****************************************
 * Kofi Meighan
 * @KM3547
 * Human.java - Class that allows the human to play with the computer.
 * Asks the human how many marbles they would like to take, and contains a
 * method that checks whether it's a legal move in the game of nim or not.
 * March 11, 2020
 ****************************************/ 
import java.util.Scanner;

public class Human
{
    private int choice;
    private Scanner input;
    
    public Human()
    {
        input=new Scanner(System.in);
        choice = -1; 
    }
    
    public void move()
    {
        System.out.println("How many marbles would you like to take?");
        choice = input.nextInt();        
    }
    
    public int getChoice()
    {
        return choice;
    }
    
    public boolean validMove(int marblesLeft)
    {
        if(marblesLeft==1||(getChoice()<=(marblesLeft/2))&&(getChoice() >= 1))
        {
            return true;
        }
        else 
        {
            return false;
        }
    }   
}
