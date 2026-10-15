import java.util.Arrays;

public class Strings {
    public static void main(String[] args) {
        String[] stringList = {"delta", "alpha", "charlie", "bravo"};
        Sorting.insertionSort(stringList);
        System.out.println(Arrays.toString(stringList));
    }
}
