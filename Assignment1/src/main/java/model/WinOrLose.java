package model;


import com.google.common.collect.Table;

/**
 * Created by Jason Ye on 1/22/2016.
 */
public class WinOrLose {

    public void check(Deck toCheck, Game.TableCreator current) {

        if(toCheck.cards.size() == 0){
            if ((current.table.get(0).get(0).getRank() == 14) && (current.table.get(0).get(1).getRank() == 14) &&
                    (current.table.get(0).get(2).getRank() == 14) && (current.table.get(0).get(3).getRank() == 14)) {
                    System.out.println("You Win!");
            } else {
                System.out.println("You Lose!");
            }
        }
    }
}
