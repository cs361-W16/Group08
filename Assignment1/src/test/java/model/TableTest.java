package model;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * Created by Brandon on 1/21/2016.
 */
public class TableTest {
    @Test
    public void testArrayListSize() {
        Game.TableCreator table = new Game.TableCreator();
        assertNotNull(table);
    }
}