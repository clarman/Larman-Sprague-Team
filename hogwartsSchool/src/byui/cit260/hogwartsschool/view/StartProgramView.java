/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsschool.view;

import byui.cit260.hogwartsschool.control.ProgramControl;
import byui.cit260.hogwartsschool.model.Player;
import java.util.Scanner;

/**
 *
 * @author cierasprague
 */
public class StartProgramView {
   
    public StartProgramView () {
    }
    
    public void startProgram() {
       
        // Display the banner screen
        this.displayBanner(); 
        
        //prompt the player to enter their name Retrieve the name of the player
        String playersName = this.getPlayersName();
        
        // Create and sane the player object
        Player player = ProgramControl.createPlayer(playersName);
        
        //Display a personalized welcome message
        this.displayWelcomeMessage(player);
        
        //Display Main Menu
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.displayMenu();
   }

    private void displayBanner() {
        System.out.println("\n\n*****************************************************");
        
        System.out.println("*                                                   *"
                        +"\n* This is a game at Hogwarts school of Witchcraft   *"
                        +"\n* and Wizardry. The ulitmate goal of this game is to*"
                        +"\n* have the most house points at the end of the year.*");
        
        System.out.println("*                                                   *"
                        +"\n* You will first be sorted into a house based on a  *"
                        +"\n* quiz. You will be able to navigate to many        *"
                        +"\n* different classes, such as Potions, Charms,       *"
                        +"\n* Anicent Ruins, Defence Against the Dark Arts,     *"
                        +"\n* Astronomy, Transfiguration, Divination, Herbology,*"
                        +"\n* Care of Magical Creatures, and Flying. Each class *"
                        +"\n* will have an opportunity to gain house points by  *"
                        +"\n* completing tasks. Throughout the game you can     *"
                        +"\n* collect notes to help you with the final exam,    *"
                        +"\n* which you can gain a lot of house points from.    *");
        
        System.out.println("*                                                   *"
                        +"\n* Good luck and have fun on this magical adventure. *"
                        +"\n*                                                   *");
        
        System.out.println("*****************************************************");
    }

    private String getPlayersName() {
         boolean valid = false; // indicates if the name has been retrieved
         String playersName = null; 
         Scanner keyboard = new Scanner(System.in); // keyboard input stream
         
         while(!valid) { // while a valid name has not been retrieved
             
             //promp for the player's name
             System.out.println("Enter the player's name below:");
             
             //get the name from the keyboard and trim off the blanks
             playersName = keyboard.nextLine(); 
             playersName = playersName.trim();
            
             //if the name is invalid (less than two character in length
             if (playersName.length() <2) {
                 System.out.println("Invalid name - the name must not be blank");
                 continue; // and repeat again
             }
             break; // out of the (exit) the repetition 
         }
         
         return playersName; // return the name
    }

    private void displayWelcomeMessage(Player player) {
        System.out.println("\n\n================================================");
        System.out.println("\tWelcome to Hogwarts" + " " + player.getName());
        System.out.println("\tWe hope you have a magical journey!");
        System.out.println("==================================================");
    }
}
