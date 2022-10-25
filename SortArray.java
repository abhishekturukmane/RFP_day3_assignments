package com.bridgelabz;

public class SortArray {

	public void sort()
	{
		int[] a=new int[] {8,2,4,1};
		System.out.println("original array:");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
		//sort in ascending order
		System.out.println("sorted array: ");
		int temp=0;
		//int i=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}

			}
			System.out.println(a[i]);

				
		}
		
	}
	public static void main(String[] args) {
		SortArray obj=new SortArray();
		obj.sort();
	}
}
