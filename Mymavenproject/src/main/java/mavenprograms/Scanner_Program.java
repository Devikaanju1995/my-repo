package mavenprograms;
import java.util.Scanner;
public class Scanner_Program 
{

	public static void main(String[] args) 
	{
     //int a;
     Scanner abc=new Scanner(System.in);
    System.out.println("ENTER A NUMBER");
    int num=abc.nextInt();
    if(num%2==0)
    {
    	System.out.println("it  is even ");
    }
    else
    {
    	System.out.println("it is odd");
    }
	}

}
