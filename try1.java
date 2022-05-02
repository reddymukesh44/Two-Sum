import java.util.Arrays;

public class try1 {
    public static void main(String[] args) {
        int nums[] = {3,3};
        int target = 6;
        int arr[] = sum(nums,target);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] sum(int nums[],int target){
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            for (j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target ) {
                    return new int[] {i,j};
                }
            }
        }
        return null;
    }
}