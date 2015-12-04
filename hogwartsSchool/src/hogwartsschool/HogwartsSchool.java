/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hogwartsschool;

import byui.cit260.hogwartsSchool.model.GeneralScenes;
import byui.cit260.hogwartsschool.model.Actor;
import byui.cit260.hogwartsschool.model.ClassroomScene;
import byui.cit260.hogwartsschool.model.Game;
import byui.cit260.hogwartsschool.model.Location;
import byui.cit260.hogwartsschool.model.Map;
import byui.cit260.hogwartsschool.model.Notes;
import byui.cit260.hogwartsschool.model.Player;
import byui.cit260.hogwartsschool.model.Question;
import byui.cit260.hogwartsschool.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author chad
 */
public class HogwartsSchool {

   private static Game currentGame = null;
   private static Player player = null;
   
   private static PrintWriter outFile = null;
   private static BufferedReader inFile = null;
   
   private static PrintWriter logFile = null;

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        HogwartsSchool.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        HogwartsSchool.player = player;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        HogwartsSchool.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        HogwartsSchool.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        HogwartsSchool.logFile = logFile;
    }
    
    public static void main(String[] args) {
       // Create StartProgramView and start the program
        StartProgramView startProgramView = null;
        try{
            
            // open character stream files for end user inptu and output
            HogwartsSchool.inFile = 
                       new BufferedReader(new InputStreamReader(System.in));
            HogwartsSchool.outFile = new PrintWriter(System.out, true);
            
            startProgramView = new StartProgramView();
            
            // open log file
            String filePath = "log.txt";
            HogwartsSchool.logFile = new PrintWriter(filePath);
            
        startProgramView.startProgram(); 
        
        }catch(Throwable te){
            System.out.println(te.getMessage());
            te.printStackTrace();
            startProgramView.startProgram();
        }
        finally {
            try {
                if (HogwartsSchool.inFile !=null)
                HogwartsSchool.inFile.close();
                
                if (HogwartsSchool.outFile !=null)
                HogwartsSchool.outFile.close();
                
                if(HogwartsSchool.logFile != null)
                HogwartsSchool.logFile.close();
            } catch (IOException ex) {
                System.out.println("Error closing files");
                return;
            }
        }
    }
}
