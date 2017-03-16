package pl.sdaacademy.service;

import pl.sdaacademy.model.User;

/**
 * Created by k.czechowski83@gmail.com on 2017-03-13.
 */
public class UserService {
    public boolean authenticate(User user) {
    DataService dataService = new DataService();
     User userFromFile = dataService.loadUserFromData();

        return user.equals(userFromFile);
    }
}
