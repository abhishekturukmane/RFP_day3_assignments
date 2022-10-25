package com.bridgelabz;

public class oddArray {

	public void oddCheck()
	{
		int a[]=new int[] {2,5,39,4,1,99};
		System.out.println("The odd numbers are:");
		for(int i=0;i<6;i++)
		{
			if(a[i]%2!=0)
			{
				System.out.println(a[i]);
			}
		}
		
	}
	public static void main(String[] args) {
		oddArray obj=new oddArray();
		obj.oddCheck();
	}
}
