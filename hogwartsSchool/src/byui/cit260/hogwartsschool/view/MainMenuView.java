/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsschool.view;

import byui.cit260.hogwartsschool.control.GameControl;
import hogwartsschool.HogwartsSchool;
import java.util.Scanner;

/**
 *
 * @author chad
 */
public class MainMenuView extends View{
    
    public MainMenuView(){
       super("\n"
            + "\n---------------------------------------------------------------"
            + "\n| Main Menu                                                   |"
            + "\n---------------------------------------------------------------"
            + "\nG - Start new game"
            + "\nC - Continue saved game"
            + "\nH - Get Help"
            + "\nS - Save game"
            + "\nE - Exit"
            + "\n---------------------------------------------------------------");
    }
    
    @Override
    public boolean doAction(Object inputs) {
        
        String value = (String) inputs; 
        value = value.toUpperCase();
        char choice = value.charAt(0);
        
        switch (choice) {
            case 'G': // start new game
                this.startNewGame();
                break;
            case 'C': // continue saved game
                this.startExistingGame();
                break;
            case 'H': // display get help menu
                this.displayHelpMenu();
                break;
            case 'S': // save current game
                this.saveGame();
                break;
            case 'E': // exit program
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        
    }


    private void startNewGame() {
        // create a new game
       GameControl.createNewGame(HogwartsSchool.getPlayer());
       
       // display the game menu
       GameMenuView gameMenu = new GameMenuView();
       gameMenu.display();
    }

    private void startExistingGame() {
        System.out.println("*** startExistingGame function called ***");
    }

    private void displayHelpMenu() {
        // display the help menu
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void saveGame() {
        System.out.println("*** saveGame function called ***");
    }
   
}
