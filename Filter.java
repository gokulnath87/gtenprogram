import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    public static void main(String[] args) {

        List<String> numbers = Arrays.asList("1", "12", "31", "41", "15", "16");
        System.out.println("original list: " + numbers);

        List<String> one = numbers.stream().filter((s) -> s.startsWith("1"))
                .collect(Collectors.toList());

        System.out.println("processed list,  numbers: " + one);

    }

}

