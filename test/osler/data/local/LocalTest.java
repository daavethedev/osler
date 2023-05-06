/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osler.data.local;

import java.util.ArrayList;
import java.util.List;
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
public class LocalTest {

    private User lastUser;
    private List<User> userList;

    public LocalTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        lastUser = new User();
        lastUser.setUuid("5d39e2e5-a558-4628-ad93-866521b22ff6");
        lastUser.setDeviceId(47057);
        lastUser.setUserStatus(0xc0);
        
        userList = new ArrayList<>();
        userList.add(lastUser);
        userList.add(lastUser);
        userList.add(lastUser);
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of fetchUsers method, of class Local.
     */
    @Test
    public void testFetchUsers() {
        System.out.println("fetchUsers");
        Local instance = new Local();
        ArrayList<User> result = instance.fetchUsers();
        assertEquals(lastUser.getUuid(), result.get(result.size() - 1).getUuid());
    }

    /**
     * Test of sendUsers method, of class Local.
     */
    @Test
    public void testSendUsers() {
        System.out.println("sendUsers");
        ArrayList<User> userList = (ArrayList<User>) this.userList;
        Local instance = new Local();
        boolean expResult = true;
        boolean result = instance.sendUsers(userList);
        assertEquals(expResult, result);
    }
}
