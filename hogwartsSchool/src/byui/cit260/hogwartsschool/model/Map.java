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

    public Map() {
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
