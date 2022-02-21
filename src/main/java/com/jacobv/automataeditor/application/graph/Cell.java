package com.jacobv.automataeditor.application.graph;

import javafx.scene.Node;
import javafx.scene.layout.Pane;

import java.util.ArrayList;
import java.util.List;

public class Cell extends Pane {

    String          cellID;

    List<Cell>      children;
    List<Cell>      parents;

    Node            view;

    public Cell(String cellID) {
        children = new ArrayList<>();
        parents = new ArrayList<>();
        this.cellID = cellID;
    }

    public boolean addCellChild(Cell cell) {
        children.add(cell);
        return children.contains(cell);
    }

    public List<Cell> getCellChildren() { return children; }

    public boolean addCellParent(Cell cell) {
        parents.add(cell);
        return parents.contains(cell);
    }

    public List<Cell> getCellParents(){ return parents; }

    public boolean removeChildCell(Cell cell) {
        children.remove(cell);
        return !children.contains(cell);
    }

    public void setView(Node view) {
        this.view = view;
        getChildren().add(view);
    }

    public Node getView() {
        return this.view;
    }

}
