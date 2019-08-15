/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 * Modifier : Amitpal Chahal
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;
/**
 * A concrete class that represents any grouping of cards for a Game.
 * HINT, you might want to subclass this more than once.
 * The group of cards has a maximum size attribute which is flexible for reuse.
 * @author dancye
 */
//    public GroupOfCards(int givenSize)
//    {
//        size = givenSize;
//    }

public class GroupOfCards extends Card {
    private ArrayList<Card> cardsInDeck = new ArrayList<>();
    private int cardId = 0;

    public GroupOfCards() {
        
         /**
     * A method that will get the group of cards as an ArrayList
     * @return the group of cards.
     */   
        for (Card.Suit suit : Card.Suit.values()) 
        
        {
            
            for (Card.Value value : Card.Value.values()) {
                
                this.cardsInDeck.add(new Card(suit, value));
            }
        }

        Collections.shuffle(cardsInDeck);
    }
    //    public int getSize() {
//        return size;
//    }
//
//    /**
//     * @param givenSize the max size for the group of cards
//     */
//    public void setSize(int givenSize) {
//        size = givenSize;
//    }

    // dealing a card from deck
    public Card dealNextCard() {
        Card card = cardsInDeck.get(cardId);
        cardId += 1;
        if (cardId > 52) {
            Collections.shuffle(cardsInDeck);
            cardId = 0;
        }
        return card;
    }
}
/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
//package ca.sheridancollege.project;
//
//import java.util.ArrayList;
//import java.util.Collections;
//

//public class GroupOfCards 
//{
//   
//    //The group of cards, stored in an ArrayList
//    private ArrayList <Card> cards;
//    private int size;//the size of the grouping
//    

//    
//    /**
//     * A method that will get the group of cards as an ArrayList
//     * @return the group of cards.
//     */
//    public ArrayList<Card> showCards()
//    {
//        return cards;
//    }
//    
//    public void shuffle()
//    {
//        Collections.shuffle(cards);
//    }
//
//    /**
//     * @return the size of the group of cards
//     */

//    
//}//end class
