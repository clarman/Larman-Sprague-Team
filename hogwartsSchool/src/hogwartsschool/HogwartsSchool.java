/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hogwartsschool;

import byui.cit260.hogwartsSchool.model.GeneralScene;
import byui.cit260.hogwartsschool.model.Actor;
import byui.cit260.hogwartsschool.model.ClassroomScene;
import byui.cit260.hogwartsschool.model.Game;
import byui.cit260.hogwartsschool.model.Location;
import byui.cit260.hogwartsschool.model.Map;
import byui.cit260.hogwartsschool.model.Notes;
import byui.cit260.hogwartsschool.model.Player;
import byui.cit260.hogwartsschool.model.Questions;
import byui.cit260.hogwartsschool.view.StartProgramView;

/**
 *
 * @author chad
 */
public class HogwartsSchool {

   private static Game currentGame = null;

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        HogwartsSchool.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        HogwartsSchool.player = player;
    }
   private static Player player = null;
   
    public static void main(String[] args) {
       // Create StartProgramView and start the program
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.startProgram(); 
    }
    
}
