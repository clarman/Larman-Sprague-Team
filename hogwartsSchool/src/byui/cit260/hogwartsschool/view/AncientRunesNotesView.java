/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsschool.view;

/**
 *
 * @author cierasprague
 */
public class AncientRunesNotesView extends View{

   public AncientRunesNotesView(){
        super("\n"
            + "\n---------------------------------------------------------------"
            + "\n| Ancient Runes Notes View                                    |"
            + "\n---------------------------------------------------------------"
            + "\nI - Instructions"
            + "\nK - View Key"
            + "\nT - Translate"
            + "\nF - Finish"
            + "\n---------------------------------------------------------------");
    }

    @Override
    public boolean doAction(Object inputs) {
       String value = (String) inputs; 
        value = value.toUpperCase();
        char choice = value.charAt(0);
        
        switch (choice) {
            case 'I': // view Instructions
                this.viewInstructions();
                break;
            case 'K': // View Keys
                this.viewKeys();
                break;
            case 'T': // Translate
                this.translate();
                break;
            case 'F': // Finish
                return true;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void viewInstructions() {
        this.console.println("\n*** Intrustions ***");
    }

    private void viewKeys() {
        this.console.println("\n*** View Keys ***");
    }

    private void translate() {
        this.console.println("\n*** Translate ***");
    }
    
}
