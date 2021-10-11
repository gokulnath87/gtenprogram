import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
public class CountG{
public static void main(String[]args){

    List<Integer> numList = Arrays.asList(777, 444, 999, 888);
    long c = numList.stream().count();
    System.out.println(c);
}
}
