package usma.qadri.s991395853;

/**
 * A class that models playing card Objects. Cards have 
 * a value (note that Ace = 1, Jack =11, Queen =12, King = 13)
 * A suit (clubs, hearts, spades, diamonds).
 * There are 52 cards in a deck, no jokers.
 * This code is to be used in Exercise 1. When you create your own branch,
 * add your name as an author.
 * @author dancye
 * @author Paul Bonenfant
 * @author Usma Qadri 991395853 
 * @date 5/31/2021
 * @version 2.1
 * Changes made:
 *Changes made: These changes were made after the assignment was
 * originally submitted. Revisions made related to step 12. I changed the code
 * so it asks the user to input a numerical value (int) to represent the suits
 * as opposed to a string, as requested by the Professor in class on 5/31/21. It
 * now also accounts for incorrect user inputs (incorrect values inputted for
 * card Value and card Suit)
 */
public class Card {

   private String suit; //clubs, spades, diamonds, hearts
   private int value;//1-13

   public static final String [] SUITS = {"Hearts", "Diamonds", "Spades", "Clubs"};
    /**
     * @return the suit
     */
    public String getSuit() {
        return suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(String suit) {
        this.suit = suit;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
    
  
    
}
