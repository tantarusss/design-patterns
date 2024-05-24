package singletonPattern;

public class MyObject {
    static MyObject instance;
    public static MyObject getInstance() {
        if (instance == null) {
            instance = new MyObject();
        }
        return instance;
    }
    private MyObject() {
        //initialization code
    }
}
