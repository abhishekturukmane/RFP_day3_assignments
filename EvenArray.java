package com.bridgelabz;

public class EvenArray {

	public void evenCheck()
	{
		int a[] =new int[] {2,4,3,5,6,9};
		System.out.println("The even numbers are:");
		for(int i=0;i<6;i++)
		{
			if(a[i]%2 ==0)
			{
				System.out.println(a[i]);
			}
		}
	}
	public static void main(String[] args) {
		EvenArray obj=new EvenArray();
		obj.evenCheck();
	}
}
