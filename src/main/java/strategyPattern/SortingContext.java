package strategyPattern;

public class SortingContext {
    SortingStrategy strategy;
    public void setStrategy(SortingStrategy strategy) {
        this.strategy = strategy;
    }
    public void sort(int[] array) {
        strategy.sort(array);
    }
}
