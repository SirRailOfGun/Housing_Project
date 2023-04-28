package Snyder_Project;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MainMenu {
	public static void main(String[] args) throws IOException {

		Scanner input = new Scanner(System.in);
		int OPTIONCOUNT = 10;
		String prompts[] = { "to Exit", "Display All Houses in the Subdivision", "Add a House to the Subdivision",
				"Delete a House in the Subdivision", "Change a House in the Subdivision",
				"Filter Subdivision by Total Area and Display", "Filter Subdivision by Plot Size and Display",
				"Sort Subdivision by Total Area and Display", "Sort Subdivision by Plot Size and Display",
				"Save Subdivision to Text File" };

		int option = OPTIONCOUNT;

		// Create an instance of the subDivision class
		// and load the records from the text file
		Subdivision neighborhood = new Subdivision();
		neighborhood.fromDisk();

		do {
			for (int x = 0; x < OPTIONCOUNT; x++) {
				System.out.println("[" + x + "] " + prompts[x]);
			}
			System.out.println("Enter a number from 0 to " + (OPTIONCOUNT - 1) + " : ");
			option = input.nextInt();

			switch (option) {
			case 1:
				System.out.println("Show all Houses ");
				showSubdivision(neighborhood.list());
				System.out.println("Press any key and then enter to continue");
				input.next();
				break;
			case 2:
				System.out.println("Add a House ");
				House house = new House();
				System.out.println("Give the Style");
				house.houseStyle = input.next();
				System.out.println("Give the Family Room Size");
				house.famroomSize = input.nextDouble();
				System.out.println("Give the Living Room Size");
				house.livroomSize = input.nextDouble();
				System.out.println("Give the number of Bedrooms");
				house.bedrooms = input.nextInt();
				System.out.println("Give the amount of acres");
				house.acres = input.nextDouble();
				neighborhood.add(house);
				System.out.println("Press any key and then enter to continue");
				input.next();
				break;
			case 3:
				System.out.println("Remove a House ");
				System.out.println("Give the position of the house you want to remove");
				int houseToRemove = input.nextInt();
				neighborhood.remove(houseToRemove);
				System.out.println("Press any key and then enter to continue");
				input.next();
				break;
			case 4:
				System.out.println("Change a House ");
				System.out.println("Press any key and then enter to continue");
				input.next();
				break;
			case 5:
				System.out.println("Filter Total Area (Inclusive)");
				System.out.println("Press any key and then enter to continue");
				input.next();
				break;
			case 6:
				System.out.println("Filter by Plot Size (Inclusive)");
				System.out.println("Press any key and then enter to continue");
				input.next();
				break;
			case 7:
				System.out.println("Sort by Total Area (Smallest to Biggest");
				System.out.println("Press any key and then enter to continue");
				input.next();
				break;
			case 8:
				System.out.println("Sort by Plot Size (Smallest to Biggest");
				System.out.println("Press any key and then enter to continue");
				input.next();
				break;
			case 9:
				System.out.println("Write subdivision to disk");
				System.out.println("Press any key and then enter to continue");
				input.next();
				break;

			}
		} while (option >= 1 && option <= OPTIONCOUNT);

		input.close();
		System.out.println("End of Program");
	}

	private static void showSubdivision(ArrayList<House> subDivisionToShow) {
		for(House display:subDivisionToShow) {
			System.out.println(display.toString());
		}
	}
}
