package com.bridgelabz;

public class Duplicate {

	public void dup()
	{
		int[] a=new int[] {2,3,2,3,4,5,8,5};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println("Duplicate elements are : "+ a[i]);

				}
			}
		}
	}
	public static void main(String[] args) {
		Duplicate obj=new Duplicate();
		obj.dup();
	}
}
