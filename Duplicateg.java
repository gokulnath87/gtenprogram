import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.*;
import java.util.stream.Collectors;

public class Duplicateg {
    public static void main(String[] args) {


        ArrayList<Integer> numbersList
                = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8));

        Set<Integer> setWithoutDuplicates = numbersList.stream()
                .collect(Collectors.toSet());

        System.out.println(setWithoutDuplicates);

    }
}
