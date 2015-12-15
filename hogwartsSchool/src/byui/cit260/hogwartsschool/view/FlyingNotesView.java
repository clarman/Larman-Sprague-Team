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
        this.console.println("\nFound the average acceleration if would take you"
             + "\nto fly your character.Using this formula: "
             + "\n(d/t)/t where (d) equals distance and (t) equals time."
             + "\nIf your calculation is done right your House will recieve "
             + "\n100 points.");
    }

    private void calculate() {
       FlyingTempView calculate = new FlyingTempView();
       calculate.display();
    }

    private void fly() {
        this.console.println("\nThe students from Gryffindor and Slytherin make "
            + "\ntwo rows, and then their teacher, Madam Hooch, shows. "
            + "\nShe tells them all to hold their hands over their brooms and"
            + "\ncall, 'Up!' Everyone tries, but only a couple of people, "
            + "\nincluding Harry, get the hang of it right away, and Neville"
            + "\ndoesn't at all.She shows them how to mount and tells them to"
            + "\ntake off. But Neville goes early, can't control it, and falls"
            + "\noff from a great height. He has a broken wrist and Madam Hooch "
            + "\ntakes him to the infirmary. She tells everyone else to wait "
            + "\nthere and not to fly their brooms.As soon as she's gone, Malfoy"
            + "\nmakes fun of Neville, and the two houses start arguing. Malfoy "
            + "\nproduces Neville's Remembrall and taunts Harry with it. Even "
            + "\nthough Madam Hooch said to not do anything, Malfoy flies off"
            + "\nwith the Remembrall and Harry chases him.");
    }

    }
    
