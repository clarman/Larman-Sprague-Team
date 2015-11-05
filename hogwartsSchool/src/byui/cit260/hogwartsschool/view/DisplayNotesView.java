/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsschool.view;

import java.util.Scanner;

/**
 *
 * @author chad
 */
class DisplayNotesView {
     private final String MENU = "\n"
            + "\n---------------------------------------------------------------"
            + "\n| Notes Menu                                                   |"
            + "\n---------------------------------------------------------------"
            + "\nP - Potions"
            + "\nC - Charms"
            + "\nR - Ancient Runes"
            + "\nD - Defense Against the Dark Arts"
            + "\nA - Astronomy"
            + "\nT - Transfiguration"
            + "\nV - Divination"
            + "\nB - Herbology"
            + "\nM - Care of Magical Creatures"
            + "\nF - Flying"
            + "\nQ - Quit"
            + "\n---------------------------------------------------------------";

    void displayMenu() {
       
        char selection = ' ';
        do{
            System.out.println(MENU); //display the notes menu
            
            String input = this.getInput(); // get the user's selection
            selection = input.charAt(0); // get first character of string
            
            this.doAction(selection); // do action based on selection
            
        } while (selection != 'Q'); // an selection is not "Quit"
    }

    private String getInput() {
        boolean valid = false; // indicates if the name has been retrieved
         String menuItem = null; 
         Scanner keyboard = new Scanner(System.in); // keyboard input stream
         
         while(!valid) { // while a valid name has not been retrieved
             
             //promp for the menu item
             System.out.println("Enter the menu item below:");
             
             //get the menu item from the keyboard and trim off the blanks
             menuItem = keyboard.nextLine(); 
             menuItem = menuItem.trim();
            
             //if the name is invalid (less than tone character in length
             if (menuItem.length() <1) {
                 System.out.println("Invalid menu item - the menu item must not be blank");
                 continue; // and repeat again
             }
             break; // out of the (exit) the repetition 
         }
         
         return menuItem; // return the name
    
    }

    private void doAction(char choice) {
        
        switch (choice) {
            case 'P': // view potions notes
                this.potionsNotes();
                break;
            case 'C': // view charms notes
                this.charmsNotes();
                break;
            case 'R': // view ancient runes notes
                this.ancientRunesNotes();
                break;
            case 'D': // view defense against the dark arts notes
                this.defenseNotes();
                break;
            case 'A': // view astronomy notes
                this.astronomyNotes();
                break;
            case 'T': // view transfiguration notes
                this.transfigurationNotes();
                break;
            case 'V': // view divination notes
                this.divinationNotes();
                break;
            case 'B': // view herbology notes
                this.herbologyNotes();
                break;
            case 'M': // view care of magical creatures notes
                this.magicalCreatureNotes();
                break;
            case 'F': // view flying notes
                this.flyingNotes();
                break;
            case 'Q': // quit program
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
    }

    private void potionsNotes() {
        System.out.println("\n*** potions notes ***");
    }

    private void charmsNotes() {
        System.out.println("\n*** charms notes ***");
    }

    private void ancientRunesNotes() {
        System.out.println("\n*** ancient rune notes ***");
    }

    private void defenseNotes() {
        System.out.println("\n*** defense against the dark arts notes ***");
    }

    private void astronomyNotes() {
        System.out.println("\n*** astronomy notes ***");
    }

    private void transfigurationNotes() {
        System.out.println("\n*** transfiguration notes ***");
    }

    private void divinationNotes() {
        System.out.println("\n*** divination notes ***");
    }

    private void herbologyNotes() {
        System.out.println("\n*** herbology notes ***");
    }

    private void magicalCreatureNotes() {
        System.out.println("\n*** care of magical creature notes ***");
    }

    private void flyingNotes() {
        System.out.println("\n*** flying notes ***");
    }
}

    