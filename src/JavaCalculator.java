
public class JavaCalculator {
	int num1;
	int num2;
	
	public static int add(int num1, int num2) {
		return num1+num2;
	}
	
	public static int subtract(int num1, int num2) {
		return num1-num2;
	}
	
	public static double multiply(int num1, int num2) {
		return num1*num2;
	}
	
	public static float divide (float num1, float num2) {
		return num1/num2;
	}
	
	public static double square (int num1) {
		return num1*num1;
	}
	
	
	public static void main(String[] args) {
		System.out.println("Addition:");
		System.out.println(add(1,3));
		
		System.out.println("\nSubtraction:");
		System.out.println(subtract(5, 4));
		System.out.println(subtract(4, 5));
		
		System.out.println("\nMultiplication:");
		System.out.println(multiply(2,5));
		System.out.println(multiply(15, 23));
		System.out.println(multiply(0, 12000));
		
		System.out.println("\nDivision:");
		System.out.println(divide(1,4));
		System.out.println(divide(20, 5));
//		System.out.println(divide(10, 0)); fails as expected!
		
		System.out.println("\nSquaring:");
		System.out.println(square(5));
		System.out.println(square(25));
	}

}
