import java.util.Scanner;
class Main {
	public static void main (String[] args){
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int f=0;
      int l=n%10;
      while(n>=1)
      {
        f=n;
       n=n/10;
      }
      int sum=f+l;
      System.out.println(sum);
	    // Type your code here
	}
}