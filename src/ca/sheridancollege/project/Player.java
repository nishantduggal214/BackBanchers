/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;


public class Player {
    private Hand hand = new Hand();
    private int bet = 0;
    private String playerId;

 


    Player(String name) {
        super();
        this.setPlayerId(name);
    }

    public void hit(Card card) {
        hand.getCard(card);
    }

    public ArrayList<Card> getHand() {
        return hand.getHand();
    }
    public String getPlayerId() {
        return playerId;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    public void setBet(int bet) {
        this.bet = bet;
    }

    public double bankBalance() {
        return bet * 2;
    }

    public int gethandTotal() {
        return hand.gethandTotal();
    }

    public void resetHand(){
        hand = new Hand();
    }
}
