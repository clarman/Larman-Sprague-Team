/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsschool.model;

import java.awt.Point;
import java.io.Serializable;

/**
 *
 * @author chad
 */
public enum Actor implements Serializable{
    
    professorSnape("He is the potions master, and the head of Slytherin house."),
    professorFlitwick("He is the charms teacher, and the head of Ravenclaw house."),
    professorBabbling("She is the Ancient Runes teacher."),
    professorLupin("He is the Defense Against the Dark Arts teacher."),
    professorSinistra("She is the Astronomy teacher at Hogwarts."),
    professorMcGonagall("She is the Transfiguration teacher, and the head of Gryffindor house."),
    professorTrelawney("She is the Divination teacher."),
    professorSprout("She is the Herbology teacher, and head of Hufflepuff house."),
    madamHooch("She is the Flying instructor and Quidditch referee"),
    Hagrid("He is the Care of Magical Creatures teacher."),
    moaningMyrtle("She is the ghost in the bathroom.");
 
    private final String description;
    private final Point coordinates;
    private Location location;
    private Game game;
   

    Actor(String description) {
        this.description = description;
        coordinates = new Point(1,1);
    }
    
    public String getDescription() {
        return description;
    }
    
    public Point getCoordinates() {
        return coordinates;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }
    


    @Override
    public String toString() {
        return "Actor{" + "name=" + ", description=" + description + ", coordinates=" + coordinates +'}';
    }

}
