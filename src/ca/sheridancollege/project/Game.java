/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 * Modifier : Amitpal Chahal
 */
package ca.sheridancollege.project;

import java.util.Scanner;

public class Game {
    private final Scanner sc = new Scanner(System.in);
    private final Player dealer = new Player("Dealer");// Dealer object created(has properties of player)
    private final GroupOfCards deck = new GroupOfCards();
    private Player player;

    Game() {
        dealer.hit(deck.dealNextCard());
        dealer.hit(deck.dealNextCard());
    }// Gets 2 cards at beggining

    public void start() {
        System.out.println("Welcome to BlackJack");
        System.out.println("---------------------------------------------------");
        
        
        System.out.println("Player name: ");// gets player name
        String name = sc.nextLine();
        player = new Player(name);// makes a player object
        System.out.println("Good Luck, "+name);
        
         System.out.println("---------------------------------------------------");

   
        System.out.println("Place your bet: ");
        int bet = sc.nextInt();// asks for bet....winning = 2*bet
        player.setBet(bet);
        player.hit(deck.dealNextCard());
        player.hit(deck.dealNextCard());//player gets 2 cads at starting
    playerTurn();
    }
    
     
         public void playerTurn() {
        
       
        String choice = sc.nextLine();
        
        try {
            do {
                printHand(player);
                System.out.println("Enter Your Choice - Hit or Stand?");
                choice = sc.nextLine();
                if (choice.toLowerCase().equals("stand")) {
                    playDealerTurn();
                    break;
                }
                //------Checks sum---------
                player.hit(deck.dealNextCard());
                if (player.gethandTotal() > 21) {
                    printHand(player); 
                    System.out.println("---------------------------------------------------");
                    System.out.println("You busted. Sum = "+player.gethandTotal());
                     System.out.println("---------------------------------------------------");
                    
                    System.exit(0);
                    return;
                }
                
            } while (choice.toLowerCase().equals("hit"));
        } catch (Exception ex) {
            System.out.println("Invalid Choice");
        }
    }

    public void printHand(Player player) {
          System.out.println("-------------------------------Your Hand"
                    + "--------------------------------"); 
        for (Card card : player.getHand()) {
         
            System.out.println(card.getValue() + " ( " + card.getSuit()+" )");
         
        }
          System.out.println("-------------------------------"
                    + "--------------------------------"); 
    }

    public void playDealerTurn() {
        if (dealer.gethandTotal() <= 17 || dealer.gethandTotal() == 20){
        dealer.hit(deck.dealNextCard());}
        else {System.out.println("Dealer has chosen stand. (hint : Dealer's hand"
                + " total: "+dealer.gethandTotal()+")\nPress 'Enter' to Continue");
            playerTurn();}// dealer choses stand whenever the sum is more than 17
        
        if (dealer.gethandTotal() == 21) {
            System.out.println("Dealer hit BlackJack. You lost.");
            System.exit(0);
        } else if (dealer.gethandTotal() > 21) {
            System.out.println("Dealer hits more than 21. You win.");
            System.out.println("Your winning amount is : " + player.bankBalance());
            
          
            System.exit(0);
            
        }
        declareWinner();//tells winner
    }

    public void declareWinner() {
        playDealerTurn();
        
        if (player.gethandTotal() == 21) 
        {
            System.out.println("You got BlackJack");
        } else if (player.gethandTotal() > dealer.gethandTotal()) {
            System.out.println("You won the round.");
        }
        System.out.println("Your winning amount is : " + player.bankBalance());// total winnings
      
    }
 
  
    public static void main(String[] args) {
        Game game = new Game();
        game.start();//starts game
    }

}
