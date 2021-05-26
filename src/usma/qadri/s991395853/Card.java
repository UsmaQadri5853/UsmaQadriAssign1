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
 * @date 5/26/2021
 * @version 1.5 
 * Changes made: added setValue method in card.java. created algorithm 
 * to randomly select a cardValue from 1-13 and select a random suit from the 
 * SUITS array
 *
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
  
    
}
