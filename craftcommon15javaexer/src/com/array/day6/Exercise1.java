package com.array.day6;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]studAge = new int[5];//0-4
		studAge[0]= 23;
		studAge[1]= 33;
		studAge[2]= 43;
		studAge[3]= 25;
		studAge[4]= 30;
		
		
//		System.out.println(studAge[0]);
//		System.out.println(studAge[01]);
//		System.out.println(studAge[02]);
//		System.out.println(studAge[03]);
//		System.out.println(studAge[04]);
		
		
	    System .out.println("acccessing array element using for loop");
			

			for(int i=0; i<5; i++) {	
			System.out.println(studAge[i] + " ");
			
		System.out.println();	
		System.out.println("accesseing array element usingforeach");	
		}
		for(int elt: studAge) {
			System.out.println(elt + " ");
		}
	}

}
