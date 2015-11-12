/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsschool.view;

import java.util.Scanner;

/**
 *
 * @author cierasprague
 */
class CurrentPointsView extends View{
    
    public CurrentPointsView(){
        super("\n"
            + "\n---------------------------------------------------------------"
            + "\n| Current Points                                              |"
            + "\n---------------------------------------------------------------"
            + "\n Gryffindor   *Total house points*                             "
            + "\n Hufflepuff   *Total house points*                             "
            + "\n Ravenclaw    *Total house points*                             "
            + "\n Slytherin    *Total house points*                             "
            + "\n---------------------------------------------------------------"
            + "\nV - View map                                                   "
            + "\nM - Move to a new location                                     "
            + "\nE - Explore the area                                           "
            + "\nN - View notes                                                 "
            + "\nT - Take notes                                                 "
            + "\nX - Take exam                                                  "
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
            case 'X': // take exam
                this.takeExam();
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

    private void moveLocation() {
         System.out.println("\n*** moveLocation is called ***");
    }

    private void exploreArea() {
        System.out.println("\n*** exploreArea is called ***");
    }

    private void viewNotes() {
        System.out.println("\n*** viewNotes is called ***");
    }

    private void takeNotes() {
        System.out.println("\n*** takeNotes is called ***");
    }

    private void takeExam() {
        System.out.println("\n*** takeExam is called ***");
    }

    private void displayHelpMenu() {
       System.out.println("\n*** displayHelpMenu ***");
    }
    
}