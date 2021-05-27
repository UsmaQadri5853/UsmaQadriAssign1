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
 * @version 1.8
 * Changes made: Added code to enable the CardTrick class to ask user for the the value and suit of a card. It then compares this information 
 * with the cards in the hand. Code to check hand and playerCard included, but commented out. Program now prints whether the users card
 * is in the hand or not.
 * 
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
        
        /*Used to test if values are being stored in the magicHand array. Displays the hand on the console
        for(int i =0; i<magicHand.length; i++){
           System.out.println("The card is the " + magicHand[i].getValue() + " of " + magicHand[i].getSuit());     
        }
       */
        
        Card luckyCard = new Card();
        luckyCard.setValue(1);
        luckyCard.setSuit("Spades");
        
        /*
        //create a card based on user input 
        Card playerCard = new Card(); 
        Scanner input = new Scanner(System.in);
        //take user input and assign a value to player card
        System.out.println("What is the value of the card 1-13 (Where 1= Ace, 11 = Jack, 12 = Queen, 13 = Queen?)");        
        playerCard.setValue(input.nextInt()); 
        //take user input and assign a suit to the player card
        System.out.println("What is the suit of the card (Hearts, Diamonds, Spades, or Clubs?)");
        playerCard.setSuit(input.next()); 
        
        /* This is to test assignment of value and suit for the playerCard
        System.out.println("Your card is the " + playerCard.getValue() + " of " + playerCard.getSuit());
        */
       
        //takes the value and suit of playerCard and compares it to value and suit of magicHand
        //prints statements if card was found in hand of if it was not found in the hand
        boolean wasCardFound = false;
        for (int i = 0; i < magicHand.length; i++) {
            if(playerCard.getValue()==magicHand[i].getValue() && playerCard.getSuit().equals(magicHand[i].getSuit())){
                wasCardFound = true;
                System.out.println("Your card was in the hand");
                break;
               }              
        } 
        if(wasCardFound == false) {
            System.out.println("Your card was not in the hand");
        }
       
        
        
    }

}
