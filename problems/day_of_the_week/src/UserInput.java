import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserInput {
    static int[] getValidDate() {
        Scanner sc = new Scanner(System.in);

        while (true) { // Loop until valid input is provided
            System.out.print("Enter your date in this format \"dd/mm/yyyy\": ");
            String date = sc.nextLine();

            // Regex for date validation
            Pattern datePattern = Pattern.compile("^(0[1-9]|[1-2][0-9]|3[0-1])/(0[1-9]|1[0-2])/[0-9]{4}$");
            Matcher matcher = datePattern.matcher(date);

            if (matcher.matches()) {
                // Split and parse the date
                String[] validDate = date.split("/");
                int day = Integer.parseInt(validDate[0]);
                int month = Integer.parseInt(validDate[1]);
                int year = Integer.parseInt(validDate[2]);
                return new int[]{day, month, year}; // Return as an array
            } else {
                System.out.println("Please enter a valid date in the format \"dd/mm/yyyy\".");
            }
        }
    }

    public static void main(String[] args) {
        int[] date = getValidDate();
        System.out.println("Valid Date Entered: " + date[0] + "/" + date[1] + "/" + date[2]);
    }
}