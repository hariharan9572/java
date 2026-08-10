import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Set {
    public static void main(String[] args) {
        // java.util.Set<Integer> nums = new HashSet<Integer>();
        java.util.Set<Integer> nums = new TreeSet<Integer>();
        nums.add(62);
        nums.add(54);
        nums.add(82);
        nums.add(21);

        Iterator<Integer> values = nums.iterator();

        while (values.hasNext()) {
            System.out.println(values.next());
        }

        // for(int n : nums){
        //     System.out.println(n);
        // }
    }
}
