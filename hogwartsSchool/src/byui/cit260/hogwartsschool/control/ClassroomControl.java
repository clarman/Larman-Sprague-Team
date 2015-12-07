/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsschool.control;

import byui.cit260.hogwartsschool.exception.ClassroomControlException;

/**
 *
 * @author chad
 */
public class ClassroomControl {
    public double calculateCauldronsSize(double diameter, double depth) 
                        throws ClassroomControlException{
        if(diameter < 0 || diameter > 16) {
           throw new ClassroomControlException("Diameter must be between 0 "
                   + "and 16.");
        }
        if(depth < 0 || depth > 14){
            throw new ClassroomControlException("Depth must be between 0 and"
                    + "14.");
        }
        double p1 = (diameter / 2);
        double p2 = Math.pow(p1, 2) * 3.14 * depth;
        double answer = p2 / 231;
        return answer;
    }
    public double calculateStarsMagnitude(double magnitude, double distance)
                        throws ClassroomControlException{
        if(magnitude < 0 || magnitude > 100){
            throw new ClassroomControlException("Magnitutde must be between "
                    + "0 and 100.");
        }
        if(distance < 20 || distance > 40){
            throw new ClassroomControlException("Distance must be between 20"
                    + "and 40.");
        }
        double apparMag = (magnitude/distance) * (magnitude/distance);
        return apparMag;
    }
    public double calculateAverageAcceleration(double time, double distance) 
                        throws ClassroomControlException{
        if(time < 1 || time > 40) {
            throw new ClassroomControlException("Time must be between 1 and"
                    + "40.");
        }
        if (distance < 1) {
             throw new ClassroomControlException("Distance must be above 1.");
        }
        double avgAccel = (distance/time) * time;
        return avgAccel;
    }
}
