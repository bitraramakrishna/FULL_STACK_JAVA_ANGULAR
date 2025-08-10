package com.wipro.basic;

public class ArrayDemo {
	public static void main(String[] args)
	{
		/*int arr[]= {1,2,3,4};
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);//print array
			
			
		}
		for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 2; 
        }

        System.out.println("\nNew values twice the older value:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("numbers[" + i + "] = " + arr[i]);
        }
		
		int[] arr1 = {10, 5, 20, 8, 15};

      

        if (arr1 == null || arr1.length < 2) {
            System.out.println("Output: Array must contain at least two elements.");
        } else {
            int largest = arr1[0];
            int secondLargest = arr1[0];

            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] > largest) 
                {
                    secondLargest = largest;
                    largest = arr1[i];
                } 
                else if (arr1[i] > secondLargest && arr1[i] != largest) 
                {
                    secondLargest = arr1[i];
                }
            }

            if (secondLargest == largest) {
                System.out.println("No distinct second largest element found");
            } else {
                System.out.println("Output: " + secondLargest);
            }
        }
    }
		
		
		int[] arr = {1, 1, 2, 2, 3, 4, 4, 5};

       int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j];
            }
        }
        System.out.print("length of the array " + (i+1) );
        for (int k = 0; k <= i; k++) {
            System.out.print(arr[k]);
            if (k < i) {
            	 
                System.out.print(" "); 
            }
        }
       
		
		int[] arr = {2, 5,2, 11, 15};
        int target = 9;

        boolean found = false;
        for (int i = 0; i < arr.length; i++) 
        {
            for (int j = i + 1; j < arr.length; j++) 
            {
                if (arr[i] + arr[j] == target) 
                {
                    System.out.println("[" + i + ", " + j + "]");
                    found = true;
                    break;
                }
            }
            if (found) 
            {
                break;
            }
        }
		
		  int[] arr = {2, 7, 11, 15}; 
	        int target = 9;

	        int left = 0;
	        int right = arr.length - 1;

	        while (left < right) {
	            int currentSum = arr[left] + arr[right];

	            if (currentSum == target) 
	            {
	                System.out.println("[" + left + ", " + right + "]");
	                return; 
	            } 
	            else if (currentSum < target)
	            {
	                left++;
	            } 
	            else 
	            { 
	                right--;
	            }
	        }
----->		int[] arr= {2, 7, 11, 15};
	    int target=9;
	    int[] output= {0,0};
	    
		
		for(int i=0;i<arr.length;i++)
		{
			if(((i+1)<arr.length)&&(arr[i]+arr[i+1]==target))
			{
				
			
				output[0]=i;
				output[1]=i+1;
			}
			
		}
	
		System.out.println(output[0]output[1]);
 */
		
		int[] arr = {1, 2, 3, 4, 5};

        for (int i = 0; i < arr.length / 2; i++) 
        {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k]);
            if (k < arr.length - 1) {
                System.out.print(" ");
            }
        }
       
    }
	

}
