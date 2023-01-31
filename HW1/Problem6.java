public class Problem6 {
    public static boolean isLeapYear(int year) {
        if (year % 100 == 0)
            return year % 400 == 0;
        return year % 4 == 0;
    }
    public static void main(String[] args) {
        System.out.println(isLeapYear(2024));
        System.out.println(isLeapYear(2023));
        System.out.println(isLeapYear(1900));
        System.out.println(isLeapYear(2000));
    }
}