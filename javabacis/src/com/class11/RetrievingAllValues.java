package com.class11;

public class RetrievingAllValues {
public static void main(String[] args) {
	
	int [][] num= {
			{11,12,13,14},
			{21,22,23,24},
			{31,32,33,34}
	};
	
	
	int rows=num.length;
	System.out.println(rows);
	
	int cols=num[2].length;
	System.out.println(cols);

	System.out.println("-------------------");
	for(int row=0; row<num.length; row++) {
		for(int col=0; col<num[row].length; col++) {
			System.out.println(num[row][col]);
		}
	}
	
}
}
