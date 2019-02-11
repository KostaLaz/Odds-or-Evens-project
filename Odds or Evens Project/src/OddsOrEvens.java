import java.util.Random;
import java.util.*;

public class OddsOrEvens {

	public static void main(String[] args) {

		System.out.println("What is your name?");
		Scanner input = new Scanner(System.in);
		String name = input.next();
		System.out.println("Hallo " + name + ".");
		System.out.print("Please, choose (O)dds or (E)ven.");
		String userSelection = input.nextLine();
		if(userSelection.equals("O")) {
			System.out.println(name + " odds computer choose evens");
		}else if (userSelection.equals("E")){
			System.out.println(name + " evens, computer choose odds");
		}else {
			System.out.println("Please choose ONLY odss or evens");
		}
		System.out.println("*********************");
		System.out.println("");
		
		
		System.out.println("How many fingers do you put?");
		int fingers;
		fingers = input.nextInt();
		while (fingers > 5 || fingers <= 0) {
			System.out.println("You can only use one hand. Please try again.");
			fingers = input.nextInt();
			
		}
		System.out.println(name + " put " + fingers + " fingers");
		Random rand = new Random();
		int computer = rand.nextInt(6);
		System.out.println("The computer choose " + computer + " fingers");
		
		int sum = fingers + computer;
		boolean oddOrEven = sum % 2 == 0;
		if (oddOrEven == true) {
			if( userSelection.equals("E")) {
				System.out.println("The sum is even");
				System.out.println(name + "wins!");
			
		} else {
			System.out.println("The sum is odd");
			System.out.println("Computer wins!");
		}		
		}else {
			if(userSelection.equals("O")) {
				System.out.println(name + "wins!");
			}else {
				System.out.println("Computer wins!");
			}
		}
		
		
		
		input.close();
	}
	

}
