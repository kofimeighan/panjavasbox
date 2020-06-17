/*****************************************
 * Kofi Meighan
 * @KM3547
 * Game.java - PLays the game of Nim between a Human PLayer and a Computer
 * in accordance with the Nim class tester, 
 * the Human class, and the Computer class.
 * March 11, 2020
 ****************************************/ 

public class Game
{ 
    private int marbles;
    private Human humanPlayer;
    private Computer computerPlayer;
    final int COMPUTER, HUMAN; 
   
    public Game(int level)
    {
        marbles = (int)((Math.random()*100)+1);
        humanPlayer = new Human();
        computerPlayer = new Computer(level); 
        HUMAN = 1;
        COMPUTER = 2;
    }
    
    public Game()
    {
        marbles = (int)((Math.random()*100)+1);
        humanPlayer = new Human();
        computerPlayer = new Computer((int)Math.random()*2+1);
        HUMAN = 1;
        COMPUTER = 2;    
    }

    public void play()
    {
        System.out.println("There are "+marbles+" marbles in the pile.");
        int decider = (int)((Math.random()*2)+1);
        int turn = 0;
            
        if(decider == 1)//human goes first
        {
            System.out.println("***You will go first***");
            while(marbles > 0)
            {
                turn = HUMAN;
                humanPlayer.move();
                if(humanPlayer.validMove(marbles))
                {
                    marbles = marbles - humanPlayer.getChoice();
                    System.out.println("There are now "+
                    marbles+" marbles in the pile.");
                }
                else
                {
                   while(!(humanPlayer.validMove(marbles)))
                   {
                       System.out.println("Please choose" + 
                       " a number between1 and "+marbles/2+".");
                       humanPlayer.move();
                   }
                   marbles = marbles - humanPlayer.getChoice();
                   System.out.println("There are now "+marbles+" in the pile.");
                }
                
                if(marbles>0)
                {
                turn = COMPUTER;
                computerPlayer.move(marbles);
                marbles = marbles - computerPlayer.getChoice();
                System.out.println("The computer took "+
                computerPlayer.getChoice()+ " marbles.");
                System.out.println("There are now "+
                marbles+" marbles in the pile.");   
                }
             }
            if(turn == COMPUTER)
            {
                System.out.println("YOU WIN!!!!!!!!!!!!!!");
            }
            else
            {
                System.out.println("You lose :((((((((");
            }
        }
        
        // computer goes first
        else 
        {
           System.out.println("***The computer will go first***");
           while(marbles > 0)
           {
               if(marbles>0)
               {
                   turn = COMPUTER;
                   computerPlayer.move(marbles);
                   marbles = marbles - computerPlayer.getChoice();
                   System.out.println("The computer took "+
                   computerPlayer.getChoice()+ " marbles.");
                   System.out.println("There are now "+
                   marbles+" marbles in the pile.");
               }
               
               if(marbles > 0)
               {
                   turn = HUMAN;
                   humanPlayer.move();
                   if(humanPlayer.validMove(marbles))
                   {
                       marbles = marbles - humanPlayer.getChoice();
                       System.out.println("There are now "+
                       marbles+" marbles in the pile.");
                    
                    }
                    else
                    {
                        while(!(humanPlayer.validMove(marbles)))
                        {
                            System.out.println("Please choose "+
                            "a number between 1 and "+marbles/2+".");
                            humanPlayer.move();
                        }
                        marbles = marbles - humanPlayer.getChoice();
                        System.out.println("There are now "+
                        marbles+" marbles in the pile.");
                    }
               }
           }
            
           if(turn == COMPUTER)
           {
               System.out.println("YOU WIN!!!!!!!!!!!!!!");
           }
           else
           {
               System.out.println("You lose :(((((");
           }
        }
    }
}
