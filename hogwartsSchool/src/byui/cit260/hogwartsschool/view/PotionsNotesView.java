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
public class PotionsNotesView extends View{

    public PotionsNotesView(){
        super("\n"
            + "\n---------------------------------------------------------------"
            + "\n| Potions                                                     |"
            + "\n---------------------------------------------------------------"
            + "\nI - Instructions"
            + "\nS - Add spiders"
            + "\nN - Add newts"
            + "\nW - Add Water"
            + "\nM - Mix"
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
            case 'S': // Add Spiders
                this.addSpiders();
                break;
            case 'N': // Add Newts
                this.addNewts();
                break;
            case 'W': // Add Water
                this.addWater();
                break;
            case 'M': // 
                this.mix();
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

    private void addSpiders() {
        this.console.println("\n*** Add Spiders ***");
    }

    private void addNewts() {
        this.console.println("\n*** Add Newts ***");
    }

    private void addWater() {
        this.console.println("\n*** Add Water ***");
    }

    private void mix() {
        this.console.println("\n*** Mix ***");
    }
    }

    
    

