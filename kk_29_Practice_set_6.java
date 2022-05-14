package com.company;

public class kk_29_Practice_set_6 {
    public static void main(String[] args) {
//        Create an array of 5 floats and calculate their sum.
        System.out.println("Create an array of 5 floats and calculate their sum.");
        float[] no={5.5f,56.5f,50.5f,25.4f};
        float sum=0;
        for (float v : no) {
            sum += v;
        }
        System.out.println("sum of all the float values is :: "+sum);


//        Write a program to find out whether a given integer is present in an array or not.
        System.out.println("\n\n\n program to find out whether a given integer is present in an array or not.");
        float givenNumber=56.5f;
        for (float v : no) {
            if (v == givenNumber) {
                System.out.println("Yes Given number is present in array...");
                break;
            }
        }



//        Calculate the average marks from an array containing marks of all students in physics using a for-each loop.
        System.out.println("\n\n\nCalculate the average marks from an array");
        float[] phyMarks = {5.5f,56.5f,50.5f,25.4f,25.4f,78.5f};
        float   sumOfPhyMarks=0;
        for (float element :phyMarks) {
            sumOfPhyMarks+=element;
        }
        float avgMarks=sumOfPhyMarks/phyMarks.length;
        System.out.println("Average marks of physics is :: "+avgMarks);



//        Create a Java program to add two matrices of size 2x3.
        System.out.println("\n\n\nCreate a Java program to add two matrices of size 2x3.");
        int [][] mat1=new int[2][3];
        int [][] mat2=new int[2][3];
        int [][] sMat=new int[2][3];

        mat1[0][0] = 101;
        mat1[0][1] = 102;
        mat1[0][2] = 103;
        mat1[1][0] = 201;
        mat1[1][1] = 202;
        mat1[1][2] = 203;


        mat2[0][0] = 101;
        mat2[0][1] = 102;
        mat2[0][2] = 103;
        mat2[1][0] = 201;
        mat2[1][1] = 202;
        mat2[1][2] = 203;

        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                sMat[i][j]=mat1[i][j]+mat2[i][j];
            }

        }
        System.out.println("both the matrix are added");
        for (int[] ints : sMat) {
            for (int anInt : ints) {
                System.out.print(anInt);
                System.out.print(" ");
            }
            System.out.println(" ");
        }


        // upper problem in other way
        // Practice Problem 4
        int [][] mat11 = {{1, 2, 3},
                         {4, 5, 6}};
        int [][] mat22 = {{2, 6, 13},
                         {3, 7, 1}};
        int [][] result = {{0, 0, 0},
                           {0, 0, 0}};

        for (int i=0;i<mat11.length;i++){ // row number of times
            for (int j=0;j<mat11[i].length;j++) { // column number of time
                System.out.format(" Setting value for i=%d and j=%d\n", i, j);
                result[i][j] = mat11[i][j] + mat22[i][j];
            }
        }



//        Write a Java program to reverse an array.
        System.out.println("Write a Java program to reverse an array.");
        int[] natNumber= {1,2,3,4,5,6,7,8,9};
        System.out.println("natural no array is printed below ");
        for (int s:natNumber) {
            System.out.print(s);
            System.out.print("  ");
        }
        int[] revNatNumber= new int[9];
        for (int i = 0; i < natNumber.length; i++) {
            revNatNumber[(revNatNumber.length-(i+1))]=natNumber[i];
        }
        System.out.println("\n\n reversed array is printed below ");
        for (int s:revNatNumber){
            System.out.print(s);
            System.out.print("  ");
        }




//        Write a Java program to find the maximum element in an array.
        System.out.println("\n\n\nprogram to find the maximum element in an array.");
        int[] natNumberRandom= {4,8,1,7,5,6,3,9,2};
        int rand1=0;
        for (int i = 1; i < natNumberRandom.length; i++) {
            if (natNumberRandom[i-1]>natNumberRandom[i]){
                if (natNumberRandom[i-1]>rand1){
                    rand1=natNumberRandom[i-1];
                }
            }
            else if (natNumberRandom[i] > natNumberRandom[i - 1]){
                if (natNumberRandom[i-1]>rand1){
                    rand1=natNumberRandom[i];
                }
            }
        }
        System.out.println("largest number in the array is ::"+rand1);




//        Write a Java program to find whether an array is sorted or not.
        System.out.println("program to find whether an array is sorted or not.");
//        int[] natNumberNotSorted= {4,8,1,7,5,6,3,9,2};
        int[] natNumberNotSorted= {1,2,3,4,5,6,7,8,9};
//        int cc=0;
        if (natNumberNotSorted[0]>=natNumberNotSorted[1]){
            System.out.println("must be sorted in descending order");
            for (int i = 1; i < natNumberNotSorted.length; i++) {
                if (natNumberNotSorted[i-1]>=natNumberNotSorted[i]){
                }
//                else{
//                    System.out.println("array is not sorted");
//                }
            }
            System.out.println("Array is sorted in descending order");
        }
        else {
            System.out.println("must be sorted in ascending order");
            for (int i = 1; i < natNumberNotSorted.length; i++) {
                if (natNumberNotSorted[i - 1] >= natNumberNotSorted[i]) {
                }
//                else {
//                    System.out.println("array is not sorted");
//                }
            }
        }
        System.out.println("Array is sorted in ascending order");



        // Practice Problem 7
        boolean isSorted = true;
        int [] arr = {1, 12, 3, 4, 5, 34, 67};
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] > arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("The Array is sorted");
        }
        else{
            System.out.println("The Array is not sorted");
        }















        /*
//          trying sorting arrays in ascending order...
//        Write a Java program to find the maximum element in an array.
        System.out.println("\n\n\n program to find the maximum element in an array.");
        int[] natNumberRandom= {4,8,1,7,5,6,3,9,2};
        int[] natNumberSorted=new int[9];
        int rand1,rand2,rand3;
        for (int i = 2; i < natNumberRandom.length; i++) {
            while (natNumberRandom[i-2]>natNumberRandom[i-1]){
                rand1=natNumberRandom[i-1];
                rand2=natNumberRandom[i-2];
                natNumberRandom[i-2]=rand1;
                natNumberRandom[i-1]=rand2;
            }
            while (natNumberRandom[i-2]>natNumberRandom[i]) {
                rand1 = natNumberRandom[i];
                rand2 = natNumberRandom[i - 2];
                natNumberRandom[i - 2] = rand1;
                natNumberRandom[i] = rand2;
            }

        }
        System.out.println("\n\n sorted array is printed below ");
        for (int s:natNumberRandom) {
            System.out.print(s);
            System.out.print("  ");
        }

//        4,8,1,7,5,6,3,9,2
//        4  1  7  5  6  3  8  9  2
//        4  1  5  6  3  7  8  9  2

*/



    }
}
