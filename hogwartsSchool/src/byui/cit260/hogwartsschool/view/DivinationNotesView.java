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
public class DivinationNotesView extends View{
        
     public DivinationNotesView(){
        super("\n"
            + "\n---------------------------------------------------------------"
            + "\n| Divination                                                  |"
            + "\n---------------------------------------------------------------"
            + "\nI - Instructions"
            + "\nT - Drink Tea"
            + "\nL - Look at Tea Leaves"
            + "\nD - Decipher meaning"
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
            case 'T': // Drink Tea
                this.drinkTea();
                break;
            case 'L': // Look at Tea Leaves
                this.teaLeaves();
                break;
            case 'D': // Decipher Meaning
                this.decipherMeaning();
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

    private void drinkTea() {
        this.console.println("\n*** Drink Tea ***");
    }

    private void teaLeaves() {
       this.console.println("\n*** Look at Tea Leaves ***");
    }

    private void decipherMeaning() {
        this.console.println("\n*** Decipher Meaning ***");
    }

    
    
}
