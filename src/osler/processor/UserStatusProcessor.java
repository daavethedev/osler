/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osler.processor;

import java.util.ArrayList;
import java.util.List;
import osler.model.AuthorisationStatus;
import osler.model.TrainingStatus;
import osler.model.User;

/**
 *
 * @author Wolverine 3
 */
public class UserStatusProcessor {

    private List<User> users;

    public UserStatusProcessor(List<User> users) {
        this.users = users;
    }

    public User decodeUserAuthorizationStatus(User user) {
        if (user.getUserStatusBinaryString().charAt(2) == '0') {
            if (user.getUserStatusBinaryString().charAt(0) == '0') {
                user.setAuthorisationStatus(AuthorisationStatus.DisabledAdmin);
            } else {
                user.setAuthorisationStatus(AuthorisationStatus.AuthorisedAdmin);
            }
        } else {
            if (user.getUserStatusBinaryString().charAt(0) == '0') {
                user.setAuthorisationStatus(AuthorisationStatus.DisabledOperator);
            } else {
                user.setAuthorisationStatus(AuthorisationStatus.AuthorisedOperator);
            }
        }
        return user;
    }

    public User decodeUserTrainingStatus(User user) {
        if (user.getUserStatusBinaryString().charAt(1) == '0') {
            user.setTrainingStatus(TrainingStatus.Untrained);
        } else {
            user.setTrainingStatus(TrainingStatus.Trained);
        }
        return user;
    }

    public void processUsers() {
        for (int i = 0; i < users.size(); i++) {
            users.set(i, decodeUserAuthorizationStatus(users.get(i)));
            users.set(i, decodeUserTrainingStatus(users.get(i)));
        }
    }
}
