

package chatserver.entity;

/**
 *
 * @author Prajwal
 */
public class User {
private int id;
private String username, password;
private  boolean status;

    public User() {
    }

    public User(int id, String username, String password,  boolean status) {
        this.id = id;
        this.username = username;
        this.password = password;
        
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}