package h3;

public class H3_main {
	public static void main(String[] args) {
		
		float celsiusFloat = 14.2f;
		float fahrenheitFloat = 18.7f;
		double celsiusDouble = 14.2;
		double fahrenheitDouble = 42.0;
		
		fahrenheitFloat = celsiusFloat * 9/5 + 32;
		
		fahrenheitDouble = celsiusDouble * 9/5 + 32;
		
		
		
		System.out.println ("Celsius Float = " + celsiusFloat);
		System.out.println ("Fahrenheit Float = " + fahrenheitFloat);
		
		System.out.println ("Celsius Double = " + celsiusDouble);
		System.out.println ("Fahrenheit Double = " + fahrenheitDouble);
		
	}

}
