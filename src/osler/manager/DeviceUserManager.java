/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osler.manager;

import java.util.ArrayList;
import java.util.List;
import osler.model.User;
import osler.processor.UserStatusProcessor;

/**
 *
 * @author Wolverine 3
 * DeviceManager performs the final merge/updation of the local user data.
 * The data is then passed back to be written to a file.
 * 
 * The primary constructor takes two lists of model User, local and from the repo. 
 * 
 */
public class DeviceUserManager {

    private final List<User> localUsers;
    private final List<User> portalUsers;

    public DeviceUserManager(List<User> localUsers, List<User> portalUsers) {
        this.localUsers = localUsers;
        this.portalUsers = portalUsers;
    }

    public ArrayList<User> updateUsers() {
        ArrayList<User> updatedDeviceList = new ArrayList<>();
        updatedDeviceList.addAll(localUsers);
        for (int i = 0; i < updatedDeviceList.size(); i++) {
            for (int j = 0; j < portalUsers.size(); j++) {
                if (updatedDeviceList.get(i).getUuid().equals(portalUsers.get(j).getUuid()) && updatedDeviceList.get(i).getDeviceId() == portalUsers.get(j).getDeviceId()) {
                    updatedDeviceList.set(i, portalUsers.get(j));
                }
            }
        }
        UserStatusProcessor processor = new UserStatusProcessor(updatedDeviceList);
        processor.processUsers();
        return updatedDeviceList;
    }
}
