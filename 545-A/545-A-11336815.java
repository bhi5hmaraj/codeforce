import java.util.*;
public class toycar
{
	public static void main(String args[])
	{
		Scanner s1=new Scanner(System.in);
		int len=s1.nextInt();
		int arr[][]=new int [len][len];
		for(int i=0;i<len;i++)
		{
			for(int j=0;j<len;j++)
			{
				arr[i][j]=s1.nextInt();
			}
		}

		boolean good[]=new boolean[len];
		for(int i=0;i<len;i++)
		{
			for(int j=0;j<len;j++)
			{
				if(arr[i][j] > 0)
				{
					if(arr[i][j] == 1)
					{
						good[i]=true;
						
					}
					else if(arr[i][j] == 2)
					{
						good[j]=true;
						
					}
					else
					{
						good[i]=true;
						good[j]=true;
					
					}
				}
			}
		}
		int ct=0;
		for(int i=0;i<len;i++)
			if(good[i]==false)
				ct++;
	if(ct==0)
	System.out.print(ct);
	else
	{
		System.out.println(ct);
		for(int i=0;i<len;i++)
			if(good[i]==false)
				System.out.print((i+1)+" ");
	}
	}
}