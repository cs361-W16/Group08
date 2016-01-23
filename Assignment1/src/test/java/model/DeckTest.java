package model;

import static org.junit.Assert.*;

/**
 * Created by Jason Ye on 1/21/2016.
 */
public class DeckTest {

    @Test
    public ArrayList<Card> shuffleTest(){

        MersenneTwister twist = new MersenneTwister((long)System.currentTimeMillis()); //rand number generator
        ArrayList<Card> shuffled = new ArrayList<Card>(); //new temp shuffled array

        int ogSize = 51; //total size of the passed in array
        int location; //the random location of a selected card

        assert(ogSize != NULL);

        for (int i = 0; i <= ogSize; i++) {

            location = twist.nextInt(this.cards.size()); //setting the random number

            //test01: added correctly to temp deck (stack style)

            shuffled.add(this.cards.get(location)); //add from random location to stack of shuffled cards
            System.out.println(shuffled.size());

            assert(shuffled.size() > 0);

            //test02: remove random from initial deck

            this.cards.remove(location); //remove from location at old deck
            System.out.println(this.cards.size());

        }

        //test03: temp deck == 52

        assert(ogSize == 51); //assert equals original array size

        //test04: return truffled deck success

        assert(shuffled != this.cards);

        return shuffled; //return array to be set as new deck

    }

}