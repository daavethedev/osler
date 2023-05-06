/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osler.writer;

import java.util.ArrayList;
import osler.model.User;

/**
 *
 * @author Wolverine 3
 */
public interface UserWriter {

    boolean outputUsers(ArrayList<User> usersList);
}
