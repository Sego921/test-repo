/**
 * Created by user on 8/6/2015.
 */
public class DynamicArray extends DynamicArrayInterface {
    private User[] users;
    private boolean isEmpty = true;
    private int index = 0;

    public DynamicArray() {
        users = new User[3];
    }

    @Override
    void add(User user) {
        if (index>=users.length-1){
            extendArray();
        }

        users[index] = user;
        index++;
        isEmpty = false;

    }

    @Override
    void add(User user, int x) {

        users[x] = user;
        isEmpty = false;
    }

    @Override
    void addAll(User[] newUsers) {
        for (int i = 1; i <newUsers.length +1; i++) {
            if (index>=users.length-1){
                extendArray();
            }
            users[index++]= newUsers[i-1];

        }
        isEmpty = false;
    }

    @Override
    void clear() {
        users = new User[10];
        isEmpty = true;
    }

    @Override
    boolean contains(User user) {
        for (int i = 0; i < index + 1; i++) {
            if (user.id == users[i].id) {
                return true;
            }
        }
        return false;
    }

    @Override
    User get(int index) {
        return users[index];//TODO add exception
    }

    @Override
    int indexOf(User user) {
        for (int i = 0; i < index + 1; i++) {
            if (user.id == users[i].id) {
                return i;
            }
        }
        return -1;
    }

    @Override
    boolean isEmpty() {
        return isEmpty;
    }

    @Override
    void set(User user, int index) {
        users[index] = user; //TODO qcel exception ete jnjac item e
    }

    @Override
    void printArray() {
        for (int i = 0; i < index ; i++) {
            System.out.println("user id is : " + users[i].id);
        }
    }

    private void extendArray() {
        User[] newArray = new User[users.length + users.length / 2 + 1];
        System.arraycopy(users, 0, newArray, 0, users.length);
        users = newArray;
    }
    public void test(){

    }
}
