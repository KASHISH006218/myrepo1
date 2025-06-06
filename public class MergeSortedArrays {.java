public class MergeSortedArrays {

    // Function to calculate the next gap
    private static int nextGap(int gap) {
        if (gap <= 1)
            return 0;
        return (gap / 2) + (gap % 2);
    }

    public static void merge(int[] arr1, int[] arr2, int n, int m) {
        int gap = nextGap(n + m);

        while (gap > 0) {
            int i = 0, j = gap;

            while (j < (n + m)) {
                // Determine positions in arr1 and arr2
                int val1, val2;

                if (i < n)
                    val1 = arr1[i];
                else
                    val1 = arr2[i - n];

                if (j < n)
                    val2 = arr1[j];
                else
                    val2 = arr2[j - n];

                // Swap if needed
                if (val1 > val2) {
                    if (i < n && j < n) {
                        // Both in arr1
                        int temp = arr1[i];
                        arr1[i] = arr1[j];
                        arr1[j] = temp;
 } else if (i < n && j >= n) {
                        // i in arr1, j in arr2
                        int temp = arr1[i];
                        arr1[i] = arr2[j - n];
                        arr2[j - n] = temp;
                    } else {
                        // Both in arr2
                        int temp = arr2[i - n];
                        arr2[i - n] = arr2[j - n];
                        arr2[j - n] = temp;
                    }
                }

                i++;
                j++;
            }

            gap = nextGap(gap);
        }
    }

    // Driver code
    public static void main(String[] args) {
        int[] arr1 = {1, 4, 7, 8, 10};
        int[] arr2 = {2, 3, 9};
        int n = arr1.length, m = arr2.length;

        merge(arr1, arr2, n, m);

        System.out.print("Merged arr1: ");
        for (int i : arr1)
            System.out.print(i + " ");
        System.out.println();

        System.out.print("Merged arr2: ");
        for (int i : arr2)
            
        System.out.println();
        for (int i : arr2)
            System.out.print(i + " ");
        
        System.out.println("Final merged arrays:");
    }
    }
