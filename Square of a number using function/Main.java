import java.util.Scanner;
class Main
{public static int fun1(int m)
  { int square=0,count=1;
    while(count<=2)
    {
    square=m*m;
      count++;
    }
   return square;
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