package comp2080Assignment1;

import java.util.*;

public class Main {

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

        for (int i = mid; i < arrayOfSize.length; i++){
            tempRight[i - mid] = arrayOfSize[i];
        }

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



    public static void main(String[] args) {
        // Random Generator and CoreData
        int sizeOfArray = 1000000;
        Random randomGenerator = new Random();

        int[] coreData = new int[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++){
            coreData[i] = randomGenerator.nextInt(2000001);
        }

        // 4 copies of 50 size

        int[] data50n1 = new int[50];
        int[] data50n2 = new int[50];
        int[] data50n3 = new int[50];
        int[] data50n4 = new int[50];

        for (int i = 0; i < 50; i++){
            data50n1[i] = coreData[i];
            data50n2[i] = coreData[i];
            data50n3[i] = coreData[i];
            data50n4[i] = coreData[i];
        }

        // 4 copies of 1000 size

        int[] dataThousand1 = new int[1000];
        int[] dataThousand2 = new int[1000];
        int[] dataThousand3 = new int[1000];
        int[] dataThousand4 = new int[1000];

        for (int i = 0; i < 1000; i++){
            dataThousand1[i] = coreData[i];
            dataThousand2[i] = coreData[i];
            dataThousand3[i] = coreData[i];
            dataThousand4[i] = coreData[i];
        }

        // 4 copies of 10000 size

        int[] dataTenThousand1 = new int[10000];
        int[] dataTenThousand2 = new int[10000];
        int[] dataTenThousand3 = new int[10000];
        int[] dataTenThousand4 = new int[10000];

        for (int i = 0; i < 10000; i++){
            dataTenThousand1[i] = coreData[i];
            dataTenThousand2[i] = coreData[i];
            dataTenThousand3[i] = coreData[i];
            dataTenThousand4[i] = coreData[i];
        }

        // 4 copies of 100000 size

        int[] dataOneHundredThou1 = new int[100000];
        int[] dataOneHundredThou2 = new int[100000];
        int[] dataOneHundredThou3 = new int[100000];
        int[] dataOneHundredThou4 = new int[100000];

        for (int i = 0; i < 100000; i++){
            dataOneHundredThou1[i] = coreData[i];
            dataOneHundredThou2[i] = coreData[i];
            dataOneHundredThou3[i] = coreData[i];
            dataOneHundredThou4[i] = coreData[i];
        }

        // 4 copies of 1000000 size

        int[] dataOneMillion1 = new int[1000000];
        int[] dataOneMillion2 = new int[1000000];
        int[] dataOneMillion3 = new int[1000000];
        int[] dataOneMillion4 = new int[1000000];

        for (int i = 0; i < 1000000; i++){
            dataOneMillion1[i] = coreData[i];
            dataOneMillion2[i] = coreData[i];
            dataOneMillion3[i] = coreData[i];
            dataOneMillion4[i] = coreData[i];
        }



        System.out.println("Core data:");
        for (int i = 0; i < 50; i++){
            System.out.println(i+1 + " - " + coreData[i]);
        }
        System.out.println("");
        System.out.println("Copy 50 data:");
        for (int i = 0; i < 50; i++){
            System.out.println(i+1 + " - " + data50n1[i]);
        }

        selectionSortDesc(data50n1);
        System.out.println("");
        System.out.println("Selection sort - 50 data:");
        for (int i = 0; i < 50; i++){
            System.out.println(i+1 + " - " + data50n1[i]);
        }

        InsertionSortDesc(data50n2);
        System.out.println("");
        System.out.println("Insertion sort - 50 data:");
        for (int i = 0; i < 50; i++){
            System.out.println(i+1 + " - " + data50n2[i]);
        }

        MergeSortDesc(data50n3);
        System.out.println("");
        System.out.println("Merge sort - 50 data:");
        for (int i = 0; i < 50; i++){
            System.out.println(i+1 + " - " + data50n3[i]);
        }






    }
}
