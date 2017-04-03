/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatserver.dao.impl;

import chatserver.dao.UserDAO;
import chatserver.entity.User;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Prajwal
 */
public class UserDaoImp implements UserDAO {


    
    public User login(String username, String password) {
        for(User u:getAll()){
            if(u.getUsername().equalsIgnoreCase(username)&& u.getPassword().equals(password)){
                return u;
            }
        
        }
        return null;
    }

    public List<User> getAll() {
List<User> users = new ArrayList<>();
     
users.add(new User(1, "Prajwal", "prajwal123",  true));
    users.add(new User(1, "Prajwal", "prajwal123",  true));
    users.add(new User(2, "Sulabh", "sulabh123",  true));
    users.add(new User(3, "Ashutosh", "ashutosh123",  true));
    users.add(new User(4, "Sajan", "sajan123",  true));
    users.add(new User(5, "Aditya", "aditya123",  true));
    users.add(new User(6, "Sumit", "sumit123",  true));
    users.add(new User(7, "Prayash", "prayash123",  true));
    users.add(new User(8, "Milan", "milan123",  true));
    users.add(new User(9, "Saujan", "saujan123",  true));
   users.add(new User(10, "Pooja", "pooja123",  true));
    users.add(new User(11, "Sagar", "sagar123",  true));
    users.add(new User(12, "Relise", "relise123",  true));
//    users.add(new User(13, "Prajwal", "prajwal123",  true));
//    users.add(new User(14, "Prajwal", "prajwal123",  true));
//    users.add(new User(15, "Prajwal", "prajwal123",  true));
//    
    
return users;
}
}