/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsschool.view;

import byui.cit260.hogwartsschool.control.QuestionsControl;
import byui.cit260.hogwartsschool.model.Location;
import byui.cit260.hogwartsschool.model.Map;
import hogwartsschool.HogwartsSchool;
import java.util.Scanner;

/**
 *
 * @author cierasprague
 */
public class GameMenuView extends View {
        public GameMenuView(){
           super("\n"
            + "\n---------------------------------------------------------------"
            + "\n| GameMenu                                                    |"
            + "\n---------------------------------------------------------------"
            + "\nV - View map                                                   "
            + "\nP - View current points                                        "
            + "\nM - Move to a new location                                     "
            + "\nE - Explore the area                                           "
            + "\nN - View notes                                                 "
            + "\nT - Take notes                                                 "
            + "\nS - Star Input                                                 "
            + "\nX - Take exam                                                  "
            + "\nC - CHALLENGE                                                  "
            + "\nH - Help                                                       "
            + "\nQ - Quit                                                       "
            + "\n---------------------------------------------------------------");
        }
    
    @Override
    public boolean doAction(Object inputs) {
        
        String value = (String) inputs; 
        value = value.toUpperCase();
        char choice = value.charAt(0);
        
        switch (choice) {
            case 'V': // view map
                this.viewMap();
                break;
            case 'P': // view current points
                this.viewCurrentPoints();
                break;
            case 'M': // move to a new location
                this.moveLocation();
                break;
            case 'E': // explore the area
                this.exploreArea();
                break;
            case 'N': // view notes
                this.viewNotes();
                break;
            case 'T': // take notes
                this.takeNotes();
                break;
            case 'S': //calculateStarsMagntude
                this.calculateStarsMagnitude();
                break;
            case 'X': // take exam
                this.takeExam();
                break;
            case 'C': // Challenge, flying formula 
                this.takeChallenge();
                break;
            case 'H': // help
                this.displayHelpMenu();
                break;
            case 'Q': // quit program
                return true;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void viewMap() {
        Map map = HogwartsSchool.getCurrentGame().getMap();
        Location[][] locations = map.getLocation();
        this.console.println("Hogwarts Map");
        this.console.println("  1   2   3   4   5");
        for (int i = 0; i < locations.length; i++) {
            
            this.console.println("---------------------");
            this.console.print(i + 1);
            for (int j = 0; j < locations[i].length; j++) {
                Location location = locations[i][j];
                this.console.print("|");
                String mapSymbol = location.getScene().getMapSymbol();
                this.console.print(mapSymbol);
                this.console.print("|");
                
                
            }
            this.console.println("");  
        }
        this.console.println("--------------------"); 
    }

    private void viewCurrentPoints() {
        CurrentPointsView currentPoints = new CurrentPointsView();
        currentPoints.display();
    }

    private void moveLocation() {
         this.console.println("\n*** moveLocation is called ***");
    }

    private void exploreArea() {
        ExploreAreaView exploreArea = new ExploreAreaView();
        exploreArea.display();
    }

    private void viewNotes() {
        // display view notes
        DisplayNotesView notesMenu = new DisplayNotesView();
        notesMenu.display();
    }

    private void takeNotes() {
        this.console.println("\n*** takeNotes is called ***");
    }

    private void takeExam() {
        QuestionsControl question = new QuestionsControl(); 
        question.getQuestion();
    }

    private void displayHelpMenu() {
       this.console.println("\n*** displayHelpMenu ***");
    }

    private void calculateStarsMagnitude() {
       StarTempView tempStar = new StarTempView();
       tempStar.display();
    }
    
    private void takeChallenge() {
        TakeChallenge takeChallenge = new TakeChallenge();
        takeChallenge.displayChallenge(); 
    }
    
}
