/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsschool.model;

import java.io.Serializable;

/**
 *
 * @author chad
 */
public class Map implements Serializable{
    private double numRows;
    private double numColumns;
    private Location[][] locations;
    private Game[] game;

    public Map() {
    }

    public Map(int numRows, int numColumns) {
        
        if(numRows < 1 || numColumns < 1){
            System.out.println("The number of rows and columns must be > zer0");
            return;
        }
        this.numRows = numRows;
        this.numColumns = numColumns;
        
        this.locations = new Location[numRows][numColumns];
        for(int row = 0; row < numRows; row++){
            for(int column = 0; column < numColumns; column++){
                
                Location location = new Location();
                location.setColumn(column);
                location.setRow(row);
                
                locations[row][column] = location;
            }
        }
        
    }

    public double getNumRows() {
        return numRows;
    }

    public void setNumRows(double numRows) {
        this.numRows = numRows;
    }

    public double getNumColumns() {
        return numColumns;
    }

    public void setNumColumns(double numColumns) {
        this.numColumns = numColumns;
    }

    public Location[][] getLocation() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }
    

    public Game[] getGame() {
        return game;
    }

    public void setGame(Game[] game) {
        this.game = game;
    }
    

    @Override
    public String toString() {
        return "Map{" + "numRows=" + numRows + ", numColumns=" + numColumns + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.numRows) ^ (Double.doubleToLongBits(this.numRows) >>> 32));
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.numColumns) ^ (Double.doubleToLongBits(this.numColumns) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Map other = (Map) obj;
        if (Double.doubleToLongBits(this.numRows) != Double.doubleToLongBits(other.numRows)) {
            return false;
        }
        if (Double.doubleToLongBits(this.numColumns) != Double.doubleToLongBits(other.numColumns)) {
            return false;
        }
        return true;
    }

    
       

    
    
}
