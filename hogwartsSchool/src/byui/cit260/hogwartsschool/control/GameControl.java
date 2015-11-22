/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsschool.control;

import byui.cit260.hogwartsschool.model.Game;
import byui.cit260.hogwartsschool.model.Location;
import byui.cit260.hogwartsschool.model.Map;
import byui.cit260.hogwartsschool.model.Notes;
import byui.cit260.hogwartsschool.model.Player;
import byui.cit260.hogwartsschool.model.Scene;
import byui.cit260.hogwartsschool.model.SceneType;
import hogwartsschool.HogwartsSchool;
import java.util.ArrayList;

/**
 *
 * @author chad
 */
public class GameControl {

    public static void createNewGame(Player player) {
        Game game = new Game(); // create new game
        HogwartsSchool.setCurrentGame(game); // save in hogwartsSchool
        
        game.setPlayer(player); // save player in game
        
        ArrayList<Notes> notes = new ArrayList<>();
        game.setNotes(notes);
        
        Map map = MapControl.createMap(); //create and initialize new map
        game.setMap(map);
        
        // move actors to starting position in the map
        MapControl.moveActorsToStartingLocation(map);
    }

    static void assignScenesToLocations(Map map, Scene[] scenes) {
         Location[][] locations = map.getLocation();
         
         locations[0][0].setScene(scenes[SceneType.quidditchField.ordinal()]);
         locations[0][1].setScene(scenes[SceneType.flying.ordinal()]);
         locations[0][2].setScene(scenes[SceneType.hallways.ordinal()]);
         locations[0][3].setScene(scenes[SceneType.start.ordinal()]);
         locations[0][4].setScene(scenes[SceneType.greatHall.ordinal()]);
         locations[1][0].setScene(scenes[SceneType.hallways.ordinal()]);
         locations[1][1].setScene(scenes[SceneType.potions.ordinal()]);
         locations[1][2].setScene(scenes[SceneType.hallways.ordinal()]);
         locations[1][3].setScene(scenes[SceneType.bathroom.ordinal()]);
         locations[1][4].setScene(scenes[SceneType.charms.ordinal()]);
         locations[2][0].setScene(scenes[SceneType.hallways.ordinal()]);
         locations[2][1].setScene(scenes[SceneType.ancientRunes.ordinal()]);
         locations[2][2].setScene(scenes[SceneType.hallways.ordinal()]);
         locations[2][3].setScene(scenes[SceneType.defenseAgainstTheDarkArts.ordinal()]);
         locations[2][4].setScene(scenes[SceneType.hallways.ordinal()]);
         locations[3][0].setScene(scenes[SceneType.astronomy.ordinal()]);
         locations[3][1].setScene(scenes[SceneType.transfiguration.ordinal()]);
         locations[3][2].setScene(scenes[SceneType.divination.ordinal()]);
         locations[3][3].setScene(scenes[SceneType.herbology.ordinal()]);
         locations[3][4].setScene(scenes[SceneType.careOfMagicalCreatures.ordinal()]);
         
         
    }

    
    
}
