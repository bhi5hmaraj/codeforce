import java.util.*;
public class horseshoe
{
	public static void main(String args[])
	{
		Scanner s1=new Scanner(System.in);
		long arr[]=new long [4];
		for(int i=0;i<4;i++)
		arr[i]=s1.nextLong();
		int ct=0;
		for(int i=0;i<3;i++)
		{
			if(arr[i] != 0)
			{
			for(int j=i+1;j<4;j++)
			{
				if(arr[i] == arr[j])
				{
					arr[j]=0;
					ct++;
				}
			}
		}
	}
			System.out.print(ct);
		}
	}