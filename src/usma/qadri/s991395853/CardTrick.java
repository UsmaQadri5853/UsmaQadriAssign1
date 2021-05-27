package usma.qadri.s991395853;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author Paul Bonenfant
 * @author Usma Qadri 991395853 
 * @date 5/27/2021
 * @version 1.7
 * Changes made: added magicHand[i]=c; to save cards in the magicHand array 
 * Includes a test (commented out) to see the random cards in the magicHand array
 * getValue() method added in Card.java
 */
public class CardTrick {

    public static void main(String[] args) {
        
        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            int min = 1; 
            int max = 13; 
            c.setValue ((int)(Math.random() * ((max-min) + 1)) + min);
            c.setSuit (Card.SUITS[(int) Math.floor(Math.random() * Card.SUITS.length)]);
            magicHand[i] = c;     
        }
        
        /* Used to test if values are being stored in the magicHand array
        for(int i =0; i<magicHand.length; i++){
           // int studentNumber = i + 1;
              System.out.println("The card is the " + magicHand[i].getValue() + " of " + magicHand[i].getSuit());     
        }
        */
              
        //create a card based on user input 
        Card playerCard = new Card(); 
        Scanner input = new Scanner(System.in);
        //take user input and assign a value to player card
        System.out.println("What is the value of the card 1-13 (Where 1= Ace, 11 = Jack, 12 = Queen, 13 = Queen?)");        
        playerCard.setValue(input.nextInt()); 
        //take user input and assign a suit to the player card
        System.out.println("What is the suit of the card (Hearts, Diamonds, Spades, or Clubs?)");
        playerCard.setSuit(input.next()); 
        
       
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }

}
