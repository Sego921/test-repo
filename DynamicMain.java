
public class DynamicMain {
    public static void main(String[] args) {

          DynamicArray dynamicArray = new DynamicArray();
        for (int i = 0; i <20 ; i++) {
            dynamicArray.add(new User(i));
        }
          User[] test =  new User[70];
        for (int i = 0; i <test.length ; i++) {
            test[i] = new User(i);
        }
        dynamicArray.addAll(test);
        dynamicArray.printArray();

//        DynamicArray dynamicArray = new DynamicArray();
//        System.out.println(dynamicArray.isEmpty());
//        dynamicArray.add(new User(25));
//        dynamicArray.add(new User(25));
//        dynamicArray.add(new User(25));
//        dynamicArray.add(new User(25));
//        dynamicArray.add(new User(25));
//        dynamicArray.add(new User(25));
//        dynamicArray.add(new User(25));
//        dynamicArray.add(new User(25));
//        dynamicArray.add(new User(25));
//        dynamicArray.add(new User(25));
//        System.out.println(dynamicArray.isEmpty());
//        dynamicArray.printArray();

    }

}

