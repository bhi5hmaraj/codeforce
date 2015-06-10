import java.util.*;
public class hq
{
	public static void main(String args[])
	{
		Scanner s1=new Scanner(System.in);
		String str=s1.next();
		char ch;
		int len=str.length();
		for(int i=0;i<len;i++)
		{
			ch=str.charAt(i);
			if(ch=='H' ||ch=='Q' || ch=='9')
			{
				System.out.print("YES");
				return;
			}
		}
		System.out.print("NO");
	}

}