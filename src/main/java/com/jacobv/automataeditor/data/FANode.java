package com.jacobv.automataeditor.data;

import Enum.NodeType; //Enum for type


public class FANode {

    private String          name; //Identifier
    private int[]           location; //form {x, y}
    private NodeType        type; //Type of node in FA


    /**
     * Non-positioned constructor
     *
     * @param name          The name of the node
     */
    public FANode( String name ){
        this.name = name;
        this.location = new int[] {0,0};
    }

    /**
     * Positional constructor
     *
     * @param name          The name of the node
     * @param location      Location of front end grid placement of this node
     */
    public FANode( String name, int[] location ) {
        this.name = name;
        this.location = location;
    }

    /**
     * Constructor with enum representing node type for front end
     *
     * @param name          The name of the node
     * @param location      Location of front end grid placement of this node
     * @param type          Type of node
     */
    public FANode(String name, int[] location, NodeType type){
        this.name = name;
        this.location = location;
    }
    /**
     * Gets private name variable
     *
     * @return Name of node
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name of the node
     *
     * @param name          The name of current node
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the location of node
     *
     * @return location of node
     */

    public int[] getLocation() {
        return location;
    }

    /**
     * Sets the location of node
     *
     * @param location      The location of the node
     */
    public void setLocation(int[] location) {
        this.location = location;
    }

    /**
     * Checks for equality of this object type
     *
     * @param o             O
     * @return Weather the are equal or not as a boolean
     */
    @Override
    public boolean equals( Object o ){
        if ( o == this ) {
            return true;
        }

        if( !( o instanceof FANode ) ) {
            return false;
        }

        FANode node = (FANode) o;

        return this.name.equals( node.getName() )
                && this.location.equals( node.getLocation() );
    }
}
