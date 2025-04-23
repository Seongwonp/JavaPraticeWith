package ch_08_class.singleton;

public class Test {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton1);
        System.out.println(singleton2);

        if(singleton1 == singleton2) {
            System.out.println("It is the same instance as another instance!");
        } else {
            System.out.println("It is not the same instance as another instance!");
        }


    }
}
