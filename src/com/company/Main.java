package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println(getGreatestCommonDivisor(81,153));
    }

    public static int getGreatestCommonDivisor(int first, int second) {

        if (first < 10 || second < 10) {

            System.out.println("Number have to be greater than 0");
            return -1;
        }

        int count = 1;
        int greatestCommonDivisor = 0;
        while (count <= first && count <= second) {

            if (first % count == 0 && second % count == 0) {

                greatestCommonDivisor = count;
            }

            count++;
        }

        return greatestCommonDivisor;
    }
}
