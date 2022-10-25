package com.bridgelabz;

public class PrintElements {

	
	public void Print()
	{
		int[] a= {2,3,45,89,30};
		
		System.out.println("The elements are :");

		for(int i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}
		
	}
	public static void main(String[] args) {
		PrintElements obj=new PrintElements();
		obj.Print();
		
	}
}
