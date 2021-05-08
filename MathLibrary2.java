package mathformulas;
import java.util.Scanner; 
import java.text.DecimalFormat; 
public class MathLibrary2
{
	static DecimalFormat df = new DecimalFormat("#.##"); 
	static Scanner sca = new Scanner(System.in); 
	public static void main(String[] args) 
	{
		//Variable and Scanner 
		double a = 0, b = 0, c = 0, x1 = 0, x2 = 0, y1 = 0, y2 = 0, ans1 = 0, ans2 = 0, num1, num2, num3; 
		int choice = 1; 
		int num11, num22; 
		
		while(choice != 0)
		{
			System.out.println("Hey! Which math formula would you like to use? \n1: Quadratic Formula \n2: Distance Formula \n3: Midpoint Formula \n4: Find leg \n5: Find hypotenuse \n6: Addition \n7: Subtraction \n8: Multiplication \n9: Division \n10: Squaring a number \n11: Num to a pow \n12: LCM \n13: GCF \n14: Exit" );
			choice = sca.nextInt(); 
			switch(choice)
			{
				case 1:
				choice = 1; 
				quadform(a, b, c, ans1, ans2); 
				break; 
				
				case 2: 
				choice = 1; 
				distanceform(x1,x2,y1,y2);  
				break; 
				
				case 3:
				choice = 1; 
				midpointform(x1,x2,y1,y2); 
				break; 	
				
				case 4: 
				choice = 1; 
				System.out.print("Input the length of the known leg here: "); 
				a = sca.nextDouble(); 
					
				System.out.print("Input the length of the hypotenuse here: "); 
				c = sca.nextDouble(); 
					
				pythagleg(a, c); 
				break;
					
				case 5:
				choice = 1;
				System.out.print("Input the length of one leg here: "); 
				a = sca.nextDouble(); 
					
				System.out.print("Input the length of the other leg here: "); 
				b = sca.nextDouble(); 
					
				pythaghypo(a, b); 
				break;  
				
				case 6: 
					choice = 1; 
					System.out.println("Enter a number"); 
					num1 = sca.nextDouble(); 
					
					System.out.println("Enter another number.");
					num2 = sca.nextDouble(); 
					
					num3 = num1 + num2; 
					System.out.println("The answer is: " + num3);
					
					break; 
					
				case 7:
					choice = 1; 
					System.out.println("Enter a number"); 
					num1 = sca.nextDouble(); 
					
					System.out.println("Enter another number.");
					num2 = sca.nextDouble(); 
					
					num3 = num1 - num2; 
					System.out.println("The answer is: " + num3);
					break; 
					
				case 8: 
					choice = 1; 
					System.out.println("Enter a number"); 
					num1 = sca.nextDouble(); 
					
					System.out.println("Enter another number.");
					num2 = sca.nextDouble(); 
					
					num3 = num1*num2; 
					System.out.println("The answer is: " + num3);
					break; 
					
				case 9:
					choice = 1; 
					System.out.println("Enter a number"); 
					num1 = sca.nextDouble(); 
					
					System.out.println("Enter another number.");
					num2 = sca.nextDouble(); 
					
					num3 = num1/num2; 
					System.out.println("The first number divided by the second number is: " + num3);
					break; 
					
				case 10:
					choice = 1; 
					System.out.println("Enter the number you want to square: ");
					num1 = sca.nextDouble(); 
					
					System.out.println(num1 + " squared is " + Math.pow(num1,2));
					break; 
					
				case 11: 
					choice = 1; 
					System.out.println("Enter the number you want to get powered ");
					num1 = sca.nextDouble(); 
					
					System.out.println("Ok now to what power my guy? ");
					num2 = sca.nextDouble(); 
					
					System.out.println(num1 + " to the " + num2 + " is" + Math.pow(num1, num2)); 
					break; 
				
				case 12: 
					System.out.println("Enter a number: ");
					num11 = sca.nextInt(); 
					
					System.out.println("Enter another number: ");
					num22 = sca.nextInt(); 
					
					ans1 = lCm(num11, num22); 
					
					System.out.println("LCM: " + ans1);
				break; 
				
				case 13: 
					System.out.println("Enter a number: ");
					num11 = sca.nextInt(); 
					
					System.out.println("Enter another number: ");
					num22 = sca.nextInt(); 
					
					ans1 = gCf(num11, num22); 
					
					System.out.println("gCf: " + ans1);
				break; 
						
				case 14: 
					choice = 0; 
					System.out.println("Thank you for using this program. Bye.");
					break;
		
				default: 
				choice = 0; 
				System.out.println("You messed up. Please do it right next time.");
				break; 
			}
			
			
		}

	}
	//method for finding the leg for the triangle 
		public static void pythagleg(double a, double c)
		{
			double b = Math.sqrt(Math.pow(c,2) - Math.pow(a,2)); 
			System.out.println("b = " + df.format(b));
		}
		
		//method for finding the hypo of the triangle 
		public static void pythaghypo(double a, double b) 
		{
			double c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
			System.out.println("c = " + df.format(c));
		}
		
		//method for quadratic formula 
		public static void quadform(double a, double b, double c, double ans1, double ans2) 
		{
			
			System.out.println("Please input the value of a here: ");
			a = sca.nextDouble();
			
			System.out.println("Please input the value of b here: ");
			b = sca.nextDouble();
			
			System.out.println("Please input the value of c here: ");
			c = sca.nextDouble();
			 
			double discriminant = (Math.pow(b,2) - 4*a*c);
			if(discriminant > 0)
			{
			
				ans1 = (-b + Math.sqrt(discriminant)) / (2*a); 
				ans2 = (-b - Math.sqrt(discriminant)) / (2*a); 
				
				System.out.println("x1 = " + df.format(ans1));
				System.out.println("or");
				System.out.println("x2 = " + df.format(ans2)); 
				System.out.print("Do your own homework next time. "); 
			}
			else if(discriminant ==0) 
			{
				ans1 = (-b + Math.sqrt(discriminant)) / (2*a); 
				ans2 = (-b - Math.sqrt(discriminant)) / (2*a); 
				
				System.out.println("x = " + df.format(ans1));
			}
			else 
			{
				
				System.out.println("x1 = "  + -b + " + " + df.format(Math.sqrt(-discriminant)) + "i/" + 2*a);
				System.out.println("or");
				System.out.println("x2 = " + -b + " - " + df.format(Math.sqrt(-discriminant)) + "i/" + 2*a); 
				System.out.print("Do your own homework next time. "); 
			}
			
		}
		public static void distanceform(double x1, double x2, double y1, double y2)
		{
			
			System.out.println("What is the x1 value?"); 
			x1 = sca.nextDouble(); 
			
			System.out.println("What is the x2 value?");
			x2 = sca.nextDouble(); 
			
			System.out.println("What is the y1 value?");
			y1 = sca.nextDouble(); 
			
			System.out.println("What is the y2 value?");
			y2 = sca.nextDouble(); 
			sca.close(); 
			
			System.out.println("You answer is: " + Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1)));
		}
		public static void midpointform(double x1, double x2, double y1, double y2)
		{
			System.out.println("What is the x1 value?"); 
			x1 = sca.nextDouble(); 
			
			System.out.println("What is the x2 value?");
			x2 = sca.nextDouble(); 
			
			System.out.println("What is the y1 value?");
			y1 = sca.nextDouble(); 
			
			System.out.println("What is the y2 value?");
			y2 = sca.nextDouble(); 
			
			System.out.println("The values of the midpoint are:" + "(" + (x1 + x2) / 2 +  "," + (y1 + y2) / 2 + ")"); 
		}
		public static int lCm(int a, int b)
		{
			int lcm = 0; 
			int gcf = 0; 
			gcf = gCf(a, b); 
			
			lcm = (a*b)/gcf;  
			
			return lcm; 
		}
		public static int gCf(int a, int b)
		{ 	
			int gcf = 0;
			for(int i = 1; i <= a; i++)
			{
				if(a % i == 0 && b % i == 0)
				{
					gcf = i;
				}
			}
			return gcf; 
		}
}		
