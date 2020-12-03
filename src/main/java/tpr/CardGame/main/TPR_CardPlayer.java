package tpr.CardGame.main;

//import statement
import java.util.LinkedList;
import lombok.Getter;
import lombok.Setter;

/**Trevor Radez
 * 11/15/2020
 * This class contains the necessary methods to manage a card hand
 */
@Getter
@Setter
public class TPR_CardPlayer
{
    //field
    private LinkedList<TPR_Card> hand;

    /**
     * No arg constructor that initializes the hand list
     */
    public TPR_CardPlayer()
    {
        hand = new LinkedList<>();
    }

    /**
     * This method adds a card one at a time to the list
     * @param card the card
     */
    public void getCard(TPR_Card card)
    {
        hand.add(card);
    }

    /**
     * This method prints the hand to the screen using the toString method of each card object
     */
    public void showCards()
    {
        for (TPR_Card card : hand)
        {
            System.out.println(card);
        }
    }

}