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

/**
 *
 * @author chad
 */
public class HogwartsSchool {

   /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       GeneralScenes hallway = new GeneralScenes(); 
       hallway.setDescription("dark");
       String hallDesc = hallway.toString();
       System.out.println(hallDesc);
       
       ClassroomScene potions = new ClassroomScene();
       potions.setDescription("dungeons"); 
       potions.setInstructions("make potion");
       String potionsInfo = potions.toString();
       System.out.println(potionsInfo);
      
       Location room = new Location();
       room.setRow(5);
       room.setColumn(14);
       String roomloc = room.toString();
       System.out.println(roomloc);
       
       Map map = new Map();
       map.setNumRows(25);
       map.setNumColumns(25);
       String map1 = map.toString();
       System.out.println(map1);
       
       Actor player1 = new Actor();
       player1.setName("Chad");
       player1.setDescription("Amazing");
       player1.setHouse("Slytherin");
       player1.setCoordinates(21);
       player1.setPoints(9000);
       String chad = player1.toString();
       System.out.println(chad);
       
       Player playerone = new Player();
       playerone.setName("Rain");
       String rain = playerone.toString();
       System.out.println(rain);
       
       Game time = new Game(); 
       time.setTotalTime("total");
       String total = time.toString();
       System.out.println(total);
       
       Notes note = new Notes();
       note.setNoteType("type");
       note.setQuanity("quanity");
       note.setDescription("classroom");
       String type = note.toString();
       System.out.println(type);
       
       Questions answers = new Questions();
       answers.setQuiz("quiz");
       answers.setExam("exam");
       String quiz = answers.toString();
       System.out.println(quiz);
    }
    
}
