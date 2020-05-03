//******************************************************************************
//*KOFI MEIGHAN                                                                *
//*KM3547                                                                      *
//*Game.java - Creates an instance of Game to play poker with a deck,          *
//*and a player.                                                               *
//******************************************************************************

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Game 
{
	
	private Player p;
	private Deck cards;
    private boolean play;	
	
	public Game(String[] testHand)
    {
        p = new Player();
        cards = new Deck();
        play = true;
        
        for(String element:testHand)
        {
            Card temp = new Card(element);
            p.addCard(temp);
        }
	} 
	
	public Game()
    {
        p = new Player();
        cards = new Deck();
        play = true;
	}
	
	public void play()
    {
        System.out.println("*********Welcome to Poker!**********\n");
        
        while(play)
        {
            p.bets(); // placing bets

            cards.shuffle(); //shuffling

            deal(); //dealing

            System.out.println("\nYour hand is:\n" + p.getHand()+"\n");

            replace(p.getHand()); //changing cards

            System.out.println(checkHand(p.getHand())); //determines the hand
            
            play = p.playAgain();//asks if the player wants and can play again
            }
                
        }
	
	
	public String checkHand(ArrayList<Card> hand)
    {
        int payout = 0;
        String handType = " ";
        Collections.sort(hand);
        
        if(royalFlush(hand))
        {
            payout = 250;
            handType = "Your hand is a Royal Flush!\n";
        }
        else if(straightFlush(hand))
        {
            payout = 50;
            handType = "Your hand is a Straight Flush!\n";
        }
        else if(fourOfAKind(hand))
        {
            payout = 25;
            handType = "Your hand is a 4 of a Kind!\n";
        }
        else if(fullHouse(hand))
        {
            payout = 6;
            handType = "Your hand is a Full House!\n";
        }
        else if(flush(hand))
        {
            payout = 5;
            handType = "Your hand is a Flush!\n";
        }
        else if(straight(hand))
        {
            payout = 4;
            handType = "Your hand is a Straight!\n";
        }
        else if(threeOfAKind(hand))
        {
            payout = 3;
            handType = "Your hand is a 3 of a Kind!\n";
        }
        else if(twoPair(hand))
        {
            payout = 2;
            handType = "Your hand is a Two Pair!\n";
        }
        else if(pair(hand))
        {
            payout = 1;
            handType = "Your hand is a Pair!\n";
        }
        else 
        {
            handType = "You had no pairs.";
        }
        
        System.out.println(handType);
        p.payout(payout);
        return "\n";
	}

    public boolean royalFlush(ArrayList<Card> hand) //#1
    {return(straightFlush(hand) && (hand.get(0).getRank() == 10));}
     
        
    public boolean straightFlush(ArrayList<Card> hand) //#2
    {
        int suitMatches = 0;
        boolean sorted = true;
        for(int i = 0; i<4; i++)
        {
            // 
            if((hand.get(i).getSuit()) == (hand.get(i+1).getSuit()))
            { 
                suitMatches++;
            }
            if(hand.get(i).getRank() != (hand.get(i+1).getRank()-1) )
            {
                sorted = false;
            }
            if((hand.get(0).getRank() == 2) && 
               (hand.get(1).getRank() == 3) && 
               (hand.get(2).getRank() == 4) && 
               (hand.get(3).getRank() == 5) && 
               (hand.get(4).getRank() == 14))
            {
                sorted = true;
            }
        }
        
        if((suitMatches == 4) && (sorted))
        {
            return true;
        }
        
        return false;
    }
    
    public boolean fourOfAKind(ArrayList<Card> hand) //#3
    {
        
        int rankMatches = 0;
        for(Card element:hand)
        {
            for(Card checkElement:hand)
            {
                if(element.getRank() == checkElement.getRank())
                {
                    rankMatches++;
                }
            }
            
            if(rankMatches == 4)
            {
                return true;
            }
            else
            {
                rankMatches = 0;
            }
        }
        
        return false;
        
    }
               
    public boolean fullHouse(ArrayList<Card> hand) //#4
    {
        return(threeOfAKind(hand) && pair(hand));
    }
               
    public boolean flush(ArrayList<Card> hand) //#5
    {
        int suitMatches = 0;
        
        for(int i = 0; i<4; i++)
        {
            if((hand.get(i).getSuit()) == (hand.get(i+1).getSuit()))
            {suitMatches++;}
        }
        
        if(suitMatches == 4)
        {
            return true;
        }
        
        return false; 
    }
    
    public boolean straight(ArrayList<Card> hand) //#6
    {
        
        if((!(pair(hand))) && (!(twoPair(hand))) && 
           ((hand.get(4).getRank() - hand.get(0).getRank()) == 4))
        {
            return true;       
        }
        
        if((hand.get(0).getRank() == 2) && 
               (hand.get(1).getRank() == 3) && 
               (hand.get(2).getRank() == 4) && 
               (hand.get(3).getRank() == 5) && 
               (hand.get(4).getRank() == 14))
            {
                return true;
            }
            
        return false;
    }
    
    public boolean threeOfAKind(ArrayList<Card> hand) //7
    {
        int rankMatches = 0;
        for(Card element:hand)
        {
            for(Card checkElement:hand)
            {
                if(element.getRank() == checkElement.getRank())
                {
                    rankMatches++;
                }
            }
            
            if(rankMatches == 3)
            {
                return true;
            }
            else
            {
                rankMatches = 0;
            }
        }
        
        return false;
                
    }
    
    public boolean twoPair(ArrayList<Card> hand) //8
    {
        int pairs = 0;
        
        for(int i = 0; i<4; i++)
        {
            if(hand.get(i).getRank() == hand.get(i+1).getRank())
            {
                pairs++;         
            } 
        }
        
        if(pairs == 2)
        {
            return true;
        }
        
        return false;
                
    }
            
    public boolean pair(ArrayList<Card> hand) //9
    {
        
        int pairs = 0;
        for(int i = 0; i<4; i++)
        {
            if(hand.get(i).getRank() == hand.get(i+1).getRank())
            {
                pairs++;         
            } 
        }
        
        if(pairs == 1)
        {
            return true;
        }
        
        return false;
                
    }
    
    public void deal()
    {
        if(p.getHand().size() == 0)
        {
            System.out.println("\nDEALING...\n");
            for(int i = 0; i<5; i++) //dealing cards
            {
                p.addCard(cards.deal());
            }
        }
        
    }
            
    public void replace(ArrayList<Card> hand)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("How many cards would you like to replace? "+
                           "Please choose a number from 0 to 5.");
        int cardsToReplace = input.nextInt();
        
        
        //input validation for the amt of cards
        while((cardsToReplace > 5) || (cardsToReplace <0))
        {
            Scanner nextInput = new Scanner(System.in);
            System.out.println("Please choose a number to replace "
                               +"between 1 and 5.");
            cardsToReplace = nextInput.nextInt();         
        }
        
        for(int i = 0; i<cardsToReplace; i++)
        {
            System.out.println("\nYour current hand is:\n" +
                               p.getHand() +
                               ".\n\nWhich card would you like to replace now? "
                                                   +"Choose a number from 1 to "
                                                           +p.getHand().size());
            int cardIndex = input.nextInt();
            
            //input validation for which card to replace
            while((cardIndex > p.getHand().size()) || (cardIndex <0))
            {
                Scanner nextInput = new Scanner(System.in);
                System.out.println("Please choose a number between 1 and "
                                                     +p.getHand().size());
                cardIndex = nextInput.nextInt();         
            }
            
            p.removeCard(hand.get(cardIndex-1));
        }
        
        for(int i = 0; i<cardsToReplace; i++)
        {
            p.addCard(cards.deal());
        }
        
        System.out.println("\nYour new hand is: \n"+ p.getHand()+"\n");
    }	
}
