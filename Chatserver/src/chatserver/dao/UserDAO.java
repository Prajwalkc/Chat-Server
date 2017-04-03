/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatserver.dao;

import chatserver.entity.User;
import java.util.List;

/**
 *
 * @author Prajwal
 */
public interface UserDAO {

    /**
     *
     * @param username
     * @param password
     * @return
     */
    User login(String username, String password);
    List<User> getAll();
}
