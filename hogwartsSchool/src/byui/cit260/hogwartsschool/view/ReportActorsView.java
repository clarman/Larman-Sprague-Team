/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsschool.view;

import byui.cit260.hogwartsschool.model.Location;
import byui.cit260.hogwartsschool.model.Map;
import hogwartsschool.HogwartsSchool;
import java.io.PrintWriter;

/**
 *
 * @author Chadl
 */
public class ReportActorsView {
protected final PrintWriter console = HogwartsSchool.getOutFile();
    void display() {
        Map map = HogwartsSchool.getCurrentGame().getMap();
        Location[][] locations = map.getLocation();
        this.console.println("    Hogwarts Map");
        this.console.println("  1   2   3   4   5");
        for (int i = 0; i < locations.length; i++) {
            
            this.console.println("---------------------");
            this.console.print(i + 1);
            for (int j = 0; j < locations[i].length; j++) {
                Location location = locations[i][j];
                this.console.print("|");
                String mapSymbol = location.getScene().getMapSymbol();
                this.console.print(mapSymbol);
                this.console.print("|");
                
                
            }
            this.console.println("");  
        }
        this.console.println("--------------------"); 
    }
    }
    

