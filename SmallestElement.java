package com.bridgelabz;

public class SmallestElement {

	public void small()
	{

		int a[]=new int[] {2,4,1,6,5};
		int min=a[0];
		for(int i=0;i<5;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("The min value is:"+ min);
	}
	public static void main(String[] args) {
		SmallestElement obj=new SmallestElement();
		obj.small();
	}
}
