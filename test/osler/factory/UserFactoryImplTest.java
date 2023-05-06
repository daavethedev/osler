/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osler.factory;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
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
public class UserFactoryImplTest {

    private User user;
    private List<String> lines;

    private List<User> expectedUserList;

    public UserFactoryImplTest() {
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
        user = new User();
        user.setUuid("75ad842c-b974-4031-92c8-37461bbc36aa");
        user.setDeviceId(47052);
        user.setUserStatus(0x20);
        user.setUserStatusBinaryString("00100000");

        lines = new ArrayList<>();
        lines.add("75ad842c-b974-4031-92c8-37461bbc36aa	47052	0x20");
        lines.add("75ad842c-b974-4031-92c8-37461bbc36aa	47052	0x20");
        lines.add("75ad842c-b974-4031-92c8-37461bbc36aa	47052	0x20");

        expectedUserList = new ArrayList<>();
        expectedUserList.add(user);
        expectedUserList.add(user);
        expectedUserList.add(user);
    }

    @After
    public void tearDown() {
        System.out.println("tearDown");
    }

    /**
     * Test of buildUser method, of class UserFactoryImpl.
     */
    @Test
    public void testBuildUser() {
        System.out.println("buildUser");
        String line = "75ad842c-b974-4031-92c8-37461bbc36aa	47052	0x20";
        UserFactoryImpl instance = new UserFactoryImpl();
        User expResult = user;
        User result = instance.buildUser(line);
        assertEquals(expResult.getUuid(), result.getUuid());
    }

    /**
     * Test of buildUsers method, of class UserFactoryImpl.
     */
    @Test
    public void testBuildUsers() {
        System.out.println("buildUsers");
        List<String> stream = lines;
        UserFactoryImpl instance = new UserFactoryImpl();
        ArrayList<User> expResult = (ArrayList<User>) expectedUserList;
        ArrayList<User> result = instance.buildUsers(stream);
        assertEquals(expResult.size(), 3);
    }
}
