import java.util.*;
public class matrix
{
    public static void main(String args[])
    {
        int pos_i=0,pos_j=0;
        Scanner s1=new Scanner(System.in);
        int arr[][]=new int[5][5];
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                arr[i][j]=s1.nextInt();
                if(arr[i][j] == 1)
                {
                    pos_i=i;
                    pos_j=j;
                }
            }
         }
        int shift=(int)(Math.abs(pos_i-2)+Math.abs(pos_j-2));     
        System.out.print(shift);
    }
}