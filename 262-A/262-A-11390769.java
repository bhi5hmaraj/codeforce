import java.util.*;
import java.io.*;
import java.math.*;
public class lucky 
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		int n=s1.nextInt();
		int max=s1.nextInt();
		int ct=0;
		int len;
		int roma=0;
		for(int i=1;i<=n;i++)
		{
			ct=0;
			String str=s1.next();
			len=str.length();
			for(int j=0;j<len;j++)
			{
				if(str.charAt(j)=='4' || str.charAt(j)=='7')
					ct++;
			}
			if(ct <= max)
				roma++;
		}
		System.out.print(roma);
	}
}