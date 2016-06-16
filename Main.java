import java.util.ArrayList;
import java.util.Comparator;

/**
 * Created by user on 8/6/2015.
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<User> names= new ArrayList<>();
        User user1 = new User(1);
        User user2 = new User(2);
        User user3 = new User(3);
        User user4 = new User(4);
        User user5 = new User(5);
        User user6 = new User(6);
        names.add(user5);
        names.add(user2);
        names.add(user6);
        names.add(user1);
        names.add(user4);
        names.add(user3);
        names.add(user6);
        for (int i = 0; i <names.size() ; i++) {
            System.out.println("num : " + names.get(i).id);
        }


        System.out.println("------------------------sort-----------------------");

        names.sort(new Comparator<User>() {
            @Override
            public int compare(User user1, User user2) {
                if (user1.id > user2.id) {
                    return 1;
                } else if (user1.id < user2.id) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        for (int i = 0; i <names.size() ; i++) {
            System.out.println("num : " + names.get(i).id);
        }
    }
}
