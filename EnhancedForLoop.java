public class EnhancedForLoop {
    public static void main(String[] args) {
        int[] nums = new int[4];
        nums[0] = 4;
        nums[1] = 5;
        nums[2] = 6;
        nums[3] = 7;

        // for(int i=0;i<nums.length;i++){
        //     System.out.println(nums[i]);
        // }

        for(int n : nums){
            System.out.println(n);
        }
    }
}
