/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package apptobetested;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dev
 */
public class MyObjectJUTIN4Test {
     MyObject t = new MyObject();
    
    public MyObjectJUTIN4Test() {
   
    
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println(" setUpClass ");
    }
    
    @AfterClass
    public static void tearDownClass() {
         System.out.println(" tearDownClass ");
    }

    /**
     * Test of SetName method, of class MyObject.
     */
    @Test
    public void testSetName() {
            System.out.println(" test Set Name ");
        String result, expectedr; 
        
        expectedr = "Вещь12";
        
        
        t.SetName(expectedr);
        
          result = t.GetName(); 
         assertEquals(expectedr,result); 
    }

    /**
     * Test of GetName method, of class MyObject.
     */
    @Test
    public void testGetName() {
    }

    /**
     * Test of main method, of class MyObject.
     */
    @Test
    public void testMain() {
    }
    
}
