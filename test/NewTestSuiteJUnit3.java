/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author dev
 */
public class NewTestSuiteJUnit3 extends TestCase {
    
    public NewTestSuiteJUnit3(String testName) {
        super(testName);
    }
    
    public static Test suite() {
        TestSuite suite = new TestSuite("NewTestSuiteJUnit3");
        suite.addTest(new TestSuite(apptobetested.MyObjectTestJUnit3.class));
        return suite;
    }
    
}
