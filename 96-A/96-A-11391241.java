import java.util.*;
public class football
{
	public static void main(String args[])
	{
		Scanner s1=new Scanner(System.in);
		String str=s1.next();
		if(str.indexOf("0000000")>=0 || str.indexOf("1111111")>=0)
			System.out.print("YES");
		else
			System.out.print("NO");
	}
}