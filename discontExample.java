public class discontExample {

    public static void main(String[] args) {

        int fee = 45000;
        double discount = 10.0;
        double finalfee = fee - (fee * discount / 100);
        System.out.println("Original fee: " + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final fee : " + finalfee);

    }
}
