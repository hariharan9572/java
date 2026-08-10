import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachMethod {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4, 5, 7, 3, 2, 6);

        // Consumer<Integer> con = new Consumer<Integer>() {
        //     public void accept(Integer n){
        //         System.out.println(n);
        //     }
        // };

        Consumer<Integer> con = n -> System.out.println(n);
        
        nums.forEach(con); // instead of con check above statementf

        nums.forEach(n -> System.out.println(n));

        // nums.forEach(n -> System.out.println(n));

        // int sum = 0;
        // for(int n: nums){
        //     if(n%2==0)
        //     {
        //         n = n*2;
        //         sum = sum + n;
        //     }
        // }

        // System.out.println(sum);
    }
}
