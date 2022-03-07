// COMP 2152 - Assignment 1
// Otavio Pereira-Barbosa - 101337690

package comp2080Assignment1;

import java.util.*;

public class CoreData extends Main {

    public static int[] FillArray() {
        int sizeOfArray = 1000000;
        Random randomGenerator = new Random();
        int[] coreData = new int[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++) {
            coreData[i] = randomGenerator.nextInt(2000001);
        }
        return coreData;
    }

    public static int[] CopyArray(int[] coreData, int size) {
        int[] data = new int[size];
        System.arraycopy(coreData, 0, data, 0, size);
        return data;
    }

    public static float Average(ArrayList<Long> time) {
        long sum = 0;
        for (long timeTaken : time) {
            sum += timeTaken;
        }
        long average = sum / time.size();
        return average;
    }

    public static void SelectionCore(int[] coreData, int size) {
        int[] coreDataCopy1 = CopyArray(coreData, size);
        int[] coreDataCopy2 = CopyArray(coreData, size);
        int[] coreDataCopy3 = CopyArray(coreData, size);
        int[] coreDataCopy4 = CopyArray(coreData, size);
        int[] coreDataCopy5 = CopyArray(coreData, size);
        ArrayList<Long> timeTotal = new ArrayList<>();
        System.out.println("");
        System.out.println("Core Data Set: " + size + "");

        // Selection Sort1
        long start = System.nanoTime();
        selectionSortDesc(coreDataCopy1);
        long end = System.nanoTime();
        long timeTaken = end - start;
        System.out.println("1/5 - Selection Sort = " + timeTaken + " " + "nanoseconds");
        timeTotal.add(timeTaken);

        // Selection Sort2
        long start2 = System.nanoTime();
        selectionSortDesc(coreDataCopy2);
        long end2 = System.nanoTime();
        long timeTaken2 = end2 - start2;
        System.out.println("2/5 - Selection Sort = " + timeTaken2 + " " + "nanoseconds");
        timeTotal.add(timeTaken2);

        // Selection Sort3
        long start3 = System.nanoTime();
        selectionSortDesc(coreDataCopy3);
        long end3 = System.nanoTime();
        long timeTaken3 = end3 - start3;
        System.out.println("3/5 - Selection Sort = " + timeTaken3 + " " + "nanoseconds");
        timeTotal.add(timeTaken3);

        // Selection Sort4
        long start4 = System.nanoTime();
        selectionSortDesc(coreDataCopy4);
        long end4 = System.nanoTime();
        long timeTaken4 = end4 - start4;
        System.out.println("4/5 - Selection Sort = " + timeTaken4 + " " + "nanoseconds");
        timeTotal.add(timeTaken4);

        // Selection Sort5
        long start5 = System.nanoTime();
        selectionSortDesc(coreDataCopy5);
        long end5 = System.nanoTime();
        long timeTaken5 = end5 - start5;
        System.out.println("5/5 - Selection Sort = " + timeTaken5 + " " + "nanoseconds");
        timeTotal.add(timeTaken5);
        if (size == 1000000) {
            System.out.println("Average for Quick Sort: " + (Average(timeTotal) / 1000000) + " milliseconds");
        }
        System.out.println("Average for Quick Sort: " + Average(timeTotal) + " nanoseconds");
    }

    public static void InsertionCore(int[] coreData, int size) {
        int[] coreDataCopy1 = CopyArray(coreData, size);
        int[] coreDataCopy2 = CopyArray(coreData, size);
        int[] coreDataCopy3 = CopyArray(coreData, size);
        int[] coreDataCopy4 = CopyArray(coreData, size);
        int[] coreDataCopy5 = CopyArray(coreData, size);
        ArrayList<Long> timeTotal = new ArrayList<>();
        System.out.println("");
        System.out.println("Core Data Set: " + size + "");

        // Insertion Sort1
        long start = System.nanoTime();
        InsertionSortDesc(coreDataCopy1);
        long end = System.nanoTime();
        long timeTaken = end - start;
        System.out.println("1/5 - Insertion Sort = " + timeTaken + " " + "nanoseconds");
        timeTotal.add(timeTaken);

        // Insertion Sort2
        long start2 = System.nanoTime();
        InsertionSortDesc(coreDataCopy2);
        long end2 = System.nanoTime();
        long timeTaken2 = end2 - start2;
        System.out.println("2/5 - Insertion Sort = " + timeTaken2 + " " + "nanoseconds");
        timeTotal.add(timeTaken2);

        // Insertion Sort3
        long start3 = System.nanoTime();
        InsertionSortDesc(coreDataCopy3);
        long end3 = System.nanoTime();
        long timeTaken3 = end3 - start3;
        System.out.println("3/5 - Insertion Sort = " + timeTaken3 + " " + "nanoseconds");
        timeTotal.add(timeTaken3);

        // Insertion Sort4
        long start4 = System.nanoTime();
        InsertionSortDesc(coreDataCopy4);
        long end4 = System.nanoTime();
        long timeTaken4 = end4 - start4;
        System.out.println("4/5 - Insertion Sort = " + timeTaken4 + " " + "nanoseconds");
        timeTotal.add(timeTaken4);

        // Insertion Sort5
        long start5 = System.nanoTime();
        InsertionSortDesc(coreDataCopy5);
        long end5 = System.nanoTime();
        long timeTaken5 = end5 - start5;
        System.out.println("5/5 - Insertion Sort = " + timeTaken5 + " " + "nanoseconds");
        timeTotal.add(timeTaken5);
        if (size == 1000000) {
            System.out.println("Average for Quick Sort: " + (Average(timeTotal) / 1000000) + " milliseconds");
        }
        System.out.println("Average for Quick Sort: " + Average(timeTotal) + " nanoseconds");
    }

    public static void MergeCore(int[] coreData, int size) {
        int[] coreDataCopy1 = CopyArray(coreData, size);
        int[] coreDataCopy2 = CopyArray(coreData, size);
        int[] coreDataCopy3 = CopyArray(coreData, size);
        int[] coreDataCopy4 = CopyArray(coreData, size);
        int[] coreDataCopy5 = CopyArray(coreData, size);
        ArrayList<Long> timeTotal = new ArrayList<>();
        System.out.println("");
        System.out.println("Core Data Set: " + size + "");

        // Merge Sort1
        long start = System.nanoTime();
        MergeSortDesc(coreDataCopy1);
        long end = System.nanoTime();
        long timeTaken = end - start;
        System.out.println("1/5 - Merge Sort = " + timeTaken + " " + "nanoseconds");
        timeTotal.add(timeTaken);

        // Merge Sort2
        long start2 = System.nanoTime();
        MergeSortDesc(coreDataCopy2);
        long end2 = System.nanoTime();
        long timeTaken2 = end2 - start2;
        System.out.println("2/5 - Merge Sort = " + timeTaken2 + " " + "nanoseconds");
        timeTotal.add(timeTaken2);

        // Merge Sort3
        long start3 = System.nanoTime();
        MergeSortDesc(coreDataCopy3);
        long end3 = System.nanoTime();
        long timeTaken3 = end3 - start3;
        System.out.println("3/5 - Merge Sort = " + timeTaken3 + " " + "nanoseconds");
        timeTotal.add(timeTaken3);

        // Merge Sort4
        long start4 = System.nanoTime();
        MergeSortDesc(coreDataCopy4);
        long end4 = System.nanoTime();
        long timeTaken4 = end4 - start4;
        System.out.println("4/5 - Merge Sort = " + timeTaken4 + " " + "nanoseconds");
        timeTotal.add(timeTaken4);

        // Merge Sort5
        long start5 = System.nanoTime();
        MergeSortDesc(coreDataCopy5);
        long end5 = System.nanoTime();
        long timeTaken5 = end5 - start5;
        System.out.println("5/5 - Merge Sort = " + timeTaken5 + " " + "nanoseconds");
        timeTotal.add(timeTaken5);
        if (size == 1000000) {
            System.out.println("Average for Quick Sort: " + (Average(timeTotal) / 1000000) + " milliseconds");
        }
        System.out.println("Average for Quick Sort: " + Average(timeTotal) + " nanoseconds");
    }

    public static void QuickCore(int[] coreData, int size) {
        int[] coreDataCopy1 = CopyArray(coreData, size);
        int[] coreDataCopy2 = CopyArray(coreData, size);
        int[] coreDataCopy3 = CopyArray(coreData, size);
        int[] coreDataCopy4 = CopyArray(coreData, size);
        int[] coreDataCopy5 = CopyArray(coreData, size);
        ArrayList<Long> timeTotal = new ArrayList<>();
        System.out.println("");
        System.out.println("Core Data Set: " + size + "");

        // Quick Sort1
        long start = System.nanoTime();
        QuickSortDesc(coreDataCopy1, 0, coreDataCopy1.length - 1);
        long end = System.nanoTime();
        long timeTaken = end - start;
        System.out.println("1/5 - Quick Sort = " + timeTaken + " " + "nanoseconds");
        timeTotal.add(timeTaken);

        // Quick Sort2
        long start2 = System.nanoTime();
        QuickSortDesc(coreDataCopy2, 0, coreDataCopy2.length - 1);
        long end2 = System.nanoTime();
        long timeTaken2 = end2 - start2;
        System.out.println("2/5 - Quick Sort = " + timeTaken2 + " " + "nanoseconds");
        timeTotal.add(timeTaken2);

        // Quick Sort3
        long start3 = System.nanoTime();
        QuickSortDesc(coreDataCopy3, 0, coreDataCopy3.length - 1);
        long end3 = System.nanoTime();
        long timeTaken3 = end3 - start3;
        System.out.println("3/5 - Quick Sort = " + timeTaken3 + " " + "nanoseconds");
        timeTotal.add(timeTaken3);

        // Quick Sort4
        long start4 = System.nanoTime();
        QuickSortDesc(coreDataCopy4, 0, coreDataCopy4.length - 1);
        long end4 = System.nanoTime();
        long timeTaken4 = end4 - start4;
        System.out.println("4/5 - Quick Sort = " + timeTaken4 + " " + "nanoseconds");
        timeTotal.add(timeTaken4);

        // Quick Sort5
        long start5 = System.nanoTime();
        QuickSortDesc(coreDataCopy5, 0, coreDataCopy5.length - 1);
        long end5 = System.nanoTime();
        long timeTaken5 = end5 - start5;
        System.out.println("5/5 - Quick Sort = " + timeTaken5 + " " + "nanoseconds");
        timeTotal.add(timeTaken5);
        if (size == 1000000) {
            System.out.println("Average for Quick Sort: " + (Average(timeTotal) / 1000000) + " milliseconds");
        }
        System.out.println("Average for Quick Sort: " + Average(timeTotal) + " nanoseconds");
    }

    public static int BinarySearch(int[] coreData, int numberToFind) {
        int lo = 0;
        int hi = coreData.length - 1;
        int mid;
        while (lo <= hi) {
            mid = (lo + hi) / 2;
            if (coreData[mid] == numberToFind) return mid;
            if (coreData[mid] > numberToFind) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return -1;
    }

    public static void BinarySearchCore(int[] coreData, int size, int numberToFind) {
        int[] coreDataCopy1 = CopyArray(coreData, size);
        int[] coreDataCopy2 = CopyArray(coreData, size);
        int[] coreDataCopy3 = CopyArray(coreData, size);
        int[] coreDataCopy4 = CopyArray(coreData, size);
        int[] coreDataCopy5 = CopyArray(coreData, size);
        ArrayList<Long> timeTotal = new ArrayList<>();
        System.out.println("");
        System.out.println("Core Data Set: " + size + "");
        // Binary Search 1
        long start = System.nanoTime();
        int result = BinarySearch(coreDataCopy1, numberToFind);
        if(result == -1){
            System.out.println("Number to find: " + numberToFind + "has not been found");
        }
        else {
            System.out.println("Number to find: " + numberToFind + " has been found at position " + result);
        }
        long end = System.nanoTime();
        long timeTaken = end - start;
        System.out.println("1/5 - Binary Search = " + timeTaken + " " + "nanoseconds");
        timeTotal.add(timeTaken);

        // Binary Search 2
        long start2 = System.nanoTime();
        int result2 = BinarySearch(coreDataCopy2, numberToFind);
        if(result2 == -1){
            System.out.println("Number to find: " + numberToFind + " has not been found");
        }
        else {
            System.out.println("Number to find: " + numberToFind + " has been found at position " + result2);
        }
        long end2 = System.nanoTime();
        long timeTaken2 = end2 - start2;
        System.out.println("2/5 - Binary Search = " + timeTaken2 + " " + "nanoseconds");
        timeTotal.add(timeTaken2);

        // Binary Search 3
        long start3 = System.nanoTime();
        int result3 = BinarySearch(coreDataCopy3, numberToFind);
        if(result3 == -1){
            System.out.println("Number to find: " + numberToFind + " has not been found");
        }
        else {
            System.out.println("Number to find: " + numberToFind + " has been found at position " + result3);
        }
        long end3 = System.nanoTime();
        long timeTaken3 = end3 - start3;
        System.out.println("3/5 - Binary Search = " + timeTaken3 + " " + "nanoseconds");
        timeTotal.add(timeTaken3);

        // Binary Search 4
        long start4 = System.nanoTime();
        int result4 = BinarySearch(coreDataCopy4, numberToFind);
        if(result4 == -1){
            System.out.println("Number to find: " + numberToFind + " has not been found");
        }
        else {
            System.out.println("Number to find: " + numberToFind + " has been found at position " + result4);
        }
        long end4 = System.nanoTime();
        long timeTaken4 = end4 - start4;
        System.out.println("4/5 - Binary Search = " + timeTaken4 + " " + "nanoseconds");
        timeTotal.add(timeTaken4);

        // Binary Search 5
        long start5 = System.nanoTime();
        int result5 = BinarySearch(coreDataCopy5, numberToFind);
        if(result5 == -1){
            System.out.println("Number to find: " + numberToFind + " has not been found");
        }
        else {
            System.out.println("Number to find: " + numberToFind + " has been found at position " + result5);
        }
        long end5 = System.nanoTime();
        long timeTaken5 = end5 - start5;
        System.out.println("5/5 - Binary Search = " + timeTaken5 + " " + "nanoseconds");
        timeTotal.add(timeTaken5);

        if (size == 1000000) {
            System.out.println("Average for Binary Search: " + (Average(timeTotal) / 1000000) + " milliseconds");
        }
        else {
            System.out.println("Average for Binary Search: " + Average(timeTotal) + " nanoseconds");
        }

    }

    public static int LinearSearch(int[] coreData, int numberToFind){
        for (int i = 0; i < coreData.length; i++){
            if (coreData[i] == numberToFind) return i;
        }
        return -1;
    }

    public static void LinearSearchCore(int[] coreData, int size, int numberToFind) {
        int[] coreDataCopy1 = CopyArray(coreData, size);
        int[] coreDataCopy2 = CopyArray(coreData, size);
        int[] coreDataCopy3 = CopyArray(coreData, size);
        int[] coreDataCopy4 = CopyArray(coreData, size);
        int[] coreDataCopy5 = CopyArray(coreData, size);
        ArrayList<Long> timeTotal = new ArrayList<>();
        System.out.println("");
        System.out.println("Core Data Set: " + size + "");
        // Linear Search 1
        long start = System.nanoTime();
        int result = LinearSearch(coreDataCopy1, numberToFind);
        if(result == -1){
            System.out.println("Number to find: " + numberToFind + " has not been found");
        }
        else {
            System.out.println("Number to find: " + numberToFind + " has been found at position " + result);
        }
        long end = System.nanoTime();
        long timeTaken = end - start;
        System.out.println("1/5 - Linear Search = " + timeTaken + " " + "nanoseconds");
        timeTotal.add(timeTaken);

        // Linear Search 2
        long start2 = System.nanoTime();
        int result2 = LinearSearch(coreDataCopy2, numberToFind);
        if(result2 == -1){
            System.out.println("Number to find: " + numberToFind + " has not been found");
        }
        else {
            System.out.println("Number to find: " + numberToFind + " has been found at position " + result2);
        }
        long end2 = System.nanoTime();
        long timeTaken2 = end2 - start2;
        System.out.println("2/5 - Linear Search = " + timeTaken2 + " " + "nanoseconds");
        timeTotal.add(timeTaken2);

        // Linear Search 3
        long start3 = System.nanoTime();
        int result3 = LinearSearch(coreDataCopy3, numberToFind);
        if(result3 == -1){
            System.out.println("Number to find: " + numberToFind + " has not been found");
        }
        else {
            System.out.println("Number to find: " + numberToFind + " has been found at position " + result3);
        }
        long end3 = System.nanoTime();
        long timeTaken3 = end3 - start3;
        System.out.println("3/5 - Linear Search = " + timeTaken3 + " " + "nanoseconds");
        timeTotal.add(timeTaken3);

        // Linear Search 4
        long start4 = System.nanoTime();
        int result4 = LinearSearch(coreDataCopy4, numberToFind);
        if(result4 == -1){
            System.out.println("Number to find: " + numberToFind + " has not been found");
        }
        else {
            System.out.println("Number to find: " + numberToFind + " has been found at position " + result4);
        }
        long end4 = System.nanoTime();
        long timeTaken4 = end4 - start4;
        System.out.println("4/5 - Linear Search = " + timeTaken4 + " " + "nanoseconds");
        timeTotal.add(timeTaken4);

        // Linear Search 5
        long start5 = System.nanoTime();
        int result5 = LinearSearch(coreDataCopy5, numberToFind);
        if(result5 == -1){
            System.out.println("Number to find: " + numberToFind + " has not been found");
        }
        else {
            System.out.println("Number to find: " + numberToFind + " has been found at position " + result5);
        }
        long end5 = System.nanoTime();
        long timeTaken5 = end5 - start5;
        System.out.println("5/5 - Linear Search = " + timeTaken5 + " " + "nanoseconds");
        timeTotal.add(timeTaken5);

        if (size == 1000000) {
            System.out.println("Average for Linear Search: " + (Average(timeTotal) / 1000000) + " milliseconds");
        }
        else {
            System.out.println("Average for Linear Search: " + Average(timeTotal) + " nanoseconds");
        }
    }
}
