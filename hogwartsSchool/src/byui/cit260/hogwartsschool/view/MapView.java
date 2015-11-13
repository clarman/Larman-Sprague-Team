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
public class MapView extends View{
    
    public MapView(){
        super ("\n"
               + "\n------------------------------------------------------------"
               + "\n| View Map                                                  |"
               + "\n------------------------------------------------------------"
               + "\nM - Move Location                                           "
               + "\nF - Move Forward                                            "
               + "\nB - Move Backward                                           "
               + "\nR - Move Right                                              "
               + "\nL - Move Left                                               "
               + "\nE - Exit                                                     "
               + "\n------------------------------------------------------------");
    }
    @Override
    public boolean doAction(Object inputs) {
        
        String value = (String) inputs;
        value = value.toUpperCase();
        char choice = value.charAt(0);
        
        switch (choice) {
            case 'M': // Move Location
                this.moveLocation();
                break; 
            case 'F': // Move Forward
                this.moveForward();
            case 'B': // Move Backward
                this.moveBackward();
            case 'R': // Move Right
                this.moveRight();
            case 'L': // Move Left
                this.moveLeft();
            case 'E': // Exit
                return true;
            default:
                System.out.println("\n*** Invalid Section *** Try again");
                break; 
        }
        return false; 
    }

    private void moveLocation() {
       System.out.println("*** move to different location ***");
    }

    private void moveForward() {
        System.out.println("*** move forward ***");
    }

    private void moveBackward() {
       System.out.println("*** move backward ***");
    }

    private void moveRight() {
        System.out.println("*** move right ***");
    }

    private void moveLeft() {
        System.out.println("*** move left ***");
    }
}
