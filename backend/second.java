
import java.util.Scanner;

public class second {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Array size must be greater than zero.");
            sc.close();
            return;
        }

        int[] arr = new int[n];

        System.out.println("Enter " + n + " array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int smallest = 0, secondSmallest = 0;
        int largest = 0, secondLargest = 0;

        boolean hasSmallest = false;
        boolean hasSecondSmallest = false;
        boolean hasLargest = false;
        boolean hasSecondLargest = false;

        // Find smallest, second smallest,
        // largest and second largest unique elements

        for (int i = 0; i < n; i++) {

            int num = arr[i];

            // Find smallest and second smallest
            if (!hasSmallest || num < smallest) {

                if (hasSmallest) {
                    secondSmallest = smallest;
                    hasSecondSmallest = true;
                }

                smallest = num;
                hasSmallest = true;

            } else if (num != smallest &&
                    (!hasSecondSmallest || num < secondSmallest)) {

                secondSmallest = num;
                hasSecondSmallest = true;
            }

            // Find largest and second largest
            if (!hasLargest || num > largest) {

                if (hasLargest) {
                    secondLargest = largest;
                    hasSecondLargest = true;
                }

                largest = num;
                hasLargest = true;

            } else if (num != largest &&
                    (!hasSecondLargest || num > secondLargest)) {

                secondLargest = num;
                hasSecondLargest = true;
            }
        }

        // Display results
        System.out.println("\nSmallest element: " + smallest);
        System.out.println("Largest element: " + largest);

        if (hasSecondSmallest) {
            System.out.println("Second smallest unique element: "
                    + secondSmallest);
        } else {
            System.out.println("Not enough unique elements for second smallest.");
        }

        if (hasSecondLargest) {
            System.out.println("Second largest unique element: "
                    + secondLargest);
        } else {
            System.out.println("Not enough unique elements for second largest.");
        }

        sc.close();
    }
}
