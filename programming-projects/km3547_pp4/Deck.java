//******************************************************************************
//*KOFI MEIGHAN                                                                *
//*KM3547                                                                      *
//*Deck.java - Deck class that instantiates each object card into a deck.      *
//******************************************************************************

public class Deck 
{
	
	private Card[] cards;
	private int top; 
	
	public Deck()
    {
        top = 0;
        int cardNumber = 0;
        cards = new Card[52];
        
        for(int s = 1; s<5; s++)
        {
            for(int r = 2; r<15; r++)
            {
                cards[cardNumber] = new Card(s,r);
                cardNumber++;
            }
        }
	}
	
	public void shuffle()
    {
        top = 0;
        int randomCard;
        
        for(int i = 0; i<51; i++)
        {
            randomCard = (int)(Math.random()*52);
            Card tempCard = cards[randomCard];
            cards[randomCard] = cards[i];
            cards[i] = tempCard;    
        }
	}
    
	
	public Card deal()
    {
        top++;
        return cards[top-1];
	}
}