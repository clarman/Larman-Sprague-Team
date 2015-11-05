/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsschool.control;

import java.util.Scanner;

/**
 *
 * @author chad
 */
public class QuestionsControl {

    public static void takeExam() {
        double actorPoints = 0;
        char answer;
        System.out.println("\n 1. What Potion makes you successful in all your"
                              + "\nendeavors?"
                         + "\n A. Essence of Dittany"
                         + "\n B. Felix Felicis"
                         + "\n C. Plyjuice Potion"
                         + "\n D. Draught of Living Death");
        Scanner keyboard = new Scanner(System.in); // keyboard input stream
        answer = keyboard.findInLine(".").charAt(0); 
        if(answer == 'b' || answer == 'B'){
            actorPoints += 10;
            }
        }
    }
    
