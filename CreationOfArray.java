public class CreationOfArray {
    public static void main(String[] args) {
        // int[] nums = {5,6,7,9};
        int[] nums = new int[4];
        nums[0] = 5;
        nums[1] = 6;
        nums[2] = 7;
        nums[3] = 9;

        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }
}
