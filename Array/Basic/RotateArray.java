package Array.Basic;

public class RotateArray {

    public static void reverse(int[] nums, int left, int right) {
        while(left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int rotation = 5;
        int n = nums.length;
        int r = rotation%n;
        if(n<=1 || r==0){
            return;
        }
        reverse(nums, 0, n-1);
        reverse(nums, 0, r-1);
        reverse(nums, r, n-1);
        for(int i=0; i<n; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
