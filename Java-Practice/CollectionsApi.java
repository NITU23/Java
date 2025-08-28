import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionsApi {
    public static void main(String[] args) {
        Collection<Integer> nums = new ArrayList<Integer>(); // this won't support the index value. as it is collection
        nums.add(10);
        nums.add(20);
        System.out.println(nums);

        List<Integer> nums1 = new ArrayList<Integer>(); // this will support the index value, as it is list
        nums1.add(20);
        nums1.add(10);

        System.out.println(nums1.get(1));
    }
}
