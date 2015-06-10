import java.util.*;
public class amr_and_music
{
	public static void main(String args[])
	{
		Scanner s1=new Scanner(System.in);
		int n=s1.nextInt();
		int k=s1.nextInt();
		int temp_k=k;
		int ct=0,flag=0;
		struct arr[]=new struct[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=new struct();
			arr[i].data=s1.nextInt();
			arr[i].pos=i+1;
		}
		quickSort(arr,0,n-1);
		String output="";
		for(int i=0;i<n;i++)
		{
			temp_k=temp_k-arr[i].data;
			if(temp_k>=0)
			{
				flag=1;				
				ct++;
				output+=arr[i].pos+" ";
			}
			else
			{
				if(flag ==0)
				{
					System.out.print("0");
					return;
				}
				break;
			}
		}
		System.out.println(ct);
		System.out.print(output);

	}
	



	static int findPos(struct arr[],int start,int end)
	{
		int big_start=0;int big_end=-1;
		int temp=0;
		for(int i=start;i<end;i++)
		{
			if(arr[i].data > arr[end].data)
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
					temp=arr[i].data;
					arr[i].data=arr[big_start].data;
					arr[big_start].data=temp;

					temp=arr[i].pos;
					arr[i].pos=arr[big_start].pos;
					arr[big_start].pos=temp;					

					big_end++;
					big_start++;
				}
			}
		}
		if(big_end == -1)
		{
			
			return end;
			
		}
		temp=arr[big_start].data;
		arr[big_start].data=arr[end].data;
		arr[end].data=temp;

		temp=arr[big_start].pos;
		arr[big_start].pos=arr[end].pos;
		arr[end].pos=temp;		
		return big_start;
	}
		
	
	static void quickSort(struct arr[],int start,int end)
	{
		if(start < end)
		{	
			int pivot=findPos(arr,start,end);
			quickSort(arr,start,pivot-1);
			quickSort(arr,pivot+1,end);
		}
	}
}
class struct
{
	int data;
	int pos;
}