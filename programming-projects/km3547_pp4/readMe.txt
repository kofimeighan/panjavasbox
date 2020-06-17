KOFI MEIGHAN
KM3547
	

	I began writing this programming project with the Card class. My program ranks cards from 2-14, 2 being a 2 and a 14 being the Ace, and ranks clubs, diamonds, hearts, and spades with 1-4, respectively. Next I populated my compareTo() method by ranking cards first by value, and then with suits to break ties. In addition, I added two accessor methods that returned the suit and value of a specific card.

	In my Deck class, I created a deck of 52 cards by iterating from 1-4 and 2-14 to get a card of each type. To shuffle my deck, the program generates a random number between 0 and 52 and randomly switches two cards as the index in the for loop increases. Lastly, to deal a card I simply incremented the top instance variable by one and returned the card at that index.

	My player class created the hand for the player, and stored their bankroll and bets. I added an extra method called playAgain() that is called within the Game class to verify that the player can play another round (bankroll doesn't equal 0) and that they want to. If they don't, the program prints out their ending bankroll and exits the program.

	In my Game class I create an instance of the player and deck class called p and cards, and enter a while loop within the play() method. I first welcome the player to the program, and the program asks the player what bets they would like to place. In addition, I implemented a while loop that checks the validity of their bet. After, the program shuffles and deals the cards and prints the hand to the player, and ask if the player would like to reject any cards. To replace cards, I created a replace() method that asks how many they would like replace and checks that their answer is within the index of the hand. The program then determines if there are any plays in the player's hand. In the end, my program calls my payout() method in order to adjust their bankroll and give out money based on their hand. At the end of the play() class, the program calls the playAgain() method to see if their payroll is greater than $0.00  if they would like to play again.
