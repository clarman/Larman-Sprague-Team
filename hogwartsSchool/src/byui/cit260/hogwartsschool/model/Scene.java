/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsschool.model;

/**
 *
 * @author Chadl
 */
public class Scene {
    private String description;
    private String instructions;
    private Location[] location; 

    public Scene() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public Location[] getLocation() {
        return location;
    }

    public void setLocation(Location[] location) {
        this.location = location;
    }

    public void setMapSymbol(String st) {
        System.out.println("*** this sets the map symbol ***");
    }

    public void setQuestions() {
        System.out.println("*** This sets the questions ***");
    }

    public void setInstructions() {
       System.out.println("*** this sets the instructions for the classes ***");
    }
    
    
    
}
