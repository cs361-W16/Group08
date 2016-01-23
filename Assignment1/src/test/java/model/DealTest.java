package model;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

/**
 * Created by Brandon on 1/21/2016.
 */
public class DealTest {
    @Test
    public void testDeal() {
        int testint;
        testint = 0;
        Game.TableCreator table = new Game.TableCreator();
        ArrayList<ArrayList<Card>> testtable = table.getTable();
        Card testcard = new Card(1,1);
        testtable.get(0).add(testcard);
        testint = ((Card) testtable.get(0).get(0)).rank;

        assertEquals(testint, 1);
    }
}