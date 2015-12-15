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
public class FlyingNotesView extends View{

   public FlyingNotesView(){
        super("\n"
            + "\n---------------------------------------------------------------"
            + "\n| Flying                                                      |"
            + "\n---------------------------------------------------------------"
            + "\nI - Instructions"
            + "\nC - Calculate"
            + "\nY - Fly"
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
            case 'Y': // Fly
                this.fly();
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
       FlyingTempView calculate = new FlyingTempView();
       calculate.display();
    }

    private void fly() {
        this.console.println("\n*** Intrustions ***");
    }

    }
    
