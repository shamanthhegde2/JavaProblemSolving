package Array.Basic;

public class CheckSortedArray {
    public static void main(String[] args) {
        int[] a = new int[] {1,2,3,4,5};
        int n = a.length;
        if(n==1){
            System.out.println("sorted");
            return;
        }
        for(int i=0; i<n-1; i++) {
            if(a[i] > a[i+1]){
                System.out.println("unsorted");
                return;
            }
        }
        System.out.println("sorted");
    }
}
