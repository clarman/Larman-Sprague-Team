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
class DisplayNotesView extends View{
    
    public DisplayNotesView(){
        super("\n"
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
            + "\n---------------------------------------------------------------");
    }
    
    @Override
    public boolean doAction(Object inputs) {
        
        String value = (String) inputs; 
        value = value.toUpperCase();
        char choice = value.charAt(0);
        
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
                return true;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void potionsNotes() {
        PotionsNotesView potionsNotes = new PotionsNotesView();
        potionsNotes.display(); 
    }

    private void charmsNotes() {
        this.console.println("\n*** charms notes ***");
    }

    private void ancientRunesNotes() {
        this.console.println("\n*** ancient rune notes ***");
    }

    private void defenseNotes() {
        this.console.println("\n*** defense against the dark arts notes ***");
    }

    private void astronomyNotes() {
        this.console.println("\n*** astronomy notes ***");
    }

    private void transfigurationNotes() {
        this.console.println("\n*** transfiguration notes ***");
    }

    private void divinationNotes() {
        this.console.println("\n*** divination notes ***");
    }

    private void herbologyNotes() {
        this.console.println("\n*** herbology notes ***");
    }

    private void magicalCreatureNotes() {
        this.console.println("\n*** care of magical creature notes ***");
    }

    private void flyingNotes() {
        this.console.println("\n*** flying notes ***");
    }
}

    