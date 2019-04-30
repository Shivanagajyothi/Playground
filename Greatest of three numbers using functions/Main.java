import java.util.Scanner;
class Main{
      public static int fun(int a,int b)
      {
        int store=0;
        if(a<b)
          store=b;
        else
          store=a;
        return store;
      }
      public static void main (String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int o=in.nextInt();
        int c=fun(n,m);
        if(c>o)
          System.out.println(c);
        else
          System.out.println(o);
      }
	}