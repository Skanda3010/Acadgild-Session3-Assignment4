import java.util.Random;

public class ReferenceClass {

	private int num,count=0,num1,num2;
	private float result;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public float getResult() {
		return result;
	}
	public void setResult(float result) {
		this.result = result;
	}
	
	//method to calculate the square root of a given number
	public float sqrtCalculate(int num){
		result = (float) Math.sqrt(num);
		return result;
	}
	
	//method to calculate the cube root of a given number
	public float cubeCalculate(int num){
		result = (float) Math.cbrt(num);
		return result;
	}
	
	//method to check whether the given number is Prime
	public boolean isPrime(int num){
	
		for(int i=1;i<=num;i++)
		{
			if((num%i)==0)
				count++;
		}
		
		if(count==2)
			return true;
		else
			return false;
	}
	
	//method to calculate Random number between 0 and (n-1)
	public int randNum(int num){
		Random r = new Random();
		int ans;
		ans = r.nextInt(num);
		return ans;
	}
	
	//Basic Calculator
	
	//getter and setters for calculator variables
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	//method to calculate the sum of 2 numbers
	public int sumOf2N(int num1,int num2){
		int sum=0;
		sum= num1+num2;
		return sum;
	}
	
	//method to calculate the difference of 2 numbers
	public int diffOf2N(int num1,int num2){
		int diff;
		if(num1>num2)
			diff= num1-num2;
		else
			diff = num2-num1;
		return diff;
	}
	
	//method to calculate the difference of 2 numbers
	public int prodOf2N(int num1,int num2){
		int product;
		product = num2*num1;
		return product;
	}
	
	//method to calculate the difference of 2 numbers
	public int divisionOf2N(int num1,int num2){
		int divide;
		divide = num1/num2;
		return divide;
	}
	
		
}
