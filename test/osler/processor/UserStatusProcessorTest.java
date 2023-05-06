/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osler.processor;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import osler.model.AuthorisationStatus;
import osler.model.TrainingStatus;
import osler.model.User;

/**
 *
 * @author Wolverine 3
 */
public class UserStatusProcessorTest {

    private User testUser;
    private User expectedResult;
    private List<User> userList;

    public UserStatusProcessorTest() {
        this.userList = new ArrayList<>();
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        expectedResult = new User();
        expectedResult.setUuid("4a937b23-2335-4aa7-ad56-8179eab929bb");
        expectedResult.setDeviceId(47057);
        expectedResult.setUserStatusBinaryString("00100000");
        expectedResult.setAuthorisationStatus(AuthorisationStatus.DisabledOperator);
        expectedResult.setTrainingStatus(TrainingStatus.Untrained);

        testUser = new User();
        testUser.setUuid("4a937b23-2335-4aa7-ad56-8179eab929bb");
        testUser.setDeviceId(47057);
        testUser.setUserStatusBinaryString("00100000");

        userList.add(expectedResult);
        userList.add(expectedResult);
        userList.add(expectedResult);
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of decodeUserAuthorizationStatus method, of class
     * UserStatusProcessor.
     */
    @Test
    public void testDecodeUserAuthorizationStatus() {
        System.out.println("decodeUserAuthorizationStatus");
        User user = testUser;
        UserStatusProcessor instance = new UserStatusProcessor(userList);
        User expResult = expectedResult;
        User result = instance.decodeUserAuthorizationStatus(user);
        assertEquals(expResult.getAuthorisationStatus(), result.getAuthorisationStatus());
    }

    /**
     * Test of decodeUserTrainingStatus method, of class UserStatusProcessor.
     */
    @Test
    public void testDecodeUserTrainingStatus() {
        System.out.println("decodeUserTrainingStatus");
        User user = testUser;
        UserStatusProcessor instance = new UserStatusProcessor(userList);
        User expResult = expectedResult;
        User result = instance.decodeUserTrainingStatus(user);
        System.out.println("Here I am : " + result.toString());
        assertEquals(expResult.getTrainingStatus(), result.getTrainingStatus());
    }
}
