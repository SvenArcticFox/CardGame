package tpr.CardGame.main;

/**Trevor Radez
 * 11/15/2020
 * This class demonstrates all of the objects
 */
public class TPR_CardGameDemo
{
    public static void main(String[] args)
    {
        //creates a deck object
        TPR_Deck deck = new TPR_Deck();
        //shuffles the deck
        deck.shuffle();
        //creates two cardPlayer objects
        TPR_CardPlayer cardPlayer1 = new TPR_CardPlayer();
        TPR_CardPlayer cardPlayer2 = new TPR_CardPlayer();
        //deals 5 cards to both card player objects
        for (int count = 0; count < 5; count++)
        {
            cardPlayer1.getCard(deck.deal());
        }
        for (int count = 0; count < 5; count++)
        {
            cardPlayer2.getCard(deck.deal());
        }
        //prints what cards are in both hands
        System.out.println("Hand 1:");
        cardPlayer1.showCards();
        System.out.println("Hand 2:");
        cardPlayer2.showCards();
    }
}