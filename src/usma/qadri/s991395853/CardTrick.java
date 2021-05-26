package usma.qadri.s991395853;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author Paul Bonenfant
 * @author Usma Qadri 991395853 
 * @date 5/26/2021
 * @version 1.5
 * Changes made: added setValue method in card.java. created algorithm 
 * to randomly select a cardValue from 1-13 and select a random suit from the 
 * SUITS array
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
                          
        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }

}
