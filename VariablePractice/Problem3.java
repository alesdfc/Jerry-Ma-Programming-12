import java.util.Scanner;
public class Problem3 {
    public static void main(String[] args) {
        double drinkprice = 2.00;
        double dogprice = 5.50;

        System.out.println("Hello! Drinks are $2.00! How many would you like?");
        Scanner scanner = new Scanner(System.in);
        int drinkamount = Integer.parseInt(scanner.nextLine());

        System.out.println("We also sell hot dogs at $5.50 each, how much would you like?");
        int dogamount = Integer.parseInt(scanner.nextLine());

        //Rounding the result to be appropriate for representing money
        double total = (double)Math.round(((drinkprice*drinkamount + dogprice*dogamount)*1.12) * 100) / 100;

        System.out.println("Your total comes to $" + total);
    }
}
