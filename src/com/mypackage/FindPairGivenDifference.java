package com.mypackage;

public class FindPairGivenDifference {
	public static void main(String[] args) {
		int[] arr = { 1, 5, 2, 2, 2, 5, 5, 4 };
		int diff = 3;

		for (int i = 0; i < arr.length; i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				int rem=diff+arr[i];
				if(arr[j]==rem) {
					System.out.println("Index found at - "+i+","+j);
					rem=0;
					
				}
			}
		}
	}

}
