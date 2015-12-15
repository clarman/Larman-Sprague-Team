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
public class HerbologyNotesView extends View{

    public HerbologyNotesView(){
        super("\n"
            + "\n---------------------------------------------------------------"
            + "\n| Herbology                                                    |"
            + "\n---------------------------------------------------------------"
            + "\nI - Instructions"
            + "\nO - Observe Plant"
            + "\nD - Identify"
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
            case 'O': // Observe plants
                this.observePlants();
                break;
            case 'D': // Identify
                this.identify();
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

    private void observePlants() {
        this.console.println("\n*** Observe Plants ***");
    }

    private void identify() {
         this.console.println("\n*** Identify ***");
    }
    }

   
    
