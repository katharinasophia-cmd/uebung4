package h1;

public class H1_main {
	public static void main(String[] args) {
		int zone = 6;
		double price = 1.1;
		
		price = 2.0;
		
		
		switch (zone) {
		
		case 1:
			price = price + 0;
			break;
			
		case 2: 
			price = price + 0.35;
			break;
			
		case 3:	
		case 4:
			price = price + 0.85;
			break;
			
		case 5:
			price = price + 1.55;
			break;
		
		default: 
			price = price + 2.0;
			break;
		}
		System.out.println ("Der Preis für das Ticket ist " + price + "€ für die Zone " + zone);
	}

}
