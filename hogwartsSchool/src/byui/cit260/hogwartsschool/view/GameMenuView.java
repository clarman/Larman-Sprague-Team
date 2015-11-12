/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsschool.view;

import byui.cit260.hogwartsschool.control.QuestionsControl;
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
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void viewMap() {
        System.out.println("\n*** viewMap is called ***");
    }

    private void viewCurrentPoints() {
        CurrentPointsView currentPoints = new CurrentPointsView();
        currentPoints.display();
    }

    private void moveLocation() {
         System.out.println("\n*** moveLocation is called ***");
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
        System.out.println("\n*** takeNotes is called ***");
    }

    private void takeExam() {
         // create a new game
        QuestionsControl.takeExam();
    }

    private void displayHelpMenu() {
       System.out.println("\n*** displayHelpMenu ***");
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
