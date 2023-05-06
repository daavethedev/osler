/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osler.factory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import osler.model.User;
import osler.util.Utils;

/**
 *
 * @author Wolverine 3
 * 
 * Factory builds User model from text strings, returns User object.
 * 
 * Can also build User model ArrayList
 */
public class UserFactoryImpl implements UserFactory {

    @Override
    public User buildUser(String line) {
        Scanner s = new Scanner(line).useDelimiter("\\t");
        User u = new User();
        u.setUuid(s.next());
        u.setDeviceId(Long.valueOf(s.next()));
        String str = s.next();
        u.setUserStatusBinaryString(Utils.hexToBin(str));
        u.setUserStatus(Integer.decode(str));
        System.out.println("User : " + u.toString());
        return u;
    }

    @Override
    public ArrayList<User> buildUsers(List<String> stream) {
        ArrayList<User> userList = new ArrayList<>();
        stream.forEach((line) -> {
            userList.add(buildUser(line));
        });
        return userList;
    }
}
