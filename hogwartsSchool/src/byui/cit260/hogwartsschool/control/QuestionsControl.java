/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsschool.control;

import byui.cit260.hogwartsschool.model.Questions;
import java.util.Scanner;

/**
 *
 * @author chad
 */
public class QuestionsControl {

    
   int[] examQuestions = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
   
   public int getQuestion() {
       int value = 4;
       for(int question : examQuestions){
           if(examQuestions[question] == value){
               return question;
           }
       }
       return -1;
   }
    
    
    
    
    
    

    /*pu
   blic static void takeExam() {
        double actorPoints = 0;
        char answer;
        System.out.println("\n 1. What Potion makes you successful in all your"
                             + "\nendeavors?"
                         + "\n a. Essence of Dittany"
                         + "\n b. Felix Felicis"
                         + "\n c. Plyjuice Potion"
                         + "\n d. Draught of Living Death");
        Scanner keyboard = new Scanner(System.in); // keyboard input stream
        answer = keyboard.findInLine(".").charAt(0); 
        if(answer == 'b' || answer == 'B'){
            actorPoints += 10;
            }
        else {
            System.out.println("Incorrect");
        }
        System.out.println("\n 2. What charm allows you to breath under water?"
                         + "\n a. Muffiato Charm"
                         + "\n b. Summoning Charm"
                         + "\n c. Wingardium Leviosa"
                         + "\n d. Bubble-Head Charm");
        keyboard =  new Scanner(System.in); // keyboard input stream
        answer = keyboard.findInLine(".").charAt(0); 
        if(answer == 'd' || answer == 'D'){
            actorPoints += 10;
            }
        else {
            System.out.println("Incorrect");
        }
        System.out.println("\n 3. What rune symbolizes the number 2?"
                         + "\n a. Graphorn"
                         + "\n b. Unicorn"
                         + "\n c. Hydra"
                         + "\n d. Runespoor");
        keyboard =  new Scanner(System.in); // keyboard input stream
        answer = keyboard.findInLine(".").charAt(0); 
        if(answer == 'a' || answer == 'A'){
            actorPoints += 10;
            }
        else {
            System.out.println("Incorrect");
        }
        System.out.println("\n 4. What charm stuns your victim?"
                         + "\n a. Expelliarmus"
                         + "\n b. Stupify"
                         + "\n c. Wingardium Leviosa"
                         + "\n d. Cruciatus");
        keyboard =  new Scanner(System.in); // keyboard input stream
        answer = keyboard.findInLine(".").charAt(0); 
        if(answer == 'b' || answer == 'B'){
            actorPoints += 10;
            }
        else {
            System.out.println("Incorrect");
        }
        System.out.println("\n 5. What constellation is named after an "
                              +"\nEthiopian Queen?"
                         + "\n a. Hercules"
                         + "\n b. Cetus"
                         + "\n c. Cassiopeia"
                         + "\n d. Carina");
        keyboard =  new Scanner(System.in); // keyboard input stream
        answer = keyboard.findInLine(".").charAt(0); 
        if(answer == 'c' || answer == 'C'){
            actorPoints += 10;
            }
        else {
            System.out.println("Incorrect");
        }
        System.out.println("\n 6. What is a person called when they can"
                              +"\ntransform into an animal?"
                         + "\n a. Metamorphmagus"
                         + "\n b. Switcher"
                         + "\n c. Animagus"
                         + "\n d. Werewolf");
        keyboard =  new Scanner(System.in); // keyboard input stream
        answer = keyboard.findInLine(".").charAt(0); 
        if(answer == 'c' || answer == 'C'){
            actorPoints += 10;
            }
        else {
            System.out.println("Incorrect");
        }
        System.out.println("\n 7. What is the form of divination called when"
                             +"\n you are reading tea leaves?"
                         + "\n a. Crystal-gazing"
                         + "\n b. Dream interpretation"
                         + "\n c. Cartomancy"
                         + "\n d. Tessomancy");
        keyboard =  new Scanner(System.in); // keyboard input stream
        answer = keyboard.findInLine(".").charAt(0); 
        if(answer == 'd' || answer == 'D'){
            actorPoints += 10;
            }
        else {
            System.out.println("Incorrect");
        }
        System.out.println("\n 8. What plant has the magical ability to "
                                     +"\nconstrict or strangle?"
                         + "\n a. Devil's Snare"
                         + "\n b. Mandrake"
                         + "\n c. Puffapods"
                         + "\n d. Dittany");
        keyboard =  new Scanner(System.in); // keyboard input stream
        answer = keyboard.findInLine(".").charAt(0); 
        if(answer == 'a' || answer == 'A'){
            actorPoints += 10;
            }
        else {
            System.out.println("Incorrect");
        }
        System.out.println("\n 9. What animal is a winged horse with a skeletal"
                              +"\nbody, face with reptiliam features, and wide,"
                              +"\nleathery wings that resemble a bat's?"
                         + "\n a. Hippogriff"
                         + "\n b. Thestral"
                         + "\n c. Chinese fire-ball"
                         + "\n d. Basilisk");
        keyboard =  new Scanner(System.in); // keyboard input stream
        answer = keyboard.findInLine(".").charAt(0); 
        if(answer == 'b' || answer == 'B'){
            actorPoints += 10;
            }
        else {
            System.out.println("Incorrect");
        }
        System.out.println("\n 10. What is the player called in Quidditch that"
                               +"\nthat defends the three posts?"
                         + "\n a. Seeker"
                         + "\n b. Chaser"
                         + "\n c. Keeper"
                         + "\n d. Beater");
        keyboard =  new Scanner(System.in); // keyboard input stream
        answer = keyboard.findInLine(".").charAt(0); 
        if(answer == 'c' || answer == 'C'){
            actorPoints += 10;
            }
        else {
            System.out.println("Incorrect");
        }
        System.out.println("Your score is" + " " + actorPoints);
        }*/
    }
    
