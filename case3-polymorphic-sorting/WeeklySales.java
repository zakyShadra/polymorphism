import java.util.Arrays;

public class WeeklySales {
    public static void main(String[] args) {
        Salesperson[] sales = {
            new Salesperson("John", "Smith", 1200),
            new Salesperson("Sarah", "Brown", 1500),
            new Salesperson("David", "Jones", 1500),
            new Salesperson("Mia", "Adams", 900)
        };

        Sorting.insertionSort(sales);
        System.out.println(Arrays.toString(sales));
    }
}
