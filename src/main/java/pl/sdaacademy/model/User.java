package pl.sdaacademy.model;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Created by k.czechowski83@gmail.com on 2017-03-13.
 */
@XmlRootElement(name = "User")
@XmlType(propOrder = {"login", "password"})
public class User {
    private String login;
    private String password;

    //Constructor
    public User() {
    }

    public User(String login, String password) {
        super();
        this.login = login;
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;

        if (!getLogin().equals(user.getLogin())) return false;
        return getPassword().equals(user.getPassword());
    }

    @Override
    public int hashCode() {
        int result = getLogin().hashCode();
        result = 31 * result + getPassword().hashCode();
        return result;
    }

    //Getters&Setters
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
