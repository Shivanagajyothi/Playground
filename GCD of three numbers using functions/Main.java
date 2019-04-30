import java.util.Scanner;
public class Main{
  public static int fun(int a,int b)
  {int min=0,gcd=0;
    if(a<b)
      min=a;
      else
        min=b;
   while(min>=1)
   {
     if((a%min==0) && (b%min==0))
     {
       gcd=min;
       break;
     }
     min--;
   }
   return gcd;
  }
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int m=in.nextInt();
      int o=in.nextInt();
      int tmin=0,sgcd=0;
      int s=fun(n,m);
      if(s<o)
      tmin=s;
      else
        tmin=o;
   while(tmin>=1)
   {
     if((s%tmin==0) && (o%tmin==0))
     {
       sgcd=tmin;
       break;
     }
     tmin--;
   }
   System.out.println(sgcd);
  }
}