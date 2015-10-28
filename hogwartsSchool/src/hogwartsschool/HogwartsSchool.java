/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hogwartsschool;

import byui.cit260.hogwartsSchool.model.GeneralScenes;
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

   /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Create StartProgramView and start the program
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.startProgram(); 
    }
    
}
