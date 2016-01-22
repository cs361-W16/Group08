package model;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import java.util.ArrayList;

/**
 * Created by Owner on 1/21/2016.
 */
public class ShuffleTest {

        MersenneTwister twist = new MersenneTwister((long)System.currentTimeMillis()); //rand number generator
        ArrayList<Card> shuffled = new ArrayList<Card>(); //new temp shuffled array

        @Test
        public void twisterTest(){

        assert(twist != NULL);

        }

        @Test
        public void shuffledTest(){

        assert(shuffled != NULL);

        }

    @test
    public ArrayList<Card> truffleTest(ArrayList<Card> toShuffle){

        int ogSize = toShuffle.size(); //total size of the passed in array
        int location; //the random location of a selected card

        assert(ogSize != NULL);

        for (int i = 0; i < ogSize; i++) {

                location = twist.nextInt(toShuffle.size()); //setting the random number

            //test01: added correctly to temp deck (stack style)

                shuffled.add(toShuffle.get(location)); //add from random location to stack of shuffled cards
                System.out.println(shuffled.size());

                assert(shuffled.size() > 0);

            //test02: remove random from initial deck

                toShuffle.remove(location); //remove from location at old deck
                System.out.println(toShuffle.size());

        }

        //test03: temp deck == 52

            assert(shuffled.size() == 51); //assert equals original array size

        //test04: return truffled deck success

            assert(shuffled != toShuffle);

            return shuffled; //return array to be set as new deck

    }

}
