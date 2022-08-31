package com.array.day6;

public class Exercisee3 {
	
	public static void main(String[]args) {
		
		double[]studMark = {67.5,78,80,95.9,55,77};
		
		
		System.out.println("accessing array using for loop");
		
		
		for (int i=0; i<studMark.length; i++) {
			System.out.println(studMark[i] + " ");
			
		}
		
		System.out.println();
		
		System.out.println("accessing array using foreach");
		for(double elt: studMark) {
			System.out.print(elt + " ");
		}
		   System.out.println();
		   
		System.out.println("accessing array in revers order");
		for(int i=studMark.length-1; i>=0;i--) {
			System.out.print(studMark[i]+" ");
		}
	
	}

	
		
	

}
