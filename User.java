/**
 * Created by user on 8/6/2015.
 */
public class User {
    public int id;
    public String username;
    public String password;

    public User(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
