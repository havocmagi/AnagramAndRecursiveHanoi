import java.util.Scanner;

public class Anagram 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter the word: ");
		Scanner console = new Scanner(System.in);
		Anagram test=new Anagram();
		String word=console.next();
		test.anagramPrinter("",word);
	}
	public void anagramPrinter(String start, String end)
	{
		//base case
		if(end.length()==0||end.length()==1)
		{
			System.out.println(start+end);
		}
		else
		{
			for(int i=0;i<end.length();i++)
			{
				String newEnd=end.substring(0,i)+end.substring(i+1);
				anagramPrinter(start+end.charAt(i),newEnd);
			}
		}
	}
}
