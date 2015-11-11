/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsschool.view;

import java.util.Scanner;

/**
 *
 * @author Chadl
 */
public abstract class View implements ViewInterface{
    private String promptMessage;
    
    public View(String promptMessage){
        this.promptMessage = promptMessage;
    }
    @Override
    public void display() {
       
        String value = "";
        boolean done = false;
                
        do{
            System.out.println(this.promptMessage); //display prompt message
            value = this.getInput(); // get value end user entered
            done = this.doAction(value); // do action based on value entered
            
        } while (!done);
    }
    @Override
    public String getInput() {
       Scanner keyboard = new Scanner(System.in);
       boolean valid = false;
       String value = null;        
         
         while(!valid) { // while a valid name has not been retrieved
             
             // get the value entered from the keyboard
             value = keyboard.nextLine();
             value = value.trim();
            
             //if blank has been entered
             if (value.length() <1) {
                 System.out.println("You must enter a value.");
                 continue; 
             }
             break; 
         }
         
         return value; // return the name
    
    }

    public String getPromptMessage() {
        return promptMessage;
    }

    public void setPromptMessage(String message) {
        this.promptMessage = message;
    }
}
