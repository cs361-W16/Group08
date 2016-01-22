package controllers;

import java.util.ArrayList;
import java.util.Vector;
/**
 * Created by Jason Ye on 1/20/2016.
 */
public class Deck {
    private ArrayList<Card> cards;

    Deck(){
       cards = new ArrayList<Card>();
        int x=0;

        for (int i = 0; i < 4 ; i++) { //loop 4 suits
            for (int j = 0; j < 13; j++) { //loop 13 cards
                cards.add(new Card(i, j));
                
            }
        }
    }
}
