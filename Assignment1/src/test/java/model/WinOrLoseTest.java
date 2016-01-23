package model;

import org.junit.Test;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertNotNull;

import javax.validation.constraints.Null;

/**
 * Created by Jason Ye on 1/22/2016.
 */
public class WinOrLoseTest{

    @Test
    public void testDeckSize(){
        Deck size = new Deck();
        assertNotNull(size);
    }
    @Test
    public void AcesOfHeartOnTheTable(){
        Card AceOfHeart = new Card(0,14);
        assertEquals("heart",0,14);
    }
    @Test
    public void AcesOfSpadesOnTheTable(){
        Card AceOfHeart = new Card(1,14);
        assertEquals("spades",1,14);
    }
    @Test
    public void AcesOfDiamondOnTheTable(){
        Card AceOfHeart = new Card(2,14);
        assertEquals("diamond",2,14);
    }
    @Test
    public void AcesOfClubsOnTheTable(){
        Card AceOfHeart = new Card(3,14);
        assertEquals("clubs",3,14);
    }
}
