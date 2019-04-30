import java.util.Scanner;
class Main{
  public static int fun1(int m)
  { int sum=0,count=1;
    while(m>0)
    {
    sum=sum+count;
      count++;
      m=m-1;
    }
   return sum;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int result=0;
      result=fun1(n);
      System.out.println(result);
      
	}
}