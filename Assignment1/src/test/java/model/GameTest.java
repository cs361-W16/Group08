package model;

import org.junit.Test;
import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by Brandon on 1/21/2016.
 */
public class GameTest {
    @Test
    public void testTable() {
        Game.TableCreator table = new Game.TableCreator();
        assertNotNull(table);
    }

    @Test
    public void testDeal1Suit() {
        Game.TableCreator dealtable = new Game.TableCreator();
        Deck cards = new Deck();
        Card card1 = new Card(0, 2);
        Card card2 = new Card(1, 3);
        Card card3 = new Card(2, 4);
        Card card4 = new Card(3, 5);
        dealtable.table.get(0).add(card1);
        dealtable.table.get(1).add(card2);
        dealtable.table.get(2).add(card3);
        dealtable.table.get(3).add(card4);
        assertEquals(0, dealtable.table.get(0).get(0).getSuit());
    }
    @Test
    public void testDeal2Suit() {
        Game.TableCreator dealtable = new Game.TableCreator();
        Deck cards = new Deck();
        Card card1 = new Card(0, 2);
        Card card2 = new Card(1, 3);
        Card card3 = new Card(2, 4);
        Card card4 = new Card(3, 5);
        dealtable.table.get(0).add(card1);
        dealtable.table.get(1).add(card2);
        dealtable.table.get(2).add(card3);
        dealtable.table.get(3).add(card4);
        assertEquals(1, dealtable.table.get(0).get(0).getSuit());
    }
    @Test
    public void testDeal3Suit() {
        Game.TableCreator dealtable = new Game.TableCreator();
        Deck cards = new Deck();
        Card card1 = new Card(0, 2);
        Card card2 = new Card(1, 3);
        Card card3 = new Card(2, 4);
        Card card4 = new Card(3, 5);
        dealtable.table.get(0).add(card1);
        dealtable.table.get(1).add(card2);
        dealtable.table.get(2).add(card3);
        dealtable.table.get(3).add(card4);
        assertEquals(2, dealtable.table.get(0).get(0).getSuit());
    }
    @Test
    public void testDeal4Suit() {
        Game.TableCreator dealtable = new Game.TableCreator();
        Deck cards = new Deck();
        Card card1 = new Card(0, 2);
        Card card2 = new Card(1, 3);
        Card card3 = new Card(2, 4);
        Card card4 = new Card(3, 5);
        dealtable.table.get(0).add(card1);
        dealtable.table.get(1).add(card2);
        dealtable.table.get(2).add(card3);
        dealtable.table.get(3).add(card4);
        assertEquals(3, dealtable.table.get(0).get(0).getSuit());
    }
    @Test
    public void testDeal1Rank() {
        Game.TableCreator dealtable = new Game.TableCreator();
        Deck cards = new Deck();
        Card card1 = new Card(0, 2);
        Card card2 = new Card(1, 3);
        Card card3 = new Card(2, 4);
        Card card4 = new Card(3, 5);
        dealtable.table.get(0).add(card1);
        dealtable.table.get(1).add(card2);
        dealtable.table.get(2).add(card3);
        dealtable.table.get(3).add(card4);
        assertEquals(2, dealtable.table.get(0).get(0).getRank());
    }
    @Test
    public void testDeal2Rank() {
        Game.TableCreator dealtable = new Game.TableCreator();
        Deck cards = new Deck();
        Card card1 = new Card(0, 2);
        Card card2 = new Card(1, 3);
        Card card3 = new Card(2, 4);
        Card card4 = new Card(3, 5);
        dealtable.table.get(0).add(card1);
        dealtable.table.get(1).add(card2);
        dealtable.table.get(2).add(card3);
        dealtable.table.get(3).add(card4);
        assertEquals(3, dealtable.table.get(0).get(0).getRank());
    }
    @Test
    public void testDeal3Rank() {
        Game.TableCreator dealtable = new Game.TableCreator();
        Deck cards = new Deck();
        Card card1 = new Card(0, 2);
        Card card2 = new Card(1, 3);
        Card card3 = new Card(2, 4);
        Card card4 = new Card(3, 5);
        dealtable.table.get(0).add(card1);
        dealtable.table.get(1).add(card2);
        dealtable.table.get(2).add(card3);
        dealtable.table.get(3).add(card4);
        assertEquals(4, dealtable.table.get(0).get(0).getRank());
    }
    @Test
    public void testDeal4Rank() {
        Game.TableCreator dealtable = new Game.TableCreator();
        Deck cards = new Deck();
        Card card1 = new Card(0, 2);
        Card card2 = new Card(1, 3);
        Card card3 = new Card(2, 4);
        Card card4 = new Card(3, 5);
        dealtable.table.get(0).add(card1);
        dealtable.table.get(1).add(card2);
        dealtable.table.get(2).add(card3);
        dealtable.table.get(3).add(card4);
        assertEquals(5, dealtable.table.get(0).get(0).getRank());
    }
}