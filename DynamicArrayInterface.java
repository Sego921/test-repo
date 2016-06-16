/**
 * Created by user on 8/6/2015.
 */
public abstract class DynamicArrayInterface {
    abstract void add(User user);
    abstract void add(User user, int index);
    abstract void addAll(User[] users);
    abstract void clear();
    abstract boolean contains(User user);
    abstract User get(int index);
    abstract int indexOf (User user);
    abstract boolean isEmpty();
    abstract void set(User user, int index);
    abstract void printArray();

}
