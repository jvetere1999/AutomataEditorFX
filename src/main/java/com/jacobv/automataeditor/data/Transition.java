package com.jacobv.automataeditor.data;

public class Transition {

    private FANode          targetNode;
    private Character       requiredChar;

    /**
     * Defualt constructor
     *
     * @param targetNode            Resulting node from transition
     * @param requiredChar          Char that causes this transition
     */
    public Transition( FANode targetNode, Character requiredChar ) {
        this.targetNode = targetNode;
        this.requiredChar = requiredChar;
    }

    /**
     * Get resulting node
     *
     * @return new node
     */
    public FANode getTargetNode() {
        return targetNode;
    }

    /**
     * Set the resulting node
     *
     * @param targetNode            New target node
     */
    public void setTargetNode( FANode targetNode ) {
        this.targetNode = targetNode;
    }

    /**
     * Gets the required character for transition
     *
     * @return The required transition char
     */
    public Character getRequiredChar() {
        return requiredChar;
    }

    /**
     * Sets the required char to new value
     *
     * @param requiredChar          New required char
     */
    public void setRequiredChar( Character requiredChar ) {
        this.requiredChar = requiredChar;
    }

    /**
     * Check if this transition should take place
     * @param c
     * @return
     */
    public boolean willTransition( Character c ) {
        return requiredChar.equals(c);
    }
}
