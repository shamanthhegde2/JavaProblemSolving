package Array.Basic;

import java.util.Scanner;

public class GetSecondOrderElements {
    public static void main(String[] args) {
        int n = 5;
        int[] a = new int[] {1,2,3,4,5};
        // solution
        //if there are no second smallest or largest
        if(n < 2) {
            System.out.println("Second Largest: "+ -1);
            System.out.println("Second Smallest: " + -1);
        }
        int largest = Integer.MIN_VALUE;
        int sLargest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int sSmallest = Integer.MAX_VALUE;
        for(int i=0; i<n ;i++) {
            if(a[i] > largest) {
                sLargest = largest;
                largest = a[i];
            } else if(a[i] > sLargest && a[i] != largest) {
                sLargest = largest;
            }

            if(a[i] < smallest) {
                sSmallest = smallest;
                smallest = a[i];
            } else if(a[i] < sSmallest && a[i] != smallest) {
                sSmallest = a[i];
            }
        }
        System.out.println("Second Largest: "+ sLargest);
        System.out.println("Second Smallest: " + sSmallest);
    }
}
