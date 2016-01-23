package model;

import java.io.Serializable;
import java.util.ArrayList;


/**
 * Created by Emily on 1/22/2016.
 */
public class Game {

    /**
     * Created by Brandon on 1/21/2016.
     */
    public static class TableCreator {
        public ArrayList<ArrayList<Card>> table;
        public ArrayList<Card> column;

        public TableCreator() {
            table = new ArrayList<ArrayList<Card>>();
        }

        public ArrayList<ArrayList<Card>> getTable() {
            return table;
        }
    }


    /**
     * Created by Emily on 1/22/2016.
     */
    public static class Remove implements Serializable {

        public void remove_card(card) {

        }
    }


    public void Deal(Deck dealt){

        for(int i=0; i<4; i++) {

            TableCreator.table.get(i).add(dealt.cards.get(0));
            dealt.cards.remove(0);

        }

    }
}