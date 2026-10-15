import java.util.Arrays;

public class Numbers {
    public static void main(String[] args) {
        Integer[] intList = {42, 7, 19, 3, 25};
        Sorting.insertionSort(intList);
        System.out.println(Arrays.toString(intList));
    }
}
