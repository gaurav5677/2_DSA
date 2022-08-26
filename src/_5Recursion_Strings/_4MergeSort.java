package _5Recursion_Strings;

public class _4MergeSort {

    // method 1 : by creating 2 different arrays
//    public static void main(String[] args) {
//        int[] a = {2, 3, 4, 1, 3, 34, 4, 5};
//        mergeSort(a);
//    }
//
//    public static void mergeSort(int[] input) {
//        if (input.length <= 1) {
//            return;
//        }
//
//        int mid = input.length / 2;
//        int part1[] = new int[mid];
//        int part2[] = new int[input.length - mid];
//        for (int i = 0; i < mid; i++) {
//            part1[i] = input[i];
//        }
//
//        int k = 0;
//        for (int i = mid; i < input.length; i++) {
//            part2[k] = input[k];
//            k++;
//        }
//        mergeSort(part1);
//        mergeSort(part2);
//        merge(part1, part2, input);
//
//
//    }
//
//    public static void merge(int[] input1, int[] input2, int[] output) {
//        int i = 0, j = 0, k = 0;
//        while (i < input1.length && j < input2.length) {
//            if (input1[i] < input2[j]) {
//                output[k] = input1[i];
//                k++;
//                i++;
//
//            } else {
//                output[k] = input2[j];
//                k++;
//                j++;
//
//            }
//        }
//
//        while (i < input1.length) {
//            output[k] = input1[i];
//            k++;
//            i++;
//        }
//        while (j < input2.length) {
//            output[k] = input2[j];
//            j++;
//            k++;
//        }
//
//
//
//
//    }
//    public static void print(int[] output) {
//        for (int i = 0; i < output.length; i++) {
//            System.out.println(output[i]);
//
//        }
//    }

    static void mergeSort(int[] input, int sI, int eI) {
        if (sI >= eI) {
            return;
        }
        int mid = (sI + eI) / 2;

        mergeSort(input, sI, mid);
        mergeSort(input, mid + 1, eI);
        merge(input, sI, eI);

    }



    public static void merge(int[] input, int sI, int eI) {
        int mid = (sI + eI) / 2;

        int ans[] = new int[eI - sI + 1];
        int i = sI;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= eI) {
            if (input[i] < input[j]) {
                ans[k] = input[i];
                i++;
                k++;

            } else {
                ans[k] = input[j];
                k++;
                j++;
            }
        }
        while (i <= mid) {
            ans[k] = input[i];
            i++;
            k++;
        }
        while (j <= eI) {
            ans[k] = input[j];
            j++;
            k++;
        }

        for (int index = 0; index < ans.length; index++) {
            input[sI + index] = ans[index];
        }
    }


    public static void main(String[] args) {
        int arr[] = {6, 5, 4, 3, 2, 1};
        mergeSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }

}

