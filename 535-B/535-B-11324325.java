import java.util.*;
import java.math.*;
public class lucky
{
	public static void main(String args[])
	{
		Scanner s1=new Scanner(System.in);
		String str=s1.next();
		int n=0;
		int len=str.length();

			for(int i=0;i<len;i++)
			{
				if(str.charAt(i) == '7')
					n+=Math.pow(2,(len-1-i));
			}

		n+=(Math.pow(2,len))-1;
		System.out.print(n);
	}
}