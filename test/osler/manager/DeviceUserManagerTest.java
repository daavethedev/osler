/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osler.manager;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import osler.model.User;

/**
 *
 * @author Wolverine 3
 */
public class DeviceUserManagerTest {

    private DeviceUserManager instance;

    private ArrayList<User> localUsers;
    private ArrayList<User> portalUsers;
    
    public DeviceUserManagerTest() {
        this.localUsers = new ArrayList<>();
        this.portalUsers = new ArrayList<>();
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        System.out.println("setUp");
       localUsers.add(new User());
               
        
    }

    @After
    public void tearDown() {
        System.out.println("tearDown");
    }

    /**
     * Test of updateUsers method, of class DeviceUserManager.
     */
    @Test
    public void testUpdateUsers() {
        System.out.println("updateUsers");

        ArrayList<User> expResult = null;
        ArrayList<User> result = instance.updateUsers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
