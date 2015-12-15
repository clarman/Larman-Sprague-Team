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
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void goalOfGame() {
        this.console.println("\nThe goal of the game is to earn the highest"
                + "\namount of House points during the game. While playing the "
                + "\ngame you will have to calucate three different formulas"
                + "\nalong the way. Once you have exceeded and taken all your"
                + "\nclasses you can then take the exam to finish the game."
                + "\nOnce all the classes and exam has been taken, "
                + "the house who ends up with the most points wins the game.");
    }

    private void howToMove() {
        this.console.println("\nTo move to a new location type the letter to the"
                + "\ndirection you want to move in the 'Move to a New Location'"
                + "\nsection under the Game Menu. Once you are there you will be"
                + "\n able to move your character forward, backward, left and right.");
    }

    private void getPoints() {
        this.console.println("\nIn order to get House points throughout the game,"
                + "\nyou must complete the different classes"
                + "\nand pass the Exam at the end of the game.");
    }

    private void whatHouse() {
        this.console.println("\nAt the begining of the game you took a quiz in"
                + "\norder to figure out what House you belong too. After you are "
                + "\ndone with the quiz you will be given the results of your "
                + "\nanswers and will find out what House you belong too.");
    }

    private void whatAreNotes() {
        this.console.println("\nDuring class you will have the"
                + "\noppurtunity to take notes of the lectures you will have."
                + "\nIf you chooses to take notes during these lectures"
                + "\nyou will have the ability to look back at what you"
                + "\nwere taught during the game. These notes will be displayed"
                + "\nunder the Take Notes section proved throughout the game."
                + "\nThe Player will also have the ability to 'View Notes' this"
                + "\nmeans that you can choose which classes you want to take"
                + "\nduring the game.");
    }
    
}
