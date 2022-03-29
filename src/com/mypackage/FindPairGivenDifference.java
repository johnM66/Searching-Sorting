package com.mypackage;

import java.util.HashSet;
import java.util.Set;

public class FindPairGivenDifference {
	public static void main(String[] args) {
		int[] arr = { 1, 5, 2, 2, 2, 5, 5, 4 };
		int diff = 3;
			//O(n^2)
		/*for (int i = 0; i < arr.length; i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				int rem=diff+arr[i];
				if(arr[j]==rem) {
					System.out.println("Index found at - "+i+","+j);
					rem=0;
					
				}
			}
		}*/
		//O(n)
		findPair(arr,diff);
	}
	
	
	public static void findPair(int[] A, int diff)
    {
        // array is unsorted
 
        // take an empty set
        Set<Integer> set = new HashSet<>();
 
        // do for every array element
        for (int i: A)
        {
            // check if pair with the given difference `(i, i-diff)` exists
            if (set.contains(i - diff)) {
                System.out.println("(" + i + ", " + (i - diff) + ")");
            }
 
            // check if pair with the given difference `(i + diff, i)` exists
            if (set.contains(i + diff)) {
                System.out.println("(" + (i + diff) + ", " + i + ")");
            }
 
            // insert the current element into the set
            set.add(i);
        }
    }
}
