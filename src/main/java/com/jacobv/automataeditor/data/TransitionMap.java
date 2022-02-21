package com.jacobv.automataeditor.data;

import java.util.ArrayList;
import java.util.HashMap;

import Enum.FA;

public class TransitionMap {
    private HashMap<FANode, ArrayList<Transition>>
                                        transitionMap;
    private FA                          TYPE;
    private ArrayList<FAPointer>        pointer;

    public TransitionMap () {
        this.transitionMap = new HashMap<>();
        this.TYPE = FA.UND;
    }

    public TransitionMap ( HashMap<FANode, ArrayList<Transition>> transitionMap, FANode start ){
        this.transitionMap = transitionMap;
        this.TYPE = FA.UND;
        ArrayList<Transition> transitions = transitionMap.get(start);
        this.pointer.add(new FAPointer(start, transitions));
    }

    public TransitionMap ( HashMap<FANode, ArrayList<Transition>> transitionMap, FA type){
        this.transitionMap = transitionMap;
        if ( type == FA.CHK && checkDFA()) {
            this.TYPE = FA.DFA;
        }
        else if ( type == FA.CHK ){
            this.TYPE = FA.NFA;
        }
        else
            this.TYPE = type;
    }

    public void move(char input){
        ArrayList<FAPointer> pointers = new ArrayList<>();
        for (FAPointer temp: pointer){
            pointers.addAll(temp.move(input, transitionMap));
        }
    }

    public ArrayList<Transition> get(FANode key){
        return transitionMap.get(key);
    }

    private boolean checkDFA() {
        //Implement later
        return false;
    }


}
