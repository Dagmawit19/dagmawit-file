package com.array.day6;

public class Exercise2 {
	public static void main(String[]args) {
		 
	  //declaring and initializing array
	 String[] studentName = new String[] {"jamie","abel","betty","john"};//sized =4,index =0-3
	  
//	  String[]StudentName = {"jamie","abel","betty","john"}; //sized =4 ,index =0-3
	  
	  
	  //inserting date to the array
//    studentName[0]="jamie";
//	  studentName[1]="abel";
//	  studentName[5]= "betty";
//	  
	  //accessing array element using foreach
	  for(String elt: studentName) {
		  System.out.println (elt);
	  }
			  
	}
}
