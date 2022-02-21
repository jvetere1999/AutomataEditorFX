package com.jacobv.automataeditor.application.cells;

import com.jacobv.automataeditor.application.graph.Cell;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class StateCell extends Cell {

    public StateCell( String id ) {
        super( id );

        Circle view = new Circle(50);

        view.setStroke(Color.BLACK);
        view.setFill(Color.WHITE);

        setView(view);
    }

}
