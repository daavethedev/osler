/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osler.factory;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import osler.model.User;

/**
 *
 * @author Wolverine 3 Define all method a UserFactory implementation must
 * override. Class defined to make the app to follow a specified design.
 */
public interface UserFactory {

    User buildUser(String userString);

    ArrayList<User> buildUsers(List<String> stream);
}
