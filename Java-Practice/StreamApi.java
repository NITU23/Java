import java.util.Arrays;
import java.util.List;

public class StreamApi {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10, 20, 10, 15);
        nums.forEach(n -> System.out.println(n));
    }
}
