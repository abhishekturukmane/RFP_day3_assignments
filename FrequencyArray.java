package com.bridgelabz;

public class FrequencyArray {

	public void Freq()
	{
		
		int[] a=new int[] {2,3,4,2,3};
		int[] visitedArr=new int[a.length];
		int visited=-1; //if visited it will mark as -1 so as not to count again
		for(int i=0;i<a.length;i++)
		{
			int count=1;
			for(int j=i+1;j<a.length;j++)
			{
				
				if(a[i]==a[j])
				{
					count++;
					visitedArr[j]=visited;//if value of j=2 found again then it will be marked -1
				
				}
				
			}
			//put the value of count to a[i] incase if value of i is not marked
			if(visitedArr[i]!=visited)
			{
				visitedArr[i]=count;
			}
		}
		
		//print the loop visitedArr
		
		for(int i=0;i<visitedArr.length;i++)
		{
			if(visitedArr[i]!=visited)
			{
				System.out.println("Freq "+ a[i]+" : " +visitedArr[i]);
			}
		}
	}

	public static void main(String[] args) {
		FrequencyArray obj=new FrequencyArray();
		obj.Freq();
	}
}
