package com.bridgelabz;

import java.util.Arrays;

public class LargestElement {

	public void large()
	{
		int a[]= {2,3,4,1,8,5};
		
		System.out.println("The elements are:");
		
		for(int i=0;i<6;i++)
		{
			System.out.println(a[i]+ " ");
		}
		
		System.out.println("Printing in single line:");
		System.out.println(Arrays.toString(a)); // to Arrays.tostring(arrayname) is used to print in singleline
	}
	public void max()
	{
		int a[]= {2,3,4,1,8,5};
		int max=a[0];
		for(int i=0;i<6;i++)
		{
			
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("The max element is :"+ max);
	}
	public static void main(String[] args) {
		LargestElement obj= new LargestElement();
		obj.large();
		obj.max();
		
		
	}
}
