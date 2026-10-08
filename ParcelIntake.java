import  java.util.Scanner;
public class ParcelIntake {
  public static void main(String[] args)  {
    Scanner sc = new Scanner(System.in);
    String id = sc.next();
    String reciept = sc.next();
    char size = sc.next().charAt(0);
    double weight = sc.nextDouble();
    
    int base = (size == 'L') ? 30 : (size == 'W') ? 20 : 10;
    int surcharge = (int) Math.ceil(weight) * 2;
    int fee = base + surcharge;
    System.out.printf("Parcel : %s (%s)%n" , id,reciept);
    System.out.printf("Size: %c Weight: %.1fkg", size, weight);
    System.out.printf("Fee: Rs %d%n", fee);
    sc.close();
  }
}
