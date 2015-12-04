/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsschool.view;

/**
 *
 * @author Chadl
 */
public class ExploreAreaView extends View{
    
    public ExploreAreaView(){
       super("\n"
            + "\n---------------------------------------------------------------"
            + "\n| Explore Area                                                   |"
            + "\n---------------------------------------------------------------"
            + "\nE - Explore"
            + "\nC - Continue"
            + "\nB - Back"
            + "\n---------------------------------------------------------------");
    }
    @Override
    public boolean doAction(Object inputs) {
        
        String value = (String) inputs; 
        value = value.toUpperCase();
        char choice = value.charAt(0);
        
        switch (choice) {
            case 'E': // explore area
                this.exploreArea();
                break;
            case 'C': // continue forward
                this.continueOn();
                break;
            case 'B': // exit 
                return true;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }
      return false;  
    }

    private void exploreArea() {
        this.console.println("*** explore the area ***");
    }

    private void continueOn() {
       this.console.println("*** continue ***");
    }
    
}
