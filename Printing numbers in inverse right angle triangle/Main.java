import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
       Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int num=n;
      for(int r=1;r<=n;r++)
      {int m=num;
        for(int c=1;c<=num;c++)
        {
          System.out.print(m);
          m--;
        }
        
        System.out.print("\n");
        num=num-1;
      }
	}
}