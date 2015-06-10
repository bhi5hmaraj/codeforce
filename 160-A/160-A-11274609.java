import java.util.*;
public class twins
{
	static int call=0;
	static int findPos(int arr[],int start,int end)
	{
		call++;
		//System.out.print("Call="+call+" start="+start+" end="+end);
		int big_start=0;int big_end=-1;
		int temp=0;
		for(int i=start;i<end;i++)
		{
			if(arr[i] > arr[end])
			{
				 if(big_end == -1)
				 {
					 big_start=i;
					 big_end=i;
				 }
				else
				 {
					big_end++;
				 }		
			}
			else
			{
				if(big_end != -1)
				{
					temp=arr[i];
					arr[i]=arr[big_start];
					arr[big_start]=temp;
					
					big_end++;
					big_start++;
				}
			}
		}
		if(big_end == -1)
		{
			//System.out.println("pivot="+end);		
			return end;
			
		}
		temp=arr[big_start];
		arr[big_start]=arr[end];
		arr[end]=temp;
		//System.out.println("pivot="+big_start);
		return big_start;
	}
		
	
	static void quickSort(int arr[],int start,int end)
	{
		if(start < end)
		
		{	
			int pivot=findPos(arr,start,end);
			quickSort(arr,start,pivot-1);
			quickSort(arr,pivot+1,end);
		}
	}
	
	
	
	
	
	public static void main(String args[])
	{
		Scanner s1=new Scanner(System.in);
		int len=s1.nextInt();
		int arr[]=new int[len];
		int mine=0,remain=0,total=0,ct=len-1,coins=0;
		for(int i=0;i<len;i++)
		{
			arr[i]=s1.nextInt();
			total+=arr[i];
		}
		

		
		quickSort(arr,0,arr.length-1);
				
		remain=total;
		
		while(mine <= remain)
		{
			mine += arr[ct];
			coins++;
			remain=total-mine;
			ct--;
		}
		System.out.println(coins);
	}
	
}