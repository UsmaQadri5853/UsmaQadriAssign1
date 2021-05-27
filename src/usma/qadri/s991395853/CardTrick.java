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
 * @version 1.6
 * Changes made: added a print statement in CardTrick. Added scanner class to 
 * take user input to create a new card (currently incomplete) 
 * Issues: Prints null for each card 
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
            System.out.println(magicHand[i]+ "");      
            
        }
        
        Card playerCard = new Card(); 
        Scanner input = new Scanner(System.in);
        System.out.println("What is the value of the card 1-13 (Where 1= Ace, 11 = Jack, 12 = Queen, 13 = Queen?)");
        playerCard.setValue(input.nextInt()); 
        System.out.println("What is the suit of the card (Hearts, Diamonds, Spades, or Clubs? ");
        playerCard.setSuit(input.next()); 
        
        // I am still building this
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }

}
