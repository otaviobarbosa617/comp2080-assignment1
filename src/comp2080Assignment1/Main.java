package comp2080Assignment1;

import java.util.*;

public class Main {



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






    }
}
