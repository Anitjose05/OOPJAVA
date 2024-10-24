package javalab;
import java.util.Scanner;
public class QuickSort {
    public static void swap(int[] A, int a, int b) {
        int t = A[a];
        A[a] = A[b];
        A[b] = t;
    }
    public static int partition(int[] A, int low, int high) {
        int pivot = A[high];
        int i = low - 1;
        for (int j = low; j <= high - 1; j++) {
            if (A[j] < pivot) {
                i++;
                swap(A, i, j);
            }
        }
        swap(A, i + 1, high);
        return i + 1;
    }
    public static void quickSort(int[] A, int low, int high) {
        if (low < high) {
            int pivot = partition(A, low, high);
            quickSort(A, low, pivot - 1);
            quickSort(A, pivot + 1, high);
        }
    }
    public static void printArray(int[] A) {
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] A = new int[n];
        System.out.println("Enter your elements: ");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        System.out.println("Original Array: ");
        printArray(A);
        quickSort(A, 0, n- 1);
        System.out.println("Sorted Array: ");
        printArray(A);
    }
}