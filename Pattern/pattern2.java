//Print a pyramid pattern like 
/*
Enter number : 5
1
2 1
3 2 1
4 3 2 1
5 4 3 2 1
 * 
 */

import java.util.*;

public class pattern2 {
    public static void main(String args[])throws Exception{
        int n;
        Scanner read=new Scanner(System.in);
        n=read.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j>0;j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();

        }
        read.close();

    }
}
