package com.jacobv.automataeditor.data;

import java.util.ArrayList;
import java.util.HashMap;

public class FAPointer {


    public FANode                      node;
    public ArrayList<Transition>       transitions;

    public FAPointer(FANode node, ArrayList<Transition> transitions){
        this.node = node;
        this.transitions = transitions;
    }

    public ArrayList<FAPointer> move (char input, HashMap<FANode, ArrayList<Transition>> map){
        ArrayList<FAPointer> newPointers = new ArrayList<>();
        for (Transition data: transitions){
            if ( data.willTransition(input) ) {
                newPointers.add(new FAPointer(data.getTargetNode(), map.get(data.getTargetNode())));
            }
        }
        return newPointers;
    }
}
