import java.util.Scanner;

public class RecursiveHanoi 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter # of discs: ");
		Scanner console = new Scanner(System.in);
		RecursiveHanoi test=new RecursiveHanoi();
		int n=console.nextInt();
		test.hanoiSolver(n,"A","B","C");
	}
	public void hanoiSolver(int n, String first, String middle, String last)
	{
		//base case
		if(n==1)
		{
			System.out.println(first+" -> "+last);
		}
		/*
		 * n>1
		 * move n-1 discs from first to middle pole<-recursive
		 * move the last disc from first to last pole
		 * move n-1 discs from middle to last pole<-recursive
		 */
		else if(n>1)
		{
			hanoiSolver(n-1,first,last,middle);
			System.out.println(first+" -> "+last);
			hanoiSolver(n-1,middle,first,last);
		}
		else
			System.err.println("Wrong input");	
	}
}
