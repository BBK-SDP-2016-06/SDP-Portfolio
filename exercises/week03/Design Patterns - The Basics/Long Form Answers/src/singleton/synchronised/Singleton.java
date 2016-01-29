package singleton.synchronised;

/**
 * Questions 2a and 2b solutions using synchronized keyword
 * Created by George on 27/01/2016.
 */
public class Singleton {

    private static Singleton uniqueInstance;

    private Singleton() {}

    public static synchronized Singleton getInstance() {
        if(uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}

/*
This synchronised version of the lazy singleton pattern comes with a
price. Each time the program requires to use the getInstance() method,
a significant overhead is created since every thread calling the method
will have to wait its turn. After instantiating the uniqueInstance,
synchronization is unnecessary.

 */