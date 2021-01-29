package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String [] names = {"bob", "bobby", "bobalina", "bobbet", "bobert"};
		//2. print the third element in the array
		System.out.println(names[2]);
		//3. set the third element to a different value
		names[2] = "Henry";
		//4. print the third element again
		System.out.println(names[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		
		for(String name : names) {
			System.out.println(name);
		}
		
		//6. make an array of 50 integers
		int [] nums = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		for(int i =0; i<nums.length; i++) {
			Random x = new Random();
			nums[i] = x.nextInt();
		}
		
		int currentSmallest = Integer.MAX_VALUE;
		int currentLargest = Integer.MIN_VALUE;
		
		//8. without printing the entire array, print only the smallest number in the array
		for(int i = 0; i<nums.length; i++) {
			
			if (nums[i]<currentSmallest) {
				
				currentSmallest= nums[i];
				
			}
			
			if (nums[i] > currentLargest) {
				
				currentLargest = nums[i];
				
			}
			
			
		}
		//9 print the entire array to see if step 8 was correct
		System.out.println(currentSmallest);
		//10. print the largest number in the array.
		System.out.println(currentLargest);
	}
}
