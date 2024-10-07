package org.eok;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("This is arrays:");
        // Store roll numbers
        int[] rollNo = new int[5]; // declare and initialize
        for (int i = 0; i < rollNo.length; i++) {
            System.out.println("Enter roll number: "+ i);
            rollNo[i] = in.nextInt();
        }
        // printing array elements
        for (int roll: rollNo){
            System.out.println(roll);
        }
        // Alternative printing
        System.out.println(Arrays.toString(rollNo));
    }
}