package tpr.CardGame.main;

import lombok.*;

/**Trevor Radez
 * 11/15/2020
 * This class contains all of the methods necessary to store data for a playing card
 */

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TPR_Card
{
    //enumerated values for the card suit and the value
    enum Suit {CLUBS , HEARTS, DIAMONDS , SPADES}
    enum Value {TWO , THREE , FOUR , FIVE , SIX , SEVEN , EIGHT , NINE , TEN , JACK , QUEEN , KING , ACE}

    //fields
    private Suit cardSuit;
    private Value cardValue;

    public String toString()
    {
        return "Card Suit: " + cardSuit + "\t\tCard Value: " + cardValue;
    }
}
