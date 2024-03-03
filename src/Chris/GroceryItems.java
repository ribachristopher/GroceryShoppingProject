package Chris;

import java.util.Scanner;

public class GroceryItems {
    Scanner userInput = new Scanner(System.in);
    final String[] groceryItemNames = {"Salad", "Ice Cream", "Chicken", "Broccoli"};
    final Float[] groceryItemPrices = {6.75f, 3.99f, 11.99f, 1.47f};
    int selectedItem;
    boolean validInputtedOptionCheck;
    float payAmount;
    float change;
    float insufficientPayment;

    void printAndSelectGroceryOptions(){
        System.out.println("(0) " + groceryItemNames[0] + " = $" + groceryItemPrices[0]);
        System.out.println("(1) " + groceryItemNames[1] + " = $" + groceryItemPrices[1]);
        System.out.println("(2) " + groceryItemNames[2] + " = $" + groceryItemPrices[2]);
        System.out.println("(3) " + groceryItemNames[3] + " = $" + groceryItemPrices[3]);
        System.out.println();

        System.out.println("Please pick an item. Enter the grocery item's corresponding number. (0, 1, 2, 3)");
        selectedItem = userInput.nextInt();
    }
    void selectionVerification(){
        if (selectedItem < 0 || selectedItem >= groceryItemNames.length) {
            validInputtedOptionCheck = false;
            System.out.println("valid option selected: " + validInputtedOptionCheck);
            System.out.println("Input not recognized. Option does not exist. Please enter a valid option. (0, 1, 2, 3)");
            System.out.println();
            printAndSelectGroceryOptions();
        }
            else {
                validInputtedOptionCheck = true;
                System.out.println("valid option selected: " + validInputtedOptionCheck);
                System.out.println();
                System.out.println("You selected " + groceryItemNames[selectedItem] + " - $" + groceryItemPrices[selectedItem]);
            }
        while (validInputtedOptionCheck == false){
            selectionVerification();
        }
    }
    void payForItem(){
        System.out.println("Please pay for the " + groceryItemNames[selectedItem] + ". Enter money amount. (float)");
        payAmount = userInput.nextFloat();
        change = payAmount - groceryItemPrices[selectedItem];
        }
    void validPaymentCheck(){
        while (change < 0) {
            insufficientPayment = Math.abs(change);
            System.out.println("Insufficient payment entered. Please pay the remaining balance: $" + insufficientPayment);
            payAmount = userInput.nextFloat();
            change = payAmount - insufficientPayment;
        }
            if (change >= 0){
                System.out.println("Payment successful.");
                System.out.print("Change = $" + payAmount + " - $" + groceryItemPrices[selectedItem] + " = $");
                System.out.printf("%.2f", change);
            }
    }
}



