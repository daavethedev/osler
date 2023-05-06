/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osler.writer;

import java.util.ArrayList;
import java.util.List;
import osler.model.User;
import osler.util.Utils;

/**
 *
 * @author Wolverine 3
 */
public class UserWriterImpl implements UserWriter {

    @Override
    public boolean outputUsers(ArrayList<User> usersList) {
        List<String> lines = new ArrayList<>();
        for (User user : usersList) {
            StringBuilder sb = new StringBuilder();
            sb.append(user.getUuid()
                    + "\t"
                    + user.getDeviceId()
                    + "\t"
                    + user.getAuthorisationStatus()
                    + "\t"
                    + user.getTrainingStatus());
            lines.add(sb.toString());
        }
        return Utils.writeFile(lines, "DeviceUserListUpdated.txt");
    }
}
