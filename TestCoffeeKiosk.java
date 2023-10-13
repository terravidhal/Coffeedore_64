public class TestCoffeeKiosk {
    public static void main(String[] args) {
        CoffeeKiosk terraCoffee = new CoffeeKiosk();
        terraCoffee.addMenuItem("banana", 3.5);
        terraCoffee.addMenuItem("coffee", 2.5);
        terraCoffee.addMenuItem("latte", 5.5);
        terraCoffee.addMenuItem("capuccino", 4.5);
        terraCoffee.addMenuItem("muffin", 2.8);
        
       // terraCoffee.addMenuItemByInput();  // Ninjas Bonus:

      //  terraCoffee.displayMenu();

        terraCoffee.newOrder();
    }
}
