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
public class HelpMenuView extends View{
    
    public HelpMenuView(){
        super("\n"
            + "\n---------------------------------------------------------------"
            + "\n| Help Menu                                                   |"
            + "\n---------------------------------------------------------------"
            + "\nG - What is the goal of the game?"
            + "\nM - How to move?"
            + "\nP - How do I get points?"
            + "\nH - What house am I in?"
            + "\nN - What are notes?"
            + "\nQ - Quit"
            + "\n---------------------------------------------------------------");
    }
    
    @Override
    public boolean doAction(Object inputs) {
        
        String value = (String) inputs; 
        value = value.toUpperCase();
        char choice = value.charAt(0);
        
        switch (choice) {
            case 'G': // What is the goal of the game?
                this.goalOfGame();
                break;
            case 'M': // How to move?
                this.howToMove();
                break;
            case 'P': // How do I get points?
                this.getPoints();
                break;
            case 'H': // What house am I in?
                this.whatHouse();
                break;
            case 'N': // What are notes?
                this.whatAreNotes();
                break;
            case 'Q': // quit program
                return true;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void goalOfGame() {
        System.out.println("\n*** goalOfGame ***");
    }

    private void howToMove() {
        System.out.println("\n*** howToMove ***");
    }

    private void getPoints() {
        System.out.println("\n*** getPoints ***");
    }

    private void whatHouse() {
        System.out.println("\n*** whatHouse ***");
    }

    private void whatAreNotes() {
        System.out.println("\n*** whatAreNotes ***");
    }
    
}
