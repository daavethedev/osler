/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osler.main;

import java.util.ArrayList;
import java.util.List;
import osler.data.local.Local;
import osler.data.remote.Repo;
import osler.manager.DeviceUserManager;
import osler.model.User;
import osler.processor.UserStatusProcessor;

/**
 *
 * @author Wolverine 3
 */
public class Osler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Repo repo = new Repo();
        Local local = new Local();

        List<User> portalUsers = repo.fetchUsers();
        List<User> localUsers = local.fetchUsers();

        DeviceUserManager dum = new DeviceUserManager(localUsers, portalUsers);

        local.sendUsers(dum.updateUsers());
    }
}
