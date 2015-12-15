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
public class DefenseNotesView extends View{

     public DefenseNotesView(){
        super("\n"
            + "\n---------------------------------------------------------------"
            + "\n| Defense Against the Dark Arts                                |"
            + "\n---------------------------------------------------------------"
            + "\nI - Instructions"
            + "\nD - Disarm"
            + "\nS - Stun"
            + "\nB - Bow"
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
            case 'D': // Disarm
                this.disarm();
                break;
            case 'S': // Stun
                this.stun();
                break;
            case 'B': // Bow
                this.bow();
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

    private void disarm() {
       this.console.println("\n*** Disarm ***"); 
    }

    private void stun() {
        this.console.println("\n*** Stun ***");
    }

    private void bow() {
        this.console.println("\n*** Bow ***");
    }
    }
