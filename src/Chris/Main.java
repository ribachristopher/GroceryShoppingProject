package Chris;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        GroceryItems groceryItemsObj = new GroceryItems();

        groceryItemsObj.printAndSelectGroceryOptions();
        groceryItemsObj.selectionVerification();
        groceryItemsObj.payForItem();
        groceryItemsObj.validPaymentCheck();
    }
}