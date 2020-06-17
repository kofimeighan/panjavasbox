//******************************************************************************
//*KOFI MEIGHAN                                                                *
//*KM3547                                                                      *
//*Card.java- Card class that instantiates a card with its card value and suit.*
//******************************************************************************


public class Card implements Comparable<Card>
{

	private int suit; 
	private int rank; 
	
	public Card(int s, int r)
    {
        suit = s;
        rank = r;
	}
    
    public Card(String rankAndValue)
    {
        suit = 0;
        rank = 0;
       
        if(rankAndValue.length()<3)
        {
            rank = Integer.parseInt(rankAndValue.substring(1, 2));
            if(rank == 1){rank = 14;}
                
            String suitString = rankAndValue.substring(0, 1);
            if(suitString.equals("c")){suit = 1;}
            else if(suitString.equals("d")){suit = 2;}                            
            else if(suitString.equals("h")){suit = 3;}
            else if(suitString.equals("s")){suit = 4;}
        }
        else
        {
            rank = Integer.parseInt(rankAndValue.substring(1,3));
            if(rank == 1){rank = 14;}
                
            String suitString = rankAndValue.substring(0, 1);
            if(suitString.equals("c")){suit = 1;}
            else if(suitString.equals("d")){suit = 2;}                            
            else if(suitString.equals("h")){suit = 3;}
            else if(suitString.equals("s")){suit = 4;}
        }
    }
	
	public int compareTo(Card c)
    {
        //checking if the suits are equal
        if(this.rank == c.rank)
        {
            if(this.suit == c.suit)
            {return 0;}
            else if(this.suit < c.suit){return -1;}
            else if(this.suit > c.suit){return 1;}
        }
        else if(this.rank > c.rank){return 1;}
        else if(this.rank < c.rank){return -1;}
        
        return 0;
	}
	
	public String toString()
    {
        String s = " ";
        String r = " ";
        if(suit == 1) {s = "Clubs ♣";}
        else if(suit == 2) {s = "Diamonds ♦";}
        else if(suit == 3) {s = "Hearts ♥";}
        else if(suit == 4) {s = "Spades ♠";}
        
        if(rank == 2) {r = "2";}
        else if(rank == 3) {r = "3";}
        else if(rank == 4) {r = "4";}
        else if(rank == 5) {r = "5";}
        else if(rank == 6) {r = "6";}
        else if(rank == 7) {r = "7";}
        else if(rank == 8) {r = "8";}
        else if(rank == 9) {r = "9";}
        else if(rank == 10) {r = "10";}
        else if(rank == 11) {r = "J";}
        else if(rank == 12) {r = "Q";}
        else if(rank == 13) {r = "K";}
        else if(rank == 14) {r = "A";}
        
        String temp = r + " of " + s;
        return temp;
	}
    
    public int getRank(){return rank;}
    
    public int getSuit(){return suit;}
}