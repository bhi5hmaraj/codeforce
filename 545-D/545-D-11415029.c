#include <stdio.h>
#include <stdlib.h>
			int findPos(int arr[],int start,int end)
	{
		int big_start=0;int big_end=-1;
		int temp=0;
		int i=0;
		for(i=start;i<end;i++)
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
			
			return end;
			
		}
		temp=arr[big_start];
		arr[big_start]=arr[end];
		arr[end]=temp;
		
		return big_start;
	}
		
		//for quickSort end is the ending Index
	 void quickSort(int arr[],int start,int end)  
	{
		if(start < end)
		
		{	
			int pivot=findPos(arr,start,end);
			quickSort(arr,start,pivot-1);
			quickSort(arr,pivot+1,end);
		}
	}

	int main()
	{
		
		
		int n;
		scanf("%d",&n);
		int * arr=(int*)malloc(sizeof(int)*n);
		int i=0;
		int count=0;
		int temp=0;
		for(i=0;i<n;i++)
		{
			scanf("%d",&arr[i]);
			if(temp == arr[i])
				count++;
			
			temp=arr[i];
		}
		if(count == n-1 && n>2)
		{
			printf("2");
			return 0;
		}

		quickSort(arr,0,n-1);
		int ct=1;
		int sum=arr[0];
		for(i=1;i<n;i++)
		{
			if(sum <= arr[i])
			{
				ct++;	
				sum+=arr[i];
			}
		}
		printf("%d",ct);
		
		return 0;
	}