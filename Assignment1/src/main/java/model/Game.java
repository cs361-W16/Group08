package model;

import java.io.Serializable;
import java.util.ArrayList;


/**
 * Created by Emily on 1/22/2016.
 */
public class Game {
    /**
     * Created by Emily on 1/22/2016.
     */
    //pseudocode partially, couldn't get ajax/json connection working :[
    public void remove_card(int ClickedColumn, Game.TableCreator current){
        for(int i=0; i<4; i++) {
            current.table.get(i).get(0);
            if(ClickedColumn.suit == i.suit && ClickedColumn.rank < i)
                ClickedColumn.remove();

        }

    }

    /**
     * Created by Brandon on 1/22/2016.
     */
    public void Deal(Deck dealt, Game.TableCreator current){
        for(int i=0; i<4; i++){
            current.table.get(i).add(0,dealt.cards.get(0));
        }
    }

    /**
     * Created by Brandon on 1/21/2016.
     */
    public static class TableCreator {
        public ArrayList<ArrayList<Card>> table;
        public ArrayList<Card> column;

        public TableCreator(){table = new ArrayList<ArrayList<Card>>();}
        public ArrayList<ArrayList<Card>> getTable(){return table;}
    }
}