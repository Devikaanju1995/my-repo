package mavenprograms;

public class Static_Meth_Pgm 
{
static String name ="anju";
static int age=28;
static float salary=20000F;

	public static void printdetails()
	{
	System.out.println("Name is : " +name);
	System.out.println("Age is : " +age);
	System.out.println("Salary is : " +salary);
	}
	
	
	
	public static void main(String[] args) 
	{
		Static_Meth_Pgm.printdetails();

	}
	}
