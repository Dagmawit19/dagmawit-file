package com.array.day6;

public class Exercise6 {
	
	public static void main(String[] args) {
		
		double[][]studMark = {
				{67.5,78,88,95.9,55,77,100,81,67,83},
		        {59,78,80,95.9,75,77,90,81,67,88},
		        {75,78,80,59,55,77,100,81,67,78}
	          };
		
		for (int i=0; i<3; i++) {
			
			for(int k =0;k<10; k++) {
				
			
				System.out.print(studMark[i][k]);
		}
		
		System.out.println(); 
	}
		
		
	}
	
}


