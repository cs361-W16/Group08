package controllers;

/**
 * Created by Jason Ye on 1/20/2016.
 */
public class Deck {
    private Card[] cards;
    int currentCard;

    Deck(){
        cards = new Card[52];
        int x=0;

        for (int i = 0; i < 4 ; i++){
            for (int j = 0; j < 13; j++){
                cards[x++] = new Card(i,j);
            }
        }
        currentCard = 0;
    }
}
