package model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Emily on 1/22/2016.
 */
public class RemoveTest {
    @Test
    public void testRemove(){
        Game.TableCreator dealtable = new Game.TableCreator();
        Deck cards = new Deck();
        Card card1 = new Card(0, 2);
        dealtable.table.get(0).add(card1);
        remove_card(0,Game.TableCreator);
        assertNull(0,dealtable.table.get(0).get(0));
    }
}
