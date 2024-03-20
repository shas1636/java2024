import java.util.Scanner;

public class GetInputFromUserExample {

	public static void main(String[] args) {
		
		 int a,b; 
		 int sum;
		 //SCanner class is used to get the intput from Users,system.in is to get the input value 
		 Scanner inputFromUser = new Scanner(System.in);
		 System.out.println("Enter the First Number:");
		 //Geting the integer value from user and saving it to a variable
		 a = inputFromUser.nextInt();
		 System.out.println("Enter the Second Number");
		 b = inputFromUser.nextInt();
		 inputFromUser.close(); 
		 sum = a+b;
		 System.out.println("The Sum of Two Number Give from the User is - " +sum);
		 }
		 
		 
		 

	}


