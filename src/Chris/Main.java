package Chris;
public class Main {
    public static void main(String[] args) {

        GroceryItems groceryItemsObj = new GroceryItems();

        groceryItemsObj.printAndSelectGroceryOptions();
        groceryItemsObj.selectionVerification();
        groceryItemsObj.payForItem();
        groceryItemsObj.validPaymentCheck();
    }
}