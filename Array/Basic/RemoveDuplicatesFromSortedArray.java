package Array.Basic;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] arr = new int[] {1,2, 2, 5, 5, 6, 6, 10};
        int n = arr.length;
        int i=0;
        int j=1;
        while( j< n) {
            if(arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
            j++;
        }
        // Initial Sorted Array
        for(int k=0; k<i+1; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
