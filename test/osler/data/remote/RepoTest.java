/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osler.data.remote;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import osler.data.local.Local;
import osler.model.User;

/**
 *
 * @author Wolverine 3
 */
public class RepoTest {

    private User lastUser;
    private List<User> userList;

    public RepoTest() {
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
        lastUser = new User();
        lastUser.setUuid("1d29eae6-99e9-458e-a421-8575f3e6fbf3");
        lastUser.setDeviceId(47056);
        lastUser.setUserStatus(0x40);

        userList = new ArrayList<>();
        userList.add(lastUser);
        userList.add(lastUser);
        userList.add(lastUser);
    }

    @After
    public void tearDown() {
        System.out.println("tearDown");
    }

    /**
     * Test of fetchUsers method, of class Repo.
     */
    @Test
    public void testFetchUsers() {
        System.out.println("fetchUsers");
        Repo instance = new Repo();
        ArrayList<User> result = instance.fetchUsers();
        assertEquals(lastUser.getUuid(), result.get(result.size() - 1).getUuid());
    }

    /**
     * Test of sendUsers method, of class Repo.
     */
    @Test
    public void testSendUsers() {
        System.out.println("sendUsers");
        ArrayList<User> userList = (ArrayList<User>) this.userList;
        Repo instance = new Repo();
        boolean expResult = true;
        boolean result = instance.sendUsers(userList);
        assertEquals(expResult, result);
        
        // Test will fail because we don't have implementation for POSTing users to remote repo.
    }
}
