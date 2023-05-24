/*
Print a Pattern like

5
* 
* *
* * *
* * * *
* * * * *

*/


import java.util.*;

public class pattern{
    
    public static void main(String []args)throws Exception{
        int n;
        Scanner read =new Scanner(System.in);
        n=read.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                
            System.out.print("* ");

            };
        System.out.println("");
        };
        read.close();
        
    }
}
