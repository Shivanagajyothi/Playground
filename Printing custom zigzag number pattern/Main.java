import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int i,j,k;
      for(i=1;i<=n;i++)
      {
        if(i%2==1)
        {for(k=1;k<=n-1;k++)
        {System.out.print(i);
        }
         System.out.print(i+1);
        }
        else
        {
          System.out.print(i+1);
          for(k=1;k<=n-1;k++)
          {
            System.out.print(i);
          }
        }
          System.out.print("\n");
      }
	}
}