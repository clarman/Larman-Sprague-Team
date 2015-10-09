/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hogwartsschool;

import byui.cit260.hogwartsSchool.model.GeneralScenes;
import byui.cit260.hogwartsschool.model.ClassroomScene;
import byui.cit260.hogwartsschool.model.Location;
import byui.cit260.hogwartsschool.model.Map;

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
    }
    
}
