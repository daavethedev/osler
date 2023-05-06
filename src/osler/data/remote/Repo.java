/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osler.data.remote;

import java.util.ArrayList;
import osler.data.DataContract;
import osler.factory.UserFactoryImpl;
import osler.model.User;
import osler.util.Utils;

/**
 *
 * @author Wolverine 3 Repo class fetches data from the remote source i.e.
 * PortalUserList.txt.
 */
public class Repo extends DataContract {

    private UserFactoryImpl userFactory;

    public Repo() {
        userFactory = new UserFactoryImpl();
    }

    @Override
    public ArrayList<User> fetchUsers() {
        return userFactory.buildUsers(Utils.readFile("PortalUserList.txt"));
    }

    /**
     * The method is added as a stub since no data is being sent to the remote
     * repo, but to follow a centralized design the method is overriden.
     *
     */
    @Override
    public boolean sendUsers(ArrayList<User> userList) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
