package Array.Basic;

public class LargestElementInAnArray {
    public static void main(String[] args) {
        int[] arr = new int[] {10, 50, 15, 40};
        int largest = arr[0];
        for(int i=1; i<arr.length; i++) {
            if(arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println(largest+" ");
    }
}
