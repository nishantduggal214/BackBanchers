/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Modifier: Amitpal Chahal
 */
package ca.sheridancollege.project;


public class Card {

    public enum Suit {Spade, Club, Hearts, diamond};//suit
    
    
    public enum Value {One, Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King};//cards.....One added instead of ace
    
    
    private Value value = null;
    
    
    private Suit suit = null;

    public Card() {

    }

    
    public Card(Suit s, Value gVal) {
        
        setSuit(s);
        
        setValue(gVal);
    }
//-----------------Getters-----------------
    public Value getValue() {
        return this.value;
    }

    public Suit getSuit() {
        return this.suit;
    }
//--------------Setters---------------------
    public void setValue(Value value) {
        this.value = value;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

}
