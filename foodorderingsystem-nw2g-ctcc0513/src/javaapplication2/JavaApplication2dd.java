package javaapplication2;
import java.util.Scanner;

public class JavaApplication2dd {
    void sort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    static void printArray(int arr[]) {
        int n = arr.length;
        System.out.print("Sorted Numbers : ");
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int arr[] = {4, 10, 8, 2, 3, 7, 12, 13, 4, 9};
        InsertSort ob = new InsertSort();
        ob.sort(arr);
        printArray(arr);
    }
}



