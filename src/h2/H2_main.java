package h2;

public class H2_main {
	
	public static void main(String[] args) {
		
		boolean x = true;
		boolean y = false;
		boolean a = true;
		boolean b = false;
		boolean c = true;
		
		int input = 0;
		
		x = false;
		y = false;
		
		switch (input ) {
		case 10:
			x = true;
			break;
			
		case 11:
			x = true;
	        y = true;
	        break;
	        
		case 1:
			y = true;
			break;
		}
		
		System.out.println ("x " + x);
		System.out.println ("y " + y);
		
		if (x == true && y ==true) {
			a = true;
		}
			else {
				a = false;
		}
		
		if (x == true || x != y) {
			b = true;
		}
		else {
			b = false;
		}
		
		if (x == true && y == false) {
			c = true;
		}
		if ( x == false && y == false) {
			c = true;
		}
		if (x == true && y == true) {
			c = false;
		}
		if (x == false && y == true) {
			c = false;
		}
		
		
		System.out.println ("a " + a);
		System.out.println ("b " + b);
		System.out.println ("c " + c);
	}
	

}
