/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsschool.control;

import byui.cit260.hogwartsschool.model.Player;
import hogwartsschool.HogwartsSchool;

/**
 *
 * @author chad
 */
public class ProgramControl {

    public static Player createPlayer(String name) {
        
        if(name == null) {
            return null;
        }
        Player player = new Player();
        player.setName(name);
        
        HogwartsSchool.setPlayer(player);
        return player;
    }
    
}
