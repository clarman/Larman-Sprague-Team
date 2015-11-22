/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsschool.control;

import byui.cit260.hogwartsschool.model.Game;
import byui.cit260.hogwartsschool.model.Map;
import byui.cit260.hogwartsschool.model.Scene;
import byui.cit260.hogwartsschool.model.SceneType;
import static byui.cit260.hogwartsschool.model.SceneType.exam;
import hogwartsschool.HogwartsSchool;

/**
 *
 * @author chad
 */
public class MapControl {

    public static Map createMap() {
        //create the map
       Map map = new Map(4,5);
       
       //create a list of the different scenes in game
       Scene[] scenes = createScenes();
       
       //assigne the different scenes to locations in the map
       GameControl.assignScenesToLocations(map, scenes);
       
       return map;
    }

    private static Scene[] createScenes() {
        Game game = HogwartsSchool.getCurrentGame();
        
        Scene[] scenes = new Scene[SceneType.values().length];
        
        Scene startingScene = new Scene();
        startingScene.setDescription(
                "\n Welcome to Hogwarts. This is the Great Hall. Soon you will"
               +"be sorted into your houses to begin you journey.");
        startingScene.setMapSymbol("ST");
        startingScene.setQuestions();
        scenes[SceneType.start.ordinal()] = startingScene;
        
        Scene potionsClass = new Scene();
        potionsClass.setDescription(
                "\n Welcome to potions class.");
        potionsClass.setMapSymbol("P");
        potionsClass.setInstructions();
        scenes[SceneType.potions.ordinal()] = potionsClass;
        
        Scene charmsClass = new Scene();
        charmsClass.setDescription(
                 "\n Welcome to Charms class,");
        charmsClass.setMapSymbol("C");
        charmsClass.setInstructions();
        scenes[SceneType.charms.ordinal()] = charmsClass;
        
        Scene ancientRunes = new Scene();
        ancientRunes.setDescription(
                  "\nWelcome to Ancient Runes Class.");
        ancientRunes.setMapSymbol("AR");
        ancientRunes.setInstructions();
        scenes[SceneType.ancientRunes.ordinal()] = ancientRunes;
        
        Scene darkArts = new Scene();
        darkArts.setDescription(
                "\nWelcome to Defense Against the Darl Arts Class.");
        darkArts.setMapSymbol("DA");
        darkArts.setInstructions();
        scenes[SceneType.defenseAgainstTheDarkArts.ordinal()] = darkArts;
        
        Scene astronomy = new Scene();
        astronomy.setDescription(
                "\nWelcome to Astronomy Class.");
        astronomy.setMapSymbol("AS");
        astronomy.setInstructions();
        scenes[SceneType.astronomy.ordinal()] = astronomy;
        
        Scene transfiguration = new Scene();
        transfiguration.setDescription(
                "\nWelcome to Transfiguration Class.");
        transfiguration.setMapSymbol("TR");
        transfiguration.setInstructions();
        scenes[SceneType.transfiguration.ordinal()] = transfiguration;
        
        Scene divination = new Scene();
        divination.setDescription(
                "\nWelcome to Divination Class.");
        divination.setMapSymbol("DV");
        divination.setInstructions();
        scenes[SceneType.divination.ordinal()] = divination;
        
        Scene herbology = new Scene();
        herbology.setDescription(
                "\nWelcome to Herbology Class.");
        herbology.setMapSymbol("HB");
        herbology.setInstructions();
        scenes[SceneType.herbology.ordinal()] = herbology;
        
        Scene flying = new Scene();
        flying.setDescription(
                "\nWelcome to Flying Instruction Class.");
        flying.setMapSymbol("FY");
        flying.setInstructions();
        scenes[SceneType.flying.ordinal()] = flying;
        
        Scene magicalCreatures = new Scene();
        magicalCreatures.setDescription(
                "\nWelcome to Care of Magical Creatutres Class.");
        magicalCreatures.setMapSymbol("MC");
        magicalCreatures.setInstructions();
        scenes[SceneType.careOfMagicalCreatures.ordinal()] = magicalCreatures;
        
        Scene hallways = new Scene();
        hallways.setDescription(
                "\nThis is a hallway");
        hallways.setMapSymbol("HW");
        scenes[SceneType.hallways.ordinal()] = hallways;
        
        Scene greatHall = new Scene();
        greatHall.setDescription(
                "\nWelcome to the Great Hall.");
        greatHall.setMapSymbol("GH");
        scenes[SceneType.greatHall.ordinal()] = greatHall;
        
        Scene quidditchField = new Scene();
        quidditchField.setDescription(
                "\nWelcome to the Quidditch Field.");
        quidditchField.setMapSymbol("QF");
        scenes[SceneType.quidditchField.ordinal()] = quidditchField;
        
        Scene bathroom = new Scene();
        bathroom.setDescription(
                "\nThis is the bathroom.");
        bathroom.setMapSymbol("BR");
        scenes[SceneType.bathroom.ordinal()] = bathroom;
        
        Scene exam = new Scene();
        exam.setDescription(
                "\nFinal Exam.");
        exam.setMapSymbol("EX");
        exam.setQuestions();
        scenes[SceneType.exam.ordinal()] = exam;
        
        return scenes;
    }

    static void moveActorsToStartingLocation(Map map) {
       System.out.println("*** this moves actors to starting locations on map ***");
    }
    
}
