/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hogwartsschool;

import byui.cit260.hogwartsSchool.model.GeneralScenes;
import byui.cit260.hogwartsschool.model.ClassroomScene;

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
    }
    
}
