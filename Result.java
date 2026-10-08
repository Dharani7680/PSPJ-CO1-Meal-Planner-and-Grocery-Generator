

public class Result {

   public  static int Total(int a, int b, int c) {
        return a+b+c;
    }
    public static int Average(int total) {
        return total / 3;
    }
    public static String Grade(double average) {
        if (average >= 75) {
            return "A";
        } else if (average >= 60) {
            return "B";
        } else if (average >= 50) {
            return "C";
        } else {
            return "Fail";
        }
    }
    public static void main(String[] args) {

        int total = Total(95, 89, 99);
        int average = Average(total);
        String grade = Grade(average);

        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);
    }
}