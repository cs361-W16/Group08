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
    public void testDeal() {


        /*
        int testint = 0;
        Game.TableCreator table = new Game.TableCreator();
        ArrayList<ArrayList<Card>> testtable = table.getTable();
        Card testcard = new Card(1,1);
        testtable.get(0).add(testcard);
        testint = (testtable.get(0).get(0)).rank;

        assertEquals(testint, 1);
        */
    }
}