package model;

import java.util.ArrayList;

/**
 * Created by Owner on 1/21/2016.
 */
public class Shuffle {

        MersenneTwister twist = new MersenneTwister((long)System.currentTimeMillis()); //rand number generator
        ArrayList<Card> shuffled = new ArrayList<Card>(); //new temp shuffled array

    public ArrayList<Card> truffle(ArrayList<Card> toShuffle){

        int ogSize = toShuffle.size(); //total size of the passed in array
        int location; //the random location of a selected card

        for (int i = 0; i < ogSize; i++) {

                location = twist.nextInt(toShuffle.size()); //setting the random number

            //test01: added correctly to temp deck (stack style)

                shuffled.add(toShuffle.get(location)); //add from random location to stack of shuffled cards
                System.out.println(shuffled.size());

            //test02: remove random from initial deck

                toShuffle.remove(location); //remove from location at old deck
                System.out.println(toShuffle.size());

        }

        //test03: temp deck == 52

            if(shuffled.size() == 51) //assert equals original array size
                System.out.println("full");

        //test04: return truffled deck success

            return shuffled; //return array to be set as new deck

    }

}
