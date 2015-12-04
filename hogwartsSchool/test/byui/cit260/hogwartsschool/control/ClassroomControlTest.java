/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsschool.control;

import hogwartsschool.HogwartsSchool;
import java.io.BufferedReader;
import java.io.PrintWriter;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author chad
 */
public class ClassroomControlTest {
    protected final BufferedReader keyboard = HogwartsSchool.getInFile();
    protected final PrintWriter console = HogwartsSchool.getOutFile();
    
    public ClassroomControlTest() {
    }

    /**
     * Test of calculateCauldronsSize method, of class ClassroomControl.
     */
    @Test
    public void testCalculateCauldronsSize() {
        this.console.println("calculateCauldronsSize");
        // test case 1
        this.console.println("\tTest case #1");
        double diameter = 14.0;
        double depth = 12.0;
        ClassroomControl instance = new ClassroomControl();
        double expResult = 7.99;
        double result = instance.calculateCauldronsSize(diameter, depth);
        assertEquals(expResult, result, 0.01);
       
        
        // test case 2
        this.console.println("\tTest case #2");
        diameter = -1.0;
        depth = 14.0;
        expResult = -1;
        result = instance.calculateCauldronsSize(diameter, depth);
        assertEquals(expResult, result, 0.01);
        
        
         // test case 3
        this.console.println("\tTest case #3");
        diameter = 16.0;
        depth = -1.0;
        expResult = -1;
        result = instance.calculateCauldronsSize(diameter, depth);
        assertEquals(expResult, result, 0.01);
       
        
         // test case 4
        this.console.println("\tTest case #4");
        diameter = 16.0;
        depth = 15.0;
        expResult = -1;
        result = instance.calculateCauldronsSize(diameter, depth);
        assertEquals(expResult, result, 0.01);
        
        
         // test case 5
        this.console.println("\tTest case #5");
        diameter = 17.0;
        depth = 14.0;
        expResult = -1;
        result = instance.calculateCauldronsSize(diameter, depth);
        assertEquals(expResult, result, 0.01);
        
        
         // test case 6
        this.console.println("\tTest case #6");
        diameter = 0.0;
        depth = 14.0;
        expResult = 0;
        result = instance.calculateCauldronsSize(diameter, depth);
        assertEquals(expResult, result, 0.01);
        
        
         // test case 7
        this.console.println("\tTest case #7");
        diameter = 16.0;
        depth = 0.0;
        expResult = 0;
        result = instance.calculateCauldronsSize(diameter, depth);
        assertEquals(expResult, result, 0.01);
        
        
         // test case 8
        this.console.println("\tTest case #8");
        diameter = 16.0;
        depth = 14.0;
        expResult = 12.18;
        result = instance.calculateCauldronsSize(diameter, depth);
        assertEquals(expResult, result, 0.01);
        
    }

    /**
     * Test of calculateStarsMagnitude method, of class ClassroomControl.
     */
    @Test
    public void testCalculateStarsMagnitude() {
        this.console.println("calculateStarsMagnitude");
        //test case 1
        this.console.println("\tTest case # 1");
        double magnitude = 60.0;
        double distance = 32.0;
        ClassroomControl instance = new ClassroomControl();
        double expResult = 3.52;
        double result = instance.calculateStarsMagnitude(magnitude, distance);
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        //test case 2
        this.console.println("\tTest case # 2");
        magnitude = -1.0;
        distance = 40.0;
        expResult = -1;
        result = instance.calculateStarsMagnitude(magnitude, distance);
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
         //test case 3
        this.console.println("\tTest case # 3");
        magnitude = 100.0;
        distance = -1.0;
        expResult = -1;
        result = instance.calculateStarsMagnitude(magnitude, distance);
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
         //test case 4
        this.console.println("\tTest case # 4");
        magnitude = 50.0;
        distance = 15.0;
        expResult = -1;
        result = instance.calculateStarsMagnitude(magnitude, distance);
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
         //test case 5
        this.console.println("\tTest case # 5");
        magnitude = 0.0;
        distance = 40.0;
        expResult = 0;
        result = instance.calculateStarsMagnitude(magnitude, distance);
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
         //test case 6
        this.console.println("\tTest case # 6");
        magnitude = 100.0;
        distance = 20.0;
        expResult = 25;
        result = instance.calculateStarsMagnitude(magnitude, distance);
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
         //test case 7
        this.console.println("\tTest case # 7");
        magnitude = 100;
        distance = 40.0;
        expResult = 6.25;
        result = instance.calculateStarsMagnitude(magnitude, distance);
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
/**
     * Test of calculateAverageAcceleration method, of class ClassroomControl.
     */
    @Test
    public void testAverageAcceleration() {
        this.console.println("calculateAverageAcceleration");
        //test case 1
        this.console.println("\tTest case # 1");
        double time = 34.0;
        double distance = 4.0;
        ClassroomControl instance = new ClassroomControl();
        double expResult = 4.0;
        double result = instance.calculateAverageAcceleration(time, distance);
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
         //test case 2
        this.console.println("\tTest case # 2");
        time = 1.0;
        distance = -15.0;
        expResult = -1;
        result = instance.calculateAverageAcceleration(time, distance);
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
         //test case 3
        this.console.println("\tTest case # 3");
        time = 0.0;
        distance = 4.0;
        expResult =-1;
        result = instance.calculateAverageAcceleration(time, distance);
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
         //test case 4
        this.console.println("\tTest case # 4");
        time = 50.0;
        distance = 4.0;
        expResult = -1;
        result = instance.calculateAverageAcceleration(time, distance);
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
         //test case 5
        this.console.println("\tTest case # 5");
        time =  1.0;
        distance = 1.0;
        expResult = 1.0;
        result = instance.calculateAverageAcceleration(time, distance);
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

        
   
    
}
