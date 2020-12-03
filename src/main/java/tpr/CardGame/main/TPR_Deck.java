package tpr.CardGame.main;

//import statements
import java.util.ArrayList;
import java.util.Random;
import lombok.Setter;
import lombok.Getter;

/**Trevor Radez
 * 11/15/2020
 * The class contains all of the data and methods needs to manage a deck of cards
 */
@Setter
@Getter
public class TPR_Deck
{
    //the deck list
    private ArrayList<TPR_Card> deck;

    /**
     * No arg constructor that creates the deck of cards
     */
    public TPR_Deck()
    {
        //creates an array containing the suit values
        TPR_Card.Suit[] suitArray = TPR_Card.Suit.values();
        //creates an array containing the card values
        TPR_Card.Value[] valueArray = TPR_Card.Value.values();
        //initialises the deck field
        deck = new ArrayList<>(52);
        //outer for loop for indexing the suit array
        for (TPR_Card.Suit suit : suitArray)
        {
            //inner for loop for indexing the value array
            for (TPR_Card.Value value : valueArray)
            {
                //adds a new card to the array
                deck.add(new TPR_Card(suit , value));
            }
        }
    }

    /**
     * This method shuffles the deck
     */
    public void shuffle()
    {
        //creates a random object
        Random random = new Random();
        //repeats the inner loop 5 times
        for (int i = 0; i < 5; i++)
        {
            //loops for the size of the deck
            for (int count = 0; count < deck.size(); count++)
            {
                //generates a random number that can be up to the deck size
                int moveIndex = random.nextInt(deck.size());
                //gets an element using the random number index
                TPR_Card element = deck.get(moveIndex);
                //removes that element from that spot in the deck
                deck.remove(moveIndex);
                //adds the element to the end of the deck
                deck.add(element);
            }
        }
    }

    /**
     * This method deals a card from the deck and removes the first value
     * @return a card from the deck
     */
    public TPR_Card deal()
    {
        //sets the dealtCard to the first card on the deck
        TPR_Card dealtCard = deck.get(0);
        //removes the first card from the deck
        deck.remove(0);
        //returns the dealt card
        return dealtCard;
    }
}