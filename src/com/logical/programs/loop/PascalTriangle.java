package com.logical.programs.loop;

/**
 * Created by kiran on 7/23/16.
 */
public class PascalTriangle {

    public static void generatePascalTriangle(long n) {
        long[] previousRow;
        long[] currentRow = {1};
        printArray(currentRow);
        previousRow = currentRow;
        for (int i=2; i<=n; i++) {
            currentRow = new long[i];
            currentRow[0] = 1;
            currentRow[i-1] = 1;
            for(int j=0; j<i-2; j++) {
                currentRow[j+1] = previousRow[j]+previousRow[j+1];
            }
            printArray(currentRow);
            previousRow = currentRow;
        }
    }

    public static void printArray(long[] array) {
        for (int i=0; i<array.length; i++) {
            System.out.print(array[i]+"\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        generatePascalTriangle(562);
    }
}
