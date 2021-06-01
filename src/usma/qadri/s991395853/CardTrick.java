package usma.qadri.s991395853;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then
 * asks the user to pick a card and searches the array of cards for the match to
 * the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author Paul Bonenfant
 * @author Usma Qadri 991395853
 * @date 5/31/2021
 * @version 2.1 Changes made: These changes were made after the assignment was
 * originally submitted. Revisions made related to step 12. I changed the code
 * so it asks the user to input a numerical value (int) to represent the suits
 * as opposed to a string, as requested by the Professor in class on 5/31/21. It
 * now also accounts for incorrect user inputs (incorrect values inputted for
 * card Value and card Suit)
 *
 */
public class CardTrick {

    public static void main(String[] args) {

        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            int min = 1;
            int max = 13;
            c.setValue((int) (Math.random() * ((max - min) + 1)) + min);
            c.setSuit(Card.SUITS[(int) Math.floor(Math.random() * Card.SUITS.length)]);
            magicHand[i] = c;
        }

        // done in GitHub. commented out for version 2.1 because version 2.1 is a revision of step 12. 
        // Card luckyCard = new Card();
        // luckyCard.setValue(1);
        // luckyCard.setSuit("Spades");
        
        
        //create a card based on user input 
        Card playerCard = new Card();
        Scanner input = new Scanner(System.in);
        //take user input and assign a value to player card
        System.out.println("What is the value of the card 1-13 (Where 1= Ace, 11 = Jack, 12 = Queen, 13 = King?)");
        int cardValue = input.nextInt();
        while (cardValue <= 0 || cardValue >= 14) {
            System.out.println("Incorrect Input, please try again");
            System.out.println("What is the value of the card 1-13 (Where 1= Ace, 11 = Jack, 12 = Queen, 13 = King?)");
            cardValue = input.nextInt();
        }

        playerCard.setValue(cardValue);

        //take user input and assign a suit to the player card. asks the user for a number (1, 2, 3, or 4) 
        System.out.println("What is the suit of the card (1 = Hearts, 2 = Diamonds, 3 = Spades, or 4 = Clubs?)");
        int playerSuit = input.nextInt();
        while (playerSuit <= 0 || playerSuit >= 5) {
            System.out.println("Incorrect Input, please try again");
            System.out.println("What is the suit of the card (1 = Hearts, 2 = Diamonds, 3 = Spades, or 4 = Clubs?)");
            playerSuit = input.nextInt();
        }
        playerCard.setSuit(Card.SUITS[playerSuit - 1]);

        //takes the value and suit of playerCard and compares it to value and suit of magicHand
        //prints statements if card was found in hand or if it was not found in the hand
        boolean wasCardFound = false;
        for (int i = 0; i < magicHand.length; i++) {
            if (playerCard.getValue() == magicHand[i].getValue() && playerCard.getSuit().equals(magicHand[i].getSuit())) {
                wasCardFound = true;
                System.out.println("Congrats! You win, your card was in the hand.");
                break;
            }
        }
        if (wasCardFound == false) {
            System.out.println("Sorry! You lose, your card was not in the hand.");
        }

    }

}
