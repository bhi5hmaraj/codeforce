import java.util.*;
public class team
{
	public static void main(String args[])
	{
		Scanner s1=new Scanner(System.in);
		int n=s1.nextInt();
		
		String str="";
		int ct=0,a,b,c;
		int known=0;
		for(int i=0;i<n;i++)
		{
			ct=0;
			a=s1.nextInt();
			b=s1.nextInt();
			c=s1.nextInt();
			//System.out.println("input= "+str);
			if(a == 1)
				ct++;
			if(b == 1)
				ct++;
			if(c == 1)
				ct++;
			
			if(ct >= 2)
				known++;
		}
		System.out.println(known);
	}
}