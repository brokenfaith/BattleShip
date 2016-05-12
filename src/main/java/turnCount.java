package main.java;

import java.util.HashMap;

/**
 * Created by BrianBartow on 5/11/16.
 */
public class turnCount {

    Integer turn;

    HashMap<Integer,Boolean> listOfTurns;



    public Integer getTurn() {
        return turn;
    }

    public void setTurn(Integer turn) {
        this.turn = turn;
    }

    public HashMap<Integer,Boolean> getListOfTurns(){
        return listOfTurns;
    }

    public void setListOfTurns(HashMap<Integer, Boolean> listOfTurns) {
        this.listOfTurns = listOfTurns;
    }
}
