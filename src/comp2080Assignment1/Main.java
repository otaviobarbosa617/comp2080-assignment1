package comp2080Assignment1;

import java.util.*;

public class Main {

    public static void selectionSortDesc(int[] arrayofSize){
        for (int i = 0; i < arrayofSize.length; i++){
            int minimum = i;
            for (int j = i+1; j < arrayofSize.length; j++){
                if (arrayofSize[j] > arrayofSize[minimum]){
                    minimum = j;
                }
            }
            int temporary = arrayofSize[minimum];
            arrayofSize[minimum] = arrayofSize[i];
            arrayofSize[i] = temporary;
        }
    }

    public static void InsertionSortDesc(int[] arrayofSize){
        for (int i = 1; i < arrayofSize.length; i++){
            int temporary = arrayofSize[i];
            int j = i - 1;
            while (j >= 0 && temporary > arrayofSize[j]){
                arrayofSize[j + 1] = arrayofSize[j];
                --j;
            }
            arrayofSize[j + 1] = temporary;
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






    }
}
