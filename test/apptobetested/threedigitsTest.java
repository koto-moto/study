/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package apptobetested;

import static apptobetested.threedigits.checkdigs;
import java.io.IOException;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author dev
 */
public class threedigitsTest {
    
    public threedigitsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of checkdigs method, of class threedigits.
     */
    @Test
    public void testCheckdigs() throws IOException {
             String params[] ={"1 "};
       assertFalse(checkdigs(1,2,3));
       assertTrue (checkdigs(0,0,0));
       assertFalse(checkdigs(1,0,0));
       assertFalse(checkdigs(0,1,0));
       assertFalse(checkdigs(0,0,1));
       
      // threedigits.main(params);
    }

    /**
     * Test of main method, of class threedigits.
     */
    //@Test
    public void testMain() throws Exception {
    }
    
}
