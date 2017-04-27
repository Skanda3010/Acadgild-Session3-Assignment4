import java.util.Scanner;

public class BasicCalculatorAssignment4 {
	
	public static void main(String[] args) {
		
		ReferenceClass refClass = new ReferenceClass();
		System.out.println("Entered main function");
		String Operator;
		
		System.out.println("Enter the first number or divisor.");
		Scanner sc = new Scanner(System.in);
		refClass.setNum1(sc.nextInt());
		
		System.out.println("Enter the second number of dividend.");
		refClass.setNum2(sc.nextInt());
		System.out.println();
		
		System.out.println("Enter the operation that has to be performed among +,-,* and /");
		Operator=sc.next();
		sc.close();
		
		switch(Operator)
		{
			case "+": System.out.println("The sum of given 2 numbers is : "+refClass.sumOf2N(refClass.getNum1(), refClass.getNum2()));
						break;
			case "-": System.out.println("The difference of given 2 numbers is : "+refClass.diffOf2N(refClass.getNum1(), refClass.getNum2()));
						break;
			case "*": System.out.println("The product of given 2 numbers is : "+refClass.prodOf2N(refClass.getNum1(), refClass.getNum2()));
						break;
			case "/": System.out.println("The Division of given 2 numbers is : "+refClass.divisionOf2N(refClass.getNum1(), refClass.getNum2()));
						break;
			default:	System.out.println("The given operator is not among the mentioned one. please enter a valid operator");
		}
	}

}
