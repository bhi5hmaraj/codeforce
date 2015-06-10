import java.util.*;
public class codeforce
{
    public static void main(String args[])
    {
        Scanner stdin=new Scanner(System.in);
        int m=stdin.nextInt();
        int n=stdin.nextInt();
        int a=stdin.nextInt();
        long output=((long)Math.ceil((double)n/a))*((long)Math.ceil((double)m/a));
        System.out.println(output);
    }
}