import java.util.Scanner;

public class YourChange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double temp = 0;
		double price = 0;
		double payed = 0;
		double change = 0;
		int notes  = 0;
		double coinstemp = 0;
		int coins = 0;

		System.out.println("Please enter the amount of purchase"+
							"(as decimal): ");
		price = sc.nextDouble();
		System.out.println("Please pay (as decimal): ");
		payed = sc.nextDouble();
		change = payed - price;
		
		
		notes = (int) change;
		coinstemp = (change - notes);
		coinstemp = coinstemp*100;
		coins = (int) coinstemp;		
		
		System.out.println("Please take your notes: ");
		
		System.out.println("50: "+notes/50+"\n20: "+(notes%50)/20 + "\n10: "+((notes%50)%20)/10+
				"\n5 : "+(((notes%50)%20)%10)/5 +"\n2 : "+((((notes%50)%20)%10)%5)/2 + "\n1 : "+
				(((((notes%50)%20)%10)%5)%2)/1);
		
		notes = coins;
		
		System.out.println("Please take your coins: ");
		
		System.out.println("50p: "+notes/50+"\n20p: "+(notes%50)/20 + "\n10p: "+((notes%50)%20)/10+
				"\n5p : "+(((notes%50)%20)%10)/5 +"\n2p : "+((((notes%50)%20)%10)%5)/2 + "\n1p : "+
				(((((notes%50)%20)%10)%5)%2)/1);
				
		
		

	}
}
