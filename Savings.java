public class Savings {
    public static void main(String[] args) {
        int month = 1;
        int saving = 100;

        while (month <= 12) {
            System.out.println("Month " + month + " : ₹" + saving);
            saving = saving + 100;
            month++;
        }
    }
}
