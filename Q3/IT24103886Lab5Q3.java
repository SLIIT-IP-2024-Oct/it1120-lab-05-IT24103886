import java.util.Scanner;

public class IT24103886Lab5Q3 {
    
    static final int ROOM_CHARGE_PER_DAY = 48000;
    static final int DISCOUNT_10_DAYS = 3;
    static final int DISCOUNT_20_DAYS = 5;

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the start date (1-31): ");
        int startDate = scanner.nextInt();

        System.out.print("Enter the end date (1-31): ");
        int endDate = scanner.nextInt();

        
        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Start date and end date must be between 1 and 31.");
            return;         }

                if (startDate >= endDate) {
            System.out.println("Error: Start date must be less than the end date.");
            return;  
        }

                int numberOfDays = endDate - startDate;

        
        double totalAmount = numberOfDays * ROOM_CHARGE_PER_DAY;
        double discount = 0;

        
        if (numberOfDays > DISCOUNT_10_DAYS && numberOfDays < DISCOUNT_20_DAYS) {
            discount = 10;  // 10% discount for 3-4 days
        } else if (numberOfDays >= DISCOUNT_20_DAYS) {
            discount = 20;  // 20% discount for 5 or more days
        }

                double discountAmount = (totalAmount * discount) / 100;
        double amountToPay = totalAmount - discountAmount;

        
        System.out.println("Number of days reserved: " + numberOfDays);
        System.out.println("Total amount to be paid: Rs " + amountToPay);
        System.out.println("Discount applied: " + discount + "%");

        
        scanner.close();
    }
}
