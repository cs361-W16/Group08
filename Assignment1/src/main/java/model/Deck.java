package model;

import java.util.ArrayList;
/**
 * Created by Jason Ye on 1/20/2016.
 */
public class Deck {

    private ArrayList<Card> cards;
    Deck(){
       cards = new ArrayList<Card>();
        for (int i = 0; i < 4 ; i++) {           //loop 4 suits
            for (int j = 2; j <= 14; j++) {      //loop 13 cards
                cards.add(new Card(i, j)); //a card with a suit and rank...aka 2 of heart
            }
        }
        //Testing to see a card with suit and rank...
        //System.out.println(cards);
    }

    //shuffle function ------------------------------------------------------------------------------
    //proper syntax: deck.cards = cards.shuffle();

    public ArrayList<Card> shuffle(){

        MersenneTwister twist = new MersenneTwister((long)System.currentTimeMillis()); //rand number generator
        ArrayList<Card> shuffled = new ArrayList<Card>(); //new temp shuffled array

        int ogSize = this.cards.size(); //total size of the passed in array
        int location; //the random location of a selected card

        for (int i = 0; i <= ogSize; i++) {

            location = twist.nextInt(this.cards.size()); //setting the random number

            //test01: added correctly to temp deck (stack style)

            shuffled.add(this.cards.get(location)); //add from random location to stack of shuffled cards
            //System.out.println(shuffled.size());

            //test02: remove random from initial deck

            this.cards.remove(location); //remove from location at old deck
            //System.out.println(this.cards.size());

        }

        //test03: temp deck == 52

        //if(shuffled.size() == 51) //assert equals original array size
        //    System.out.println("full");

        //test04: return truffled deck success

        return shuffled; //return array to be set as new deck

    }

}