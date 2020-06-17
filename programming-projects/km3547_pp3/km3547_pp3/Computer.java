/*****************************************
 * Kofi Meighan
 * @KM3547
 * Computer.java - Chooses the difficulty which the computer plays on, and
 * chooses a legal move for the computer to make.
 * March 11, 2020
 ****************************************/ 

public class Computer
{
    private int mode;
    private int choice;
    
    public Computer(int m)
    {
        mode = m;
        choice = -1;
    }
    
    public void move(int marblesLeft)
    {
        if(mode == 1) //stupid mode
        {
            choice = (int)(Math.random()*(marblesLeft/2))+1;
        }
        
        else if(mode == 2)//hard mode
        {  
            if(marblesLeft == 2)
            {
                choice = 1;
            }
            else if((marblesLeft == 3)||(marblesLeft==7)||(marblesLeft==15)
                    ||(marblesLeft==31)||(marblesLeft==63))
            {
                choice = (int)(Math.random()*(marblesLeft/2)+1);
            }
            else if(marblesLeft >= Math.pow(2,6))
            {
                choice = marblesLeft - 63;
            }
            else if((marblesLeft >= Math.pow(2,5)))
            {
                choice = marblesLeft - 31;
            }
            else if((marblesLeft >= Math.pow(2,4)))
            {
                choice = marblesLeft - 15;
            }
            else if((marblesLeft >= Math.pow(2,3)))
            {
                choice = marblesLeft - 7;  
            }
            else if((marblesLeft >= Math.pow(2,2)))
            {
                choice = marblesLeft - 3;  
            }
        }
     
    }
    
    public int getChoice()
    {
        return choice;
    } 
}
