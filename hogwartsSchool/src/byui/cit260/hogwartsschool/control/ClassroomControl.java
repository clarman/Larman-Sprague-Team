/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsschool.control;

/**
 *
 * @author chad
 */
public class ClassroomControl {
    public double calculateCauldronsSize(double diameter, double depth) {
        if(diameter < 0 || diameter > 16) {
            return -1;
        }
        if(depth < 0 || depth > 14){
            return -1;
        }
        double p1 = (diameter / 2);
        double p2 = Math.pow(p1, 2) * 3.14 * depth;
        double answer = p2 / 231;
        return answer;
    }
    public double calculateStarsMagnitude(double magnitude, double distance){
        if(magnitude < 0 || magnitude > 100){
            return -1;
        }
        if(distance < 20 || distance > 40){
            return -1;
        }
        double apparMag = (magnitude/distance) * (magnitude/distance);
        return apparMag;
    }
    public double calculateAverageAcceleration(double time, double distance) {
        if(time < 1 || time > 40) {
            return -1;
        }
        if (distance < 1) {
            return -1;
        }
        double avgAccel = (distance/time) * time;
        return avgAccel;
    }
}
