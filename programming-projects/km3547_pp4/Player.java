//******************************************************************************
//*KOFI MEIGHAN                                                                *
//*KM3547                                                                      *
//*Player.java - Creates a player object that determines the hand, bankroll,   *
//*and bets.                                                                   *
//******************************************************************************


import java.util.ArrayList;
import java.text.NumberFormat;
import java.util.Scanner;

public class Player 
{
		
	private ArrayList<Card> hand; 
	private double bankroll; 
    private double bet; 

	public Player()
    {
        bankroll = 20.0;
        bet = 0.0;
        hand = new ArrayList<Card>();
	}

	public void addCard(Card c)
    {
        hand.add(c);
	}

	public void removeCard(Card c)
    {
        hand.remove(c);
    }

    
    public ArrayList<Card> getHand(){return hand;}
    
    public void bets()
    {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        System.out.println("Your current bankroll is: "+ 
                           fmt.format(bankroll) +"\n");
        
        if(bankroll >= 5.0)
        {
            Scanner betInput = new Scanner(System.in);
            System.out.println("How much would you like to bet for this round?"+
                 " The highest you can bet is $5.00 and the lowest is $1.00.");
            double actualBet = betInput.nextDouble();
            
            while((actualBet > 5.0) || (actualBet <= 1))
            {
                Scanner whileBetInput = new Scanner(System.in);
                System.out.println("Please enter a valid bet between $1.00 and "
                                                                   + "$5.00.");
                actualBet = whileBetInput.nextDouble();
            }
            
            bet = actualBet;
            bankroll -= bet;
        }
        else
        {
            Scanner betInput = new Scanner(System.in);
            System.out.println("How much would you like to bet for this round?"+
                                                  " The highest you can bet is "
                             +fmt.format(bankroll)+" and the lowest is $1.00.");
            double actualBet = betInput.nextDouble();
            while(actualBet > bankroll)
            {
                Scanner whileBetInput = new Scanner(System.in);
                System.out.println("Please enter a valid bet between $1.00 and "
                                                        + fmt.format(bankroll));
                actualBet = whileBetInput.nextDouble();
            }
            
            bet = actualBet;
            bankroll -= bet;  
            System.out.println(fmt.format(bankroll));
        }  
    }
    
    public void payout(double odds)
    {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        bankroll+= (odds*bet);
        if(odds == 0)
        {
            System.out.println("Your bankroll is "+
                              fmt.format(bankroll));
        }
        else
        {
            System.out.println("Congratulations! You won "
                                    +fmt.format(odds*bet)+              
                               "!\nYour bankroll is now: "
                                   +fmt.format(bankroll));
        }
        
        bet = 0;
    }
                           
    public String getBankroll()
    {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();

        return fmt.format(bankroll);
    }
    
    public boolean playAgain()
    {
        if(bankroll == 0.0)
        {
            System.out.println("You're out of money! Better luck next time :)");
            return false;
        }
        
        Scanner playInput = new Scanner(System.in);
        System.out.println("Would you like to play again?" +
        " Please say 'yes' or type anything else to exit.");
        String keepPlaying = playInput.nextLine();
        if(keepPlaying.equals("yes"))
        {
            hand.clear();
            System.out.println("\n\n\n**********NEW ROUND!**********\n");
            return true;
        }
        else
        {
            System.out.println("\nYour ending bankroll is: "+
                               getBankroll()+
                              "\nDon't spend it all :^)");
            return false;
        }
        
      }
}