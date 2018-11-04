/* Author: Zain Raza
 *
 * Description: RazaPlayingWithCards.java
 * Explains different card hands to exemplify use of 
 * an enumerated type in displaying output.
 *
 * Due Date: Wednesday, September 12, 2018
 */
  
 public class RazaPlayingWithCards
 {
 /*
  *@enum type Rank
  *Defined with values of various card values.
  */
 	enum Rank{ace, two, three, four, five, six, seven, eight,
  		nine, ten, jack, queen, king} 
  
  public static void main(String[] args)
  {
  	// declaring and initializing variables of @enum type Rank
  	Rank highCard = Rank.ace;
  	Rank faceCard = Rank.jack;
  	Rank card1 = Rank.four;
  	Rank card2 = Rank.five;
  	
  	// output describes two more kinds of hands
    // uses face values of two card objects
   	System.out.println("A blackjack hand: ace and " + faceCard);
   
   // declaring and initializing ordinal values of card1 and card2 to new  int variables 
    int card1Val, card2Val;
    	card1Val = card1.ordinal();
    	card2Val = card2.ordinal();
    
    // output describes another type of hand 
    // uses ordinal values next two card objects to output hand value	
    System.out.println("A two card hand: " + card1Val +
    						" and " + card2Val);
    System.out.println("Hand value: " + (card1Val + card2Val));
    
  } 
 }