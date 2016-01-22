package controllers;

/**
 * Created by Jason Ye on 1/20/2016.
 */
public class Deck {
    private Card[] cards;
    int i;

    Deck(){
        i = 51;
        cards = new Card[52];
        int x=0;
        for (int a = 0; a < 4; a++){
            for (int b = 0; b < 14; b++){
                cards[x] = new Card(a,b);
                x++;
            }
        }
    }
}
