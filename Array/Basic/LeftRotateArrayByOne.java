package Array.Basic;

public class LeftRotateArrayByOne {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        int n = nums.length;
        if(n<=1){
            return;
        }
        int temp = nums[0];
        for(int i=1; i<n; i++) {
            nums[i-1] = nums[i];
        }
        nums[n-1] = temp;
        for(int i=0; i<n; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
