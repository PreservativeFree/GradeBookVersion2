import java.util.Scanner;

public class GBVersion2 {

	public static void processExamResults() {

		int passes = 0;
		int failures = 0;
		int studentCounter = 1, result;

		Scanner input = new Scanner(System.in);

		while (studentCounter <= 10) {

			System.out.print("Enter result (1 = pass, 2 = fail): ");
			result = input.nextInt(); //User Input

			if(result == 1)
				passes = passes + 1;
			else
				failures = failures + 1;

			studentCounter += 1;
		}

		System.out.printf("Passed: %d\nFailed: %d\n", passes, failures);

		if(passes > 8)
			System.out.println("Great Job Professor! Your class of 10 people will be passing this class.");
	}

	public double performCalc() {
		double copperMarketValue = 14.234, goldMarketValue = 18.673, marketTotal;
		marketTotal = copperMarketValue + goldMarketValue;
		return marketTotal; //Should output 32.91
	}

}
