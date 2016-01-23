package model;

/**
 * Created by Emily on 1/22/2016.
 */
public class Game {
    /**
     * Created by Emily on 1/22/2016.
     */
    public static class Remove implements Serializable{

        public void remove_card(card){

        }
    }

    /**
     * Created by Brandon on 1/21/2016.
     */
    public static class TableCreator {
        public ArrayList<ArrayList<Card>> table;
        public ArrayList<Card> column;

        TableCreator(){
            table = new ArrayList<ArrayList<Card>>();
            column = new ArrayList<Card>();

            for(int i=0; i<4; i++) {
                table.add(column);
            }
        }
    }
}
