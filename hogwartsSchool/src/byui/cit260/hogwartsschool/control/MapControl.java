/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsschool.control;

import byui.cit260.hogwartsschool.exception.MapControlException;
import byui.cit260.hogwartsschool.model.Actor;
import byui.cit260.hogwartsschool.model.Game;
import byui.cit260.hogwartsschool.model.Map;
import byui.cit260.hogwartsschool.model.Question;
import byui.cit260.hogwartsschool.model.Scene;
import byui.cit260.hogwartsschool.model.SceneType;
import static byui.cit260.hogwartsschool.model.SceneType.exam;
import hogwartsschool.HogwartsSchool;
import java.awt.Point;

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
        Question[] questionsH = new Question[15];
        Question firstQuestionH = new Question();
        firstQuestionH.setQuestion("Question one");
        firstQuestionH.setAnswer("answer 1");
        questionsH[0] = firstQuestionH;
        startingScene.setQuestions(questionsH);
        scenes[SceneType.start.ordinal()] = startingScene;
        
        Scene potionsClass = new Scene();
        potionsClass.setDescription(
                "\n Welcome to potions class.");
        potionsClass.setMapSymbol("P");
        String[] instructionsP = new String[4];
        instructionsP[0] = "instruction 1";
        potionsClass.setInstructions(instructionsP);
        scenes[SceneType.potions.ordinal()] = potionsClass;
        
        Scene charmsClass = new Scene();
        charmsClass.setDescription(
                 "\n Welcome to Charms class,");
        charmsClass.setMapSymbol("C");
        String[] instructionsC = new String[4];
        instructionsC[0] = "instruction 1";
        charmsClass.setInstructions(instructionsC);
        scenes[SceneType.charms.ordinal()] = charmsClass;
        
        Scene ancientRunes = new Scene();
        ancientRunes.setDescription(
                  "\nWelcome to Ancient Runes Class.");
        ancientRunes.setMapSymbol("AR");
        String[] instructionsAR = new String[4];
        instructionsAR[0] = "instruction 1";
        ancientRunes.setInstructions(instructionsAR);
        scenes[SceneType.ancientRunes.ordinal()] = ancientRunes;
        
        Scene darkArts = new Scene();
        darkArts.setDescription(
                "\nWelcome to Defense Against the Darl Arts Class.");
        darkArts.setMapSymbol("DA");
        String[] instructionsDA = new String[4];
        instructionsDA[0] = "instruction 1";
        darkArts.setInstructions(instructionsDA);
        scenes[SceneType.defenseAgainstTheDarkArts.ordinal()] = darkArts;
        
        Scene astronomy = new Scene();
        astronomy.setDescription(
                "\nWelcome to Astronomy Class.");
        astronomy.setMapSymbol("AS");
        String[] instructionsAS = new String[4];
        instructionsAS[0] = "instruction 1";
        astronomy.setInstructions(instructionsAS);
        scenes[SceneType.astronomy.ordinal()] = astronomy;
        
        Scene transfiguration = new Scene();
        transfiguration.setDescription(
                "\nWelcome to Transfiguration Class.");
        transfiguration.setMapSymbol("TR");
        String[] instructionsTR = new String[4];
        instructionsTR[0] = "instruction 1";
        transfiguration.setInstructions(instructionsTR);
        scenes[SceneType.transfiguration.ordinal()] = transfiguration;
        
        Scene divination = new Scene();
        divination.setDescription(
                "\nWelcome to Divination Class.");
        divination.setMapSymbol("DV");
        String[] instructionsDV = new String[4];
        instructionsDV[0] = "instruction 1";
        divination.setInstructions(instructionsDV);
        scenes[SceneType.divination.ordinal()] = divination;
        
        Scene herbology = new Scene();
        herbology.setDescription(
                "\nWelcome to Herbology Class.");
        herbology.setMapSymbol("HB");
        String[] instructionsHB = new String[4];
        instructionsHB[0] = "instruction 1";
        herbology.setInstructions(instructionsHB);
        scenes[SceneType.herbology.ordinal()] = herbology;
        
        Scene flying = new Scene();
        flying.setDescription(
                "\nWelcome to Flying Instruction Class.");
        flying.setMapSymbol("FY");
        String[] instructionsFY = new String[4];
        instructionsFY[0] = "instruction 1";
        flying.setInstructions(instructionsFY);
        scenes[SceneType.flying.ordinal()] = flying;
        
        Scene magicalCreatures = new Scene();
        magicalCreatures.setDescription(
                "\nWelcome to Care of Magical Creatutres Class.");
        magicalCreatures.setMapSymbol("MC");
        String[] instructionsMC = new String[4];
        instructionsMC[0] = "instruction 1";
        magicalCreatures.setInstructions(instructionsMC);
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
        Question[] questions = new Question[10];
        Question firstQuestion = new Question();
        firstQuestion.setQuestion("Question one");
        firstQuestion.setAnswer("answer 1");
        questions[0] = firstQuestion;
        exam.setQuestions(questions);
        scenes[SceneType.exam.ordinal()] = exam;
        
        return scenes;
    }

    public static void moveActorsToStartingLocation(Map map) 
                    throws MapControlException{
       Actor[] actors = Actor.values();
       
       for(Actor actor : actors){
           Point coordinates = actor.getCoordinates();
           try {
               MapControl.moveActorToLocation(actor, coordinates);
           }
           catch(MapControlException me) {
               System.out.println(me.getMessage());
           }
                   
       }
       
    }

    private static void moveActorToLocation(Actor actor, Point coordinates) 
                            throws MapControlException{
        Map map = HogwartsSchool.getCurrentGame().getMap();
        int newRow = coordinates.x-1;
        int newColumn = coordinates.y-1;
        
        if(newRow < 0 || newRow >= map.getNumRows() ||
           newColumn < 0 || newColumn >= map.getNumColumns()) {
            throw new MapControlException("Can not move actor to location"
                    + coordinates.x + ", " + coordinates.y
                    + "because that location is outside the bound of map.");
        }
       
    }

    
    
}
