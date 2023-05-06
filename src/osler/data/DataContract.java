/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osler.data;

import java.util.ArrayList;
import osler.model.User;

/**
 *
 * @author Wolverine 3
 * A blueprint for the Data Classes, created so a data class accessing data 
 * from a source follows centralized design 
 */
public abstract class DataContract {

    public abstract ArrayList<User> fetchUsers();

    public abstract boolean sendUsers(ArrayList<User> userList);
}
