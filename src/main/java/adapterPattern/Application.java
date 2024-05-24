package adapterPattern;

public class Application {
    public static void main(String[] args) {
        DateSaver dateSaver = new Adapter();
        dateSaver.saveDate("2003-12-03T10:15:30.00Z");
    }
}
