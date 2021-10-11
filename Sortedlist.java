import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sortedlist {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(new Integer[]{7,17,37,47,57});
        List<Integer> reverseOrder = listOfIntegers.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(reverseOrder);
    }
}
