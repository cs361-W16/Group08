package model;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
/**
 * Created by Jason Ye on 1/22/2016.
 */

public class CardTest{
    @Test
    public void CardTestRank(){
        Card cards = new Card(0,2);
        assertEquals(2, cards.getRank());
    }
    @Test
    public void CardTestSuit(){
        Card cards = new Card(0,2);
        assertEquals(0,cards.getSuit());
    }
}
