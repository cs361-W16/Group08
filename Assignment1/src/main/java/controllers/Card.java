package controllers;


/**
 * Created by Jason Ye on 1/20/2016.
 */
public class Card {
    private int rank, suit;

    private static String[] suits = {"heart","spades","diamond","clubs"};
    private static int[] ranks = {2,3,4,5,6,7,8,9,10,11,12,13,14};

    Card(int suit, int rank){
        this.rank = rank;
        this.suit = suit;
    }
    public String toString(){
        //testing to print out a card with rank and suit...
        return ranks[rank] + " of " + suits[suit];
    }
    public int getRank(){
        return rank;
    }
    public int getSuit()
    {
        return suit;
    }
}
