public class Main {
    public static void main(String[] args) {
        int[] date = UserInput.getValidDate();
        int day = date[0];
        int month = date[1];
        int year = date[2];

        if (month < 3) {
            month += 12;
            year -= 1;
        }

        int computation = day + (26 * (month + 1)) / 10 + year + year / 4 + 6 * (year / 100) + year / 400;
        int dayOfWeek = computation % 7;

        String[] days = { "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

        System.out.println("The day you are searching for is: " + days[dayOfWeek]);
    }
}
