package com.bridgelabz;

public class SecondLargest {

	public void sl()
	{
		int a[]=new int[] {2,4,8,9};
		int temp=0;
		//using sorting method
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("The second largest element: "+ a[1]);
	}
	public static void main(String[] args) {
		SecondLargest obj=new SecondLargest();
		obj.sl();
	}
}
