package mavenprograms;

public class OverloadingProgram {

	
		
			static int a=30;
			static int b=20;

			
			
		public static void calculator()
			{
				int c=a+b;
				System.out.println("SUM IS : "+c);
			}


		public static void calculator(int a,float b)
		{
			float sum=a-b;
			System.out.println("DIFFERENCE IS : " +sum);
		}


		
			public static void main(String[] args) 
			{
				 OverloadingProgram .calculator();
				 OverloadingProgram .calculator(100,50.5F);
				
			}

		}


	


