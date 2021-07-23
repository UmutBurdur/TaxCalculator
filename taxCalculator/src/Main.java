import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double price;
        double taxRate=0.18;
        double taxAmount;
        double taxIncluded;

        Scanner input = new Scanner(System.in);
        System.out.print("Price: ");
        price = input.nextDouble();

        if (price>=0 && price<=1000) {
            System.out.println("Price without tax: " + price);
            taxAmount = price * taxRate;
            System.out.println("Tax amount: " + taxAmount);
            taxIncluded = price * (1 + taxRate);
            System.out.println("Price with tax included: " + taxIncluded);
        }

        else if (price>1000) {
            taxRate = 0.08;
            System.out.println("Price without tax: " + price);
            taxAmount = price * taxRate;
            System.out.println("Tax amount: " + taxAmount);
            taxIncluded = price * (1 + taxRate);
            System.out.println("Price with tax included: " + taxIncluded);
        }
        else {
            System.out.println("Price should be a positive number!");
        }
    }
}
