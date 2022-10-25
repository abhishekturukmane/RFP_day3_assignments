package com.bridgelabz;

import java.util.Arrays;

public class ReverseArray {

	public void RA()
	{
		int[] a= new int[] {2,3,4,5,6};
		//print original array
		System.out.println("original Array : ");
       for(int i=0;i<a.length;i++)
       {
   		System.out.println(a[i]+ " ");

       }
		//reverse order
	   System.out.println("Reverse Array : ");

		for(int j=a.length-1;j>=0;j--)
		{
			System.out.println(a[j]+ " ");
		}
	}
	public static void main(String[] args) {
		ReverseArray obj=new ReverseArray();
		obj.RA();
	}
}
