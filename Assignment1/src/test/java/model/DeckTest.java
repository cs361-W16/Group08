package model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Jason Ye on 1/21/2016.
 */
public class DeckTest {
    @Test
    public void testDeckContents() {
        Deck cards = new Deck();
        assertNotNull(cards);
    }
}