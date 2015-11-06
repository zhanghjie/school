package main.java.com.school.client.domain.database;

/**
 * Created by Administrator on 2015/10/25.
 */
public class UserDO {
    private int userId;
    private  String userName;
    private String passward;

    public String getPassward() {
        return passward;
    }

    public void setPassward(String passward) {
        this.passward = passward;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
