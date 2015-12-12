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
        instructionsP[0] = "Make potion.";
        potionsClass.setInstructions(instructionsP);
        scenes[SceneType.potions.ordinal()] = potionsClass;
        
        Scene charmsClass = new Scene();
        charmsClass.setDescription(
                 "\n Welcome to Charms class,");
        charmsClass.setMapSymbol("C");
        String[] instructionsC = new String[4];
        instructionsC[0] = "Make object float.";
        charmsClass.setInstructions(instructionsC);
        scenes[SceneType.charms.ordinal()] = charmsClass;
        
        Scene ancientRunes = new Scene();
        ancientRunes.setDescription(
                  "\nWelcome to Ancient Runes Class.");
        ancientRunes.setMapSymbol("AR");
        String[] instructionsAR = new String[4];
        instructionsAR[0] = "Determine rune numbers.";
        ancientRunes.setInstructions(instructionsAR);
        scenes[SceneType.ancientRunes.ordinal()] = ancientRunes;
        
        Scene darkArts = new Scene();
        darkArts.setDescription(
                "\nWelcome to Defense Against the Darl Arts Class.");
        darkArts.setMapSymbol("DA");
        String[] instructionsDA = new String[4];
        instructionsDA[0] = "Duel.";
        darkArts.setInstructions(instructionsDA);
        scenes[SceneType.defenseAgainstTheDarkArts.ordinal()] = darkArts;
        
        Scene astronomy = new Scene();
        astronomy.setDescription(
                "\nWelcome to Astronomy Class.");
        astronomy.setMapSymbol("AS");
        String[] instructionsAS = new String[4];
        instructionsAS[0] = "Learn constellations.";
        astronomy.setInstructions(instructionsAS);
        scenes[SceneType.astronomy.ordinal()] = astronomy;
        
        Scene transfiguration = new Scene();
        transfiguration.setDescription(
                "\nWelcome to Transfiguration Class.");
        transfiguration.setMapSymbol("TR");
        String[] instructionsTR = new String[4];
        instructionsTR[0] = "Transform animal into a cup.";
        transfiguration.setInstructions(instructionsTR);
        scenes[SceneType.transfiguration.ordinal()] = transfiguration;
        
        Scene divination = new Scene();
        divination.setDescription(
                "\nWelcome to Divination Class.");
        divination.setMapSymbol("DV");
        String[] instructionsDV = new String[4];
        instructionsDV[0] = "Determine what the tea leaves are saying.";
        divination.setInstructions(instructionsDV);
        scenes[SceneType.divination.ordinal()] = divination;
        
        Scene herbology = new Scene();
        herbology.setDescription(
                "\nWelcome to Herbology Class.");
        herbology.setMapSymbol("HB");
        String[] instructionsHB = new String[4];
        instructionsHB[0] = "Repot a mandrake.";
        herbology.setInstructions(instructionsHB);
        scenes[SceneType.herbology.ordinal()] = herbology;
        
        Scene flying = new Scene();
        flying.setDescription(
                "\nWelcome to Flying Instruction Class.");
        flying.setMapSymbol("FY");
        String[] instructionsFY = new String[4];
        instructionsFY[0] = "Learn to fly.";
        flying.setInstructions(instructionsFY);
        scenes[SceneType.flying.ordinal()] = flying;
        
        Scene magicalCreatures = new Scene();
        magicalCreatures.setDescription(
                "\nWelcome to Care of Magical Creatutres Class.");
        magicalCreatures.setMapSymbol("MC");
        String[] instructionsMC = new String[4];
        instructionsMC[0] = "Learn how to care for a thestral.";
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
        firstQuestion.setQuestion("\n 1. What Potion makes you successful in all your" +
                         "+ \nendeavors?" +
                         "+ \n a. Essence of Dittany" +
                         "+ \n b. Felix Felicis" +
                         "+ \n c. Plyjuice Potion" +
                         "+ \n d. Draught of Living Death");
        firstQuestion.setAnswer("B");
        
         Question secondQuestion = new Question();
        secondQuestion.setQuestion("\n 2. What charm allows you to breath under water?" +
                         "+ \n a. Muffiato Charm" +
                         "+ \n b. Summoning Charm" +
                         "+ \n c. Wingardium Leviosa" +
                         "+ \n d. Bubble-Head Charm");
        secondQuestion.setAnswer("D");
        
         Question thirdQuestion = new Question();
         thirdQuestion.setQuestion("\n 3. What rune symbolizes the number 2?" +
                         "+ \n a. Graphorn" +
                         "+ \n b. Unicorn" +
                         "+ \n c. Hydra" +
                         "+ \n d. Runespoor");
         thirdQuestion.setAnswer("A");
        
         Question fourthQuestion = new Question();
        fourthQuestion.setQuestion("\n 4. What charm stuns your victim?" +
                         "+ \n a. Expelliarmus" +
                         "+ \n b. Stupify" +
                         "+ \n c. Wingardium Leviosa" +
                         "+ \n d. Cruciatus");
        fourthQuestion.setAnswer("B");
        
         Question fifthQuestion = new Question();
        fifthQuestion.setQuestion("\n 5. What constellation is named after an" +
                              "+\nEthiopian Queen?" +
                         "+ \n a. Hercules" +
                         "+ \n b. Cetus" +
                         "+ \n c. Cassiopeia" +
                         "+ \n d. Carina");
        fifthQuestion.setAnswer("C");
        
         Question sixthQuestion = new Question();
        sixthQuestion.setQuestion("\n 6. What is a person called when they can" +
                              "+\ntransform into an animal?" +
                         "+ \n a. Metamorphmagus" +
                         "+ \n b. Switcher" +
                         "+ \n c. Animagus" +
                         "+ \n d. Werewolf");
        sixthQuestion.setAnswer("C");
        
         Question seventhQuestion = new Question();
        seventhQuestion.setQuestion("\n 7. What is the form of divination called when" +
                             "+\n you are reading tea leaves?" +
                         "+ \n a. Crystal-gazing" +
                         "+ \n b. Dream interpretation" +
                         "+ \n c. Cartomancy" +
                         "+ \n d. Tessomancy");
        seventhQuestion.setAnswer("D");
        
         Question eighthQuestion = new Question();
        eighthQuestion.setQuestion("\n 8. What plant has the magical ability to" +
                                     "+\nconstrict or strangle?" +
                         "+ \n a. Devil's Snare" +
                         "+ \n b. Mandrake" +
                         "+ \n c. Puffapods" +
                         "+ \n d. Dittany");
        eighthQuestion.setAnswer("A");
        
         Question ninthQuestion = new Question();
        ninthQuestion.setQuestion("\n 9. What animal is a winged horse with a skeletal" +
                              "+\nbody, face with reptiliam features, and wide" +
                              "+\nleathery wings that resemble a bat's?" +
                         "+ \n a. Hippogriff" +
                         "+ \n b. Thestral" +
                         "+ \n c. Chinese fire-ball" +
                         "+ \n d. Basilisk");
        ninthQuestion.setAnswer("B");
        
         Question tenthQuestion = new Question();
        tenthQuestion.setQuestion("\n 10. What is the player called in Quidditch that" +
                               "+\nthat defends the three posts?" +
                         "+ \n a. Seeker" +
                         "+ \n b. Chaser" +
                         "+ \n c. Keeper" +
                         "+ \n d. Beater");
        tenthQuestion.setAnswer("C");
        
        questions[0] = firstQuestion;
        questions[1] = secondQuestion;
        questions[2] = thirdQuestion;
        questions[3] = fourthQuestion;
        questions[4] = fifthQuestion;
        questions[5] = sixthQuestion;
        questions[6] = seventhQuestion;
        questions[7] = eighthQuestion;
        questions[8] = ninthQuestion;
        questions[9] = tenthQuestion;
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
