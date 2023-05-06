/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osler.data.local;

import java.util.ArrayList;
import osler.data.DataContract;
import osler.factory.UserFactoryImpl;
import osler.model.User;
import osler.util.Utils;
import osler.writer.UserWriterImpl;

/**
 *
 * @author Wolverine 3 Local class fetches data from the local source i.e.
 * DeviceUserList.txt.
 */
public class Local extends DataContract {

    private UserFactoryImpl userFactory;
    private UserWriterImpl userWriter;

    // TODO :- Add note about dependency injection
    public Local() {
        userFactory = new UserFactoryImpl();
        userWriter = new UserWriterImpl();
    }

    @Override
    public ArrayList<User> fetchUsers() {
        return userFactory.buildUsers(Utils.readFile("DeviceUserList.txt"));
    }

    @Override
    public boolean sendUsers(ArrayList<User> userList) {
        return userWriter.outputUsers(userList);
    }
}
