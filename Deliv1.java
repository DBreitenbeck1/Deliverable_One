import java.util.Scanner;

public class Deliv1 {
	public static void main(String[] args) {
		String vacationType = "";
		int groupSize = 0;
		String methodOfTravel;
		String destination = "";
		String result;

		Scanner scnr1 = new Scanner(System.in);
		Scanner scnr2 = new Scanner(System.in);

		System.out.println("What type of vacation are you going on: musical, tropical, or adventure?");
		while (destination == "") {
			vacationType = scnr1.nextLine();
			vacationType = vacationType.toLowerCase();

			switch (vacationType) {
			case "adventure":
				destination = "white water rafting the Grand Canyon";
				vacationType = "an adventurous";
				break;
			case "musical":
				destination = "New Orleans";
				vacationType = "a musical";
				break;
			case "tropical":
				destination = "a beach vacation in Mexico";
				vacationType = "a tropical";
				break;
			default:
				destination = "";
				System.out.println("Sorry, I did not understand that. Please try again:");
			}
		}
		System.out.println("How many are in your group?");
		
		while (groupSize == 0) {
			if (scnr2.hasNextInt()) {
				groupSize = scnr2.nextInt();
				if (groupSize <= 0) {
					System.out.println("You can't have a vacation without vacationers!");
					groupSize = 0;
				}
			} else {
				System.out.println("I don't understand. Please enter a number greater than zero.");
				scnr2.next();
			}
		}

		if (groupSize <= 2) {
			methodOfTravel = "first class";
		} else if (groupSize < 6) {
			methodOfTravel = "a helicopter";
		} else {
			methodOfTravel = "a charter flight";
		}

		result = ("Since you are a group of " + groupSize + " going on " + vacationType + 
				" vacation, you should take "+ methodOfTravel + " to " + destination + ".");

		System.out.println(result);
		scnr1.close();
		scnr2.close();
	}
}
