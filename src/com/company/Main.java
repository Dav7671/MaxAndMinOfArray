package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        double[] arr = new double[10];
        System.out.println("Original array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextDouble(0, 100);
            System.out.print(arr[i] + " ");
        }

        double max = arr[0];
        double min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }else if(arr[i] < min){
                min = arr[i];
            }
        }

        System.out.println(" \n Max =  " + max + " Min = " + min);
    }
}
