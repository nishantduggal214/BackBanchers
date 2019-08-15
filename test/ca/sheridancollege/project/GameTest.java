/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author chahalamit
 */
public class GameTest {
    
    public GameTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of start method, of class Game.
     */
   // public void testCheckLengthGood() {
//        String pass = "MyPassword123";
//        boolean result = PasswordValidator.checkLength(pass);
//        assertEquals(true, result);
//       
//    }
    @Test
    public void testStart() {
        System.out.println("start");
        Game instance = new Game();
        instance.start();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of playerTurn method, of class Game.
     */
    @Test
    public void testPlayerTurn() {
        System.out.println("playerTurn");
        Game instance = new Game();
        instance.playerTurn();
        
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of printHand method, of class Game.
     */
    @Test
    public void testPrintHand() {
        System.out.println("printHand");
        Player player = null;
        Game instance = new Game();
        instance.printHand(player);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of playDealerTurn method, of class Game.
     */
    @Test
    public void testPlayDealerTurn() {
        System.out.println("playDealerTurn");
        Game instance = new Game();
        instance.playDealerTurn();
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of declareWinner method, of class Game.
     */
    @Test
    public void testDeclareWinner() {
        System.out.println("declareWinner");
        Game instance = new Game();
        instance.declareWinner();
        
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of main method, of class Game.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Game.main(args);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
}
