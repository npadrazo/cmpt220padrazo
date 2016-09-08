import java.util.Scanner;
public class calc {
	public static void main (String[] Strings) {
	Scanner input = new Scanner(System.in);
	double midtermgrade;
	double finalexam;
	double projects;
	double homeworkandlabs;

	System.out.print("midterm grade: ");
	midtermgrade = input.nextDouble();

	System.out.print("final exam: ");
	finalexam = input.nextDouble();

	System.out.print("projects: ");
	projects = input.nextDouble();

	System.out.print("homework and labs: ");
	homeworkandlabs = input.nextDouble();

	input.close();

	double total = (midtermgrade + finalexam + projects + homeworkandlabs) / 4;

	System.out.print("Your final grade is: " + total);
	}
}