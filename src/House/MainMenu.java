package House;

import java.util.ArrayList;
import java.util.Scanner;

public class MainMenu {
	public static void main(String[] args) {

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

		do {
			for (int x = 0; x < OPTIONCOUNT; x++) {
				System.out.println("[" + x + "] " + prompts[x]);
			}
			System.out.println("Enter a number from 0 to " + (OPTIONCOUNT - 1) + " : ");
			option = input.nextInt();

			switch (option) {
			case 1:
				System.out.println("Show all Houses ");
				System.out.println("Press any key and then enter to continue");
				input.next();
				break;
			case 2:
				System.out.println("Add a House ");
				System.out.println("Press any key and then enter to continue");
				input.next();
				break;
			case 3:
				System.out.println("Remove a House ");
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
		Subdivision display = new Subdivision();
		display.list();
		display.listByArea​(0, 0);
		display.listByPlot(0, 0);
		display.sortByArea();
		display.sortByPlot();
	}
}
