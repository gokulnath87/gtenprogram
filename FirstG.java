import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FirstG {
    public static void main(String[] args) {
        List<Integer> numbersList
                = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        Optional<Integer> first = numbersList.stream().findFirst();
        if (first.isPresent()) {
            Integer result = first.get();
            System.out.println(result);       // 1
        } else {
            System.out.println("no value?");
        }


    }

}
