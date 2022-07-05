import java.util.*;
import java.io.*;
public class GBVersion2Main {

	public static void main(String args[]) {
		GBVersion2 run = new GBVersion2();
		run.processExamResults();
		System.out.printf("I own $%.2f dollars worth of copper and gold\n\n", run.performCalc());
	}
}