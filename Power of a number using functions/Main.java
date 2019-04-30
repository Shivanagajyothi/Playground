import java.util.Scanner;
class Main
{
  public static int fun1(int a,int b)
  { int ans=1;
   for(int i=0;i<b;i++)
   {
     ans=ans*a;
   }
       return ans;
  }
	public static void main (String[] args)
    {
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int m=in.nextInt();
      int res;
      res=fun1(n,m);
        System.out.println(res);
	}
}