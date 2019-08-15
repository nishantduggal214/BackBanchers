/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
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
public class PlayerTest {
    
    public PlayerTest() {
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
     * Test of hit method, of class Player.
     */
    @Test
    public void testHit() {
        System.out.println("hit");
        Card card = null;
        Player instance = null;
        instance.hit(card);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHand method, of class Player.
     */
    @Test
    public void testGetHand() {
        System.out.println("getHand");
        Player instance = null;
        ArrayList<Card> expResult = null;
        ArrayList<Card> result = instance.getHand();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPlayerId method, of class Player.
     */
    @Test
    public void testGetPlayerId() {
        System.out.println("getPlayerId");
        Player instance = null;
        String expResult = "";
        String result = instance.getPlayerId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPlayerId method, of class Player.
     */
    @Test
    public void testSetPlayerId() {
        System.out.println("setPlayerId");
        String playerId = "";
        Player instance = null;
        instance.setPlayerId(playerId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBet method, of class Player.
     */
    @Test
    public void testSetBet() {
        System.out.println("setBet");
        int bet = 0;
        Player instance = null;
        instance.setBet(bet);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of bankBalance method, of class Player.
     */
    @Test
    public void testBankBalance() {
        System.out.println("bankBalance");
        Player instance = null;
        double expResult = 0.0;
        double result = instance.bankBalance();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of gethandTotal method, of class Player.
     */
    @Test
    public void testGethandTotal() {
        System.out.println("gethandTotal");
        Player instance = null;
        int expResult = 0;
        int result = instance.gethandTotal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of resetHand method, of class Player.
     */
    @Test
    public void testResetHand() {
        System.out.println("resetHand");
        Player instance = null;
        instance.resetHand();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
