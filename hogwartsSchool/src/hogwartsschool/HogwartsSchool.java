/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hogwartsschool;

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
    }
    
}
