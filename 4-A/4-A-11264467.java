import java.util.*;
public class codeforce
{
    public static void main(String args[])
    {
        Scanner stdin=new Scanner(System.in);
        int n=stdin.nextInt();
        if(n%2 == 0 && n>=4)
        System.out.println("YES");
        else
        System.out.println("NO");
    }
}