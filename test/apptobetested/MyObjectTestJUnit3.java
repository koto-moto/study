/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package apptobetested;

import junit.framework.TestCase;

/**
 *
 * @author dev
 */
public class MyObjectTestJUnit3 extends TestCase {
 
    
    
    public MyObjectTestJUnit3(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        System.out.println("setUp");
        
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
        System.out.println("tearDown");
    }

    /**
     * Test of SetName method, of class MyObject.
     */
    public void testim1() {
        System.out.println("SetName");
        String name = "11";
        String expResult = "11";
        
        MyObject instance = new MyObject();
        instance.SetName(name);
        
        String result = instance.GetName();
        assertEquals(expResult, result); 
    }

    /**
     * Test of GetName method, of class MyObject.
     */
    public void testim2() {
       System.out.println("SetName");
        String name = "22";
        String expResult = "22";
        
        MyObject instance = new MyObject();
        instance.SetName(name);
        
        String result = instance.GetName();
        assertEquals(expResult, result);
    }

    /**
     * Test of main method, of class MyObject.
     */
  
    
}
