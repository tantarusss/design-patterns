package strategyPattern;

public class Application {
    public static void main(String[] args) {
        int[] array = {1,2,5,3,4};
        SortingContext context = new SortingContext();
        context.setStrategy(new QuicksortStrategy());
        context.sort(array);
    }
}
