/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsschool.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author chad
 */
public class ClassroomControlTest {
    
    public ClassroomControlTest() {
    }

    /**
     * Test of calculateCauldronsSize method, of class ClassroomControl.
     */
    public void testCalculateCauldronsSize() {
        System.out.println("calculateCauldronsSize");
        // test case 1
        System.out.println("\tTest case #1");
        double diameter = 14.0;
        double depth = 12.0;
        ClassroomControl instance = new ClassroomControl();
        double expResult = 7.99;
        double result = instance.calculateCauldronsSize(diameter, depth);
        assertEquals(expResult, result, 0.01);
       
        
        // test case 2
        System.out.println("\tTest case #2");
        diameter = -1.0;
        depth = 14.0;
        expResult = -1;
        result = instance.calculateCauldronsSize(diameter, depth);
        assertEquals(expResult, result, 0.01);
        
        
         // test case 3
        System.out.println("\tTest case #3");
        diameter = 16.0;
        depth = -1.0;
        expResult = -1;
        result = instance.calculateCauldronsSize(diameter, depth);
        assertEquals(expResult, result, 0.01);
       
        
         // test case 4
        System.out.println("\tTest case #4");
        diameter = 16.0;
        depth = 15.0;
        expResult = -1;
        result = instance.calculateCauldronsSize(diameter, depth);
        assertEquals(expResult, result, 0.01);
        
        
         // test case 5
        System.out.println("\tTest case #5");
        diameter = 17.0;
        depth = 14.0;
        expResult = -1;
        result = instance.calculateCauldronsSize(diameter, depth);
        assertEquals(expResult, result, 0.01);
        
        
         // test case 6
        System.out.println("\tTest case #6");
        diameter = 0.0;
        depth = 14.0;
        expResult = 0;
        result = instance.calculateCauldronsSize(diameter, depth);
        assertEquals(expResult, result, 0.01);
        
        
         // test case 7
        System.out.println("\tTest case #7");
        diameter = 16.0;
        depth = 0.0;
        expResult = 0;
        result = instance.calculateCauldronsSize(diameter, depth);
        assertEquals(expResult, result, 0.01);
        
        
         // test case 8
        System.out.println("\tTest case #8");
        diameter = 16.0;
        depth = 14.0;
        expResult = 12.18;
        result = instance.calculateCauldronsSize(diameter, depth);
        assertEquals(expResult, result, 0.01);
        
    }

    /**
     * Test of calculateStarsMagnitude method, of class ClassroomControl.
     */
    public void testCalculateStarsMagnitude() {
        System.out.println("calculateStarsMagnitude");
        //test case 1
        System.out.println("\tTest case # 1");
        double magnitude = 60.0;
        double distance = 32.0;
        ClassroomControl instance = new ClassroomControl();
        double expResult = 3.52;
        double result = instance.calculateStarsMagnitude(magnitude, distance);
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        //test case 2
        System.out.println("\tTest case # 2");
        magnitude = -1.0;
        distance = 40.0;
        expResult = -1;
        result = instance.calculateStarsMagnitude(magnitude, distance);
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
         //test case 3
        System.out.println("\tTest case # 3");
        magnitude = 100.0;
        distance = -1.0;
        expResult = -1;
        result = instance.calculateStarsMagnitude(magnitude, distance);
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
         //test case 4
        System.out.println("\tTest case # 4");
        magnitude = 50.0;
        distance = 15.0;
        expResult = -1;
        result = instance.calculateStarsMagnitude(magnitude, distance);
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
         //test case 5
        System.out.println("\tTest case # 5");
        magnitude = 0.0;
        distance = 40.0;
        expResult = 0;
        result = instance.calculateStarsMagnitude(magnitude, distance);
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
         //test case 6
        System.out.println("\tTest case # 6");
        magnitude = 100.0;
        distance = 20.0;
        expResult = 25;
        result = instance.calculateStarsMagnitude(magnitude, distance);
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
         //test case 7
        System.out.println("\tTest case # 7");
        magnitude = 100;
        distance = 40.0;
        expResult = 6.25;
        result = instance.calculateStarsMagnitude(magnitude, distance);
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
/**
     * Test of calculateStarsMagnitude method, of class ClassroomControl.
     */
    public void testAverageAcceleration() {
        System.out.println("calculateAverageAcceleration");
        //test case 1
        System.out.println("\tTest case # 1");
        double time = 34.0;
        double distance = 4.0;
        ClassroomControl instance = new ClassroomControl();
        double expResult = 4.0;
        double result = instance.calculateAverageAcceleration(time, distance);
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
         //test case 2
        System.out.println("\tTest case # 2");
        time = 1.0;
        distance = -15.0;
        expResult = -15;
        result = instance.calculateAverageAcceleration(time, distance);
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
         //test case 3
        System.out.println("\tTest case # 3");
        time = 0.0;
        distance = 4.0;
        expResult =0.0;
        result = instance.calculateAverageAcceleration(time, distance);
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
         //test case 4
        System.out.println("\tTest case # 4");
        time = 40.0;
        distance = 100.0;
        expResult = 100.0;
        result = instance.calculateAverageAcceleration(time, distance);
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
         //test case 5
        System.out.println("\tTest case # 5");
        time =  1.0;
        distance = 1.0;
        expResult = 1.0;
        result = instance.calculateAverageAcceleration(time, distance);
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

        
    private void assertEquals(double expResult, double result, double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
