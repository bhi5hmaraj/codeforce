import java.io.*;
public class present
{
	public static void main(String args[])
	{
		try
		{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int rows=(2*n)+1;
		int space=0,mid=0;
		for(int i=1;i<=rows;i++)
		{
			if(i <= n)
				space=2*(n-i+1);
			else
				space=2*(i-n-1);
			
			for(int j=1;j<=space;j++)
				System.out.print(" ");
			
			if(i <= (n+1))
				mid=i-1;
			else
				mid--;
			
			for(int k=0;k<(2*mid)+1;k++)
			{
				if(k==(2*mid))
					System.out.print(((2*mid)-k));				
				
				else if(k <= mid)
					System.out.print(k+" ");
				else
				{
					System.out.print(((2*mid)-k)+" ");
				}
			}
			System.out.println();
		}
		}
		
		catch(Exception e)
		{
			System.out.print("Invalid input exception: "+e.getMessage());
		}

	}
}