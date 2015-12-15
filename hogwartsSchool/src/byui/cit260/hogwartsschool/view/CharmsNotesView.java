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
public class CharmsNotesView extends View{

     public CharmsNotesView(){
        super("\n"
            + "\n---------------------------------------------------------------"
            + "\n| Charms                                                       |"
            + "\n---------------------------------------------------------------"
            + "\nI - Instructions"
            + "\nS - Swish"
            + "\nK - Flick"
            + "\nC - Incantation"
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
            case 'S': // Swish
                this.swish();
                break;
            case 'K': // Flick
                this.flick();
                break;
            case 'C': // Incantation
                this.incantation();
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

    private void swish() {
       this.console.println("\n*** Swish ***");
    }

    private void flick() {
       this.console.println("\n*** Flick ***");
    }

    private void incantation() {
        this.console.println("\n*** Incantation ***");
    }
}

  
    

