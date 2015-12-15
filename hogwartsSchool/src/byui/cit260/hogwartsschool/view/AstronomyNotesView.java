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
public class AstronomyNotesView extends View{

    public AstronomyNotesView(){
        super("\n"
            + "\n---------------------------------------------------------------"
            + "\n| Astronomy                                                   |"
            + "\n---------------------------------------------------------------"
            + "\nI - Instructions"
            + "\nC - Calculate"
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
            case 'C': // Calculate
                this.calculate();
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

    private void calculate() {
        StarTempView calculate = new StarTempView();
        calculate.display();
    }
    }

