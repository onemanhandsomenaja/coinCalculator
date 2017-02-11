import java.util.Scanner;
public class coinCalculator{
	public static void main(String[] args){
		System.out.print("Please enter your money: ");
		Scanner scan = new Scanner(System.in);
		int totalMoney = scan.nextInt();
		int numberOfCoin10 = totalMoney / 10;
		int remains = totalMoney % 10;
		int numberOfCoin5 = remains / 5;
		remains %= 5;
		int numberOfCoin1 = remains;
		System.out.println("You have got...");
		System.out.printf("10-Baht: %d coins\n"+
			"5-Baht: %d coins\n"+
			"1-Baht: %d coins\n", numberOfCoin10, numberOfCoin5,
			numberOfCoin1);


	}
}