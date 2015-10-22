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
    @Test
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
    
}
