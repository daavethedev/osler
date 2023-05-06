/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osler.model;

/**
 *
 * @author Wolverine 3
 */
public class User {

    private String uuid;
    private long deviceId;
    private int userStatus;
    private String userStatusBinaryString;
    private AuthorisationStatus authorisationStatus;
    private TrainingStatus trainingStatus;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public long getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(long deviceId) {
        this.deviceId = deviceId;
    }

    public int getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(int userStatus) {
        this.userStatus = userStatus;
    }

    public String getUserStatusBinaryString() {
        return userStatusBinaryString;
    }

    public void setUserStatusBinaryString(String userStatusBinaryString) {
        this.userStatusBinaryString = userStatusBinaryString;
    }

    public AuthorisationStatus getAuthorisationStatus() {
        return authorisationStatus;
    }

    public void setAuthorisationStatus(AuthorisationStatus authorisationStatus) {
        this.authorisationStatus = authorisationStatus;
    }

    public TrainingStatus getTrainingStatus() {
        return trainingStatus;
    }

    public void setTrainingStatus(TrainingStatus trainingStatus) {
        this.trainingStatus = trainingStatus;
    }

    @Override
    public String toString() {
        return "User{" + "uuid=" + uuid + ", deviceId=" + deviceId + ", userStatus=" + userStatus + ", userStatusBinaryString=" + userStatusBinaryString + ", authorisationStatus=" + authorisationStatus + ", trainingStatus=" + trainingStatus + '}';
    }

}
