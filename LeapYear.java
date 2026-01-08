public class LeapYear {
    static boolean isLeapYear(int year) {
        if ((year % 400 == 0) || (year % 100 != 0 && year % 4 == 0)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int year = 1900;
        if (isLeapYear(year)) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year");
        }
    }
}
