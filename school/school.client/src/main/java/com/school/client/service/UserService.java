package main.java.com.school.client.service;

import main.java.com.school.client.domain.database.UserDO;

/**
 * Created by Administrator on 2015/10/25.
 */
public interface UserService {
    int insertUser(UserDO userDO);

    boolean updateUser(int userId, UserDO userDO);

    UserDO getUser(int userId);

}
