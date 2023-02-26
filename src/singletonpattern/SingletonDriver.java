package singletonpattern;

public class SingletonDriver
{
    public static void main(String [] args){
       /* EagerSingleton obj1 = EagerSingleton.getInstance();
        EagerSingleton obj2 = EagerSingleton.getInstance(); */
        LazySingleton obj1 = LazySingleton.getInstance();
        LazySingleton obj2 = LazySingleton.getInstance();

        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());

    }
}
