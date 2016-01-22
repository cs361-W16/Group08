package model;

import java.util.ArrayList;
/**
 * Created by Brandon on 1/21/2016.
 */
public class TableCreator {
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