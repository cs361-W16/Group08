package controllers;

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

}
//Deck.cards = shuffle.truffle(Deck.cards);