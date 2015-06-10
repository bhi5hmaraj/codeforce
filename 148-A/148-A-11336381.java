import java.io.*;
public class insomniaTLE
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int k=Integer.parseInt(br.readLine());
		int l=Integer.parseInt(br.readLine());
		int m=Integer.parseInt(br.readLine());
		int n=Integer.parseInt(br.readLine());
		int d=Integer.parseInt(br.readLine());
		int punched=0;
		for(int i=1;i<=d;i++)
		{
			if(i%k==0 || i%l==0 || i%m==0 || i%n==0)
				punched++;
		}
		System.out.print(punched);
	}
}