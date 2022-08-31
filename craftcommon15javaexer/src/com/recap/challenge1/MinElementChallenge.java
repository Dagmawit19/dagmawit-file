package com.recap.challenge1;

import java.util.Scanner;

public class MinElementChallenge {
	
    static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" pls enter the size of an Array:");
		int size = in.nextInt();
		int[] myIntegers = readIntegers(size);
		int min = findMin(myIntegers);
		
		System.out.println(" The value you enterd: " + min);

	}
	private static int findMin(int[] arr) {
		// TODO Auto-generated method stub
		int min = Integer.MAX_VALUE;
		
		for(int i =0; i<arr.length; i++) {
			int temp = arr[i];
			if (temp<min) {
				min = temp;
			}
			
		}
		
		return min;
	}
	private static int[] readIntegers(int size) {
		// TODO Auto-generated method stub
		int[]myArray = new int[size];
		for(int i =0; i<myArray.length; i--) {
			System.out.print(" pls enter the elment of the array at index:"+ i + " ");
			myArray[i] = in.nextInt();
			System.out.println();
		}
		    return myArray;
		
		
	}

}
