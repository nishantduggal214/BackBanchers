/*
Made by Amitpal Chahal
*/
package ca.sheridancollege.project;

import java.util.ArrayList;


public class Hand {
    private ArrayList<Card> cards = new ArrayList<>();
    private int handTotal = 0;


    public void getCard(Card card) {
        cards.add(card);
        sethandTotal(card.getValue());

    }

    public ArrayList<Card> getHand() {
        return this.cards;
    }

    public int gethandTotal() {
        return handTotal;
    }


    public void sethandTotal(Card.Value handTotal) {
        this.handTotal += Card.Value.valueOf(handTotal.toString()).ordinal() + 1;
    }
}
