package model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Brandon on 1/21/2016.
 */
public class TableTest {
    @Test
    public void testArrayListContents() {
        Game.TableCreator table = new Game.TableCreator();
        assertNotNull(table);
    }
}