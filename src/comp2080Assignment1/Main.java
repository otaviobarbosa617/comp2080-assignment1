// COMP 2152 - Assignment 1
// Otavio Pereira-Barbosa - 101337690

package comp2080Assignment1;

import java.util.*;

public class Main {
    // COMP 2152 - Assignment 1
    // Otavio Pereira-Barbosa - 101337690

    public static void selectionSortDesc(int[] arrayOfSize){
        for (int i = 0; i < arrayOfSize.length; i++){
            int minimum = i;
            for (int j = i+1; j < arrayOfSize.length; j++){
                if (arrayOfSize[j] > arrayOfSize[minimum]){
                    minimum = j;
                }
            }
            int temporary = arrayOfSize[minimum];
            arrayOfSize[minimum] = arrayOfSize[i];
            arrayOfSize[i] = temporary;
        }
    }

    public static void InsertionSortDesc(int[] arrayOfSize){
        for (int i = 1; i < arrayOfSize.length; i++){
            int temporary = arrayOfSize[i];
            int j = i - 1;
            while (j >= 0 && temporary > arrayOfSize[j]){
                arrayOfSize[j + 1] = arrayOfSize[j];
                --j;
            }
            arrayOfSize[j + 1] = temporary;
        }
    }

    public static void MergeSortDesc(int[] arrayOfSize){
        if (arrayOfSize.length < 2){
            return;
        }
        int mid = arrayOfSize.length/2;

        int[] tempLeft = new int[mid];
        int[] tempRight = new int[arrayOfSize.length - mid];

        System.arraycopy(arrayOfSize, 0, tempLeft, 0, mid);

        if (arrayOfSize.length - mid >= 0)
            System.arraycopy(arrayOfSize, mid, tempRight, 0, arrayOfSize.length - mid);

        MergeSortDesc(tempLeft);
        MergeSortDesc(tempRight);
        merge(arrayOfSize, tempLeft, tempRight);
    }

    public static void merge(int[] temporaryArray, int[] tempLeft, int [] tempRight){
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < tempLeft.length && j < tempRight.length){
            if (tempLeft[i] > tempRight[j]){
                temporaryArray[k++] = tempLeft[i++];
            }
            else {
                temporaryArray[k++] = tempRight[j++];
            }
        }
        while (i < tempLeft.length){
            temporaryArray[k++] = tempLeft[i++];
        }
        while (j < tempRight.length){
            temporaryArray[k++] = tempRight[j++];
        }
    }

    public static int partition(int[] array, int low, int high){
        int pivot = array[high];
        int i = low -1;
        for (int j = low; j < high; j++){
            if (array[j] >= pivot){
                i++;
                int temporary = array[i];
                array[i] = array[j];
                array[j] = temporary;
            }
        }
        int temporary = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temporary;
        return i+1;
    }

    public static void QuickSortDesc(int[] arrayOfSize, int low, int high){
        if (low < high){
            int pi = partition(arrayOfSize, low, high);
            QuickSortDesc(arrayOfSize, low, pi -1);
            QuickSortDesc(arrayOfSize, pi+1, high);

        }
    }


    public static void main(String[] args) {
        int[] coreData = CoreData.FillArray();

        // Selection Sort
        CoreData.SelectionCore(coreData, 50);
        CoreData.SelectionCore(coreData, 1000);
        CoreData.SelectionCore(coreData, 10000);
        CoreData.SelectionCore(coreData, 100000);
        CoreData.SelectionCore(coreData, 1000000);

        // Insertion Sort
        CoreData.InsertionCore(coreData, 50);
        CoreData.InsertionCore(coreData, 1000);
        CoreData.InsertionCore(coreData, 10000);
        CoreData.InsertionCore(coreData, 100000);
        CoreData.InsertionCore(coreData, 1000000);

        // Merge Sort
        CoreData.MergeCore(coreData, 50);
        CoreData.MergeCore(coreData, 1000);
        CoreData.MergeCore(coreData, 10000);
        CoreData.MergeCore(coreData, 100000);
        CoreData.MergeCore(coreData, 1000000);

        // Quick Sort
        CoreData.QuickCore(coreData, 50);
        CoreData.QuickCore(coreData, 1000);
        CoreData.QuickCore(coreData, 10000);
        CoreData.QuickCore(coreData, 100000);
        CoreData.QuickCore(coreData,1000000);

        // Binary Search
        selectionSortDesc(coreData);
        CoreData.BinarySearchCore(coreData, 50,2500000);
        CoreData.BinarySearchCore(coreData, 1000,2500000);
        CoreData.BinarySearchCore(coreData, 10000,2500000);
        CoreData.BinarySearchCore(coreData, 100000,2500000);
        CoreData.BinarySearchCore(coreData, 1000000,2500000);

        CoreData.LinearSearchCore(coreData, 50,2500000);
        CoreData.LinearSearchCore(coreData, 1000,2500000);
        CoreData.LinearSearchCore(coreData, 10000,2500000);
        CoreData.LinearSearchCore(coreData, 100000,2500000);
        CoreData.LinearSearchCore(coreData, 1000000,2500000);

    }
}
