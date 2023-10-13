import java.util.ArrayList;

public class CoffeeKiosk {
  private ArrayList<Item> menu ; 
  private ArrayList<Order> orders ;
  
  public CoffeeKiosk() {
    this.menu = new ArrayList<Item>();
     this.orders = new ArrayList<Order>();
  }

  
  public void addMenuItem(String name, double price) {
    Item newItem = new Item(name, price); 
    menu.add(newItem); 
    int index = menu.indexOf(newItem); 
    newItem.setIndex(index); 
  }

  public void displayMenu() {
    System.out.println("\n============ Menu Lists ============\n");
    for(Item elt: this.menu) {
      System.out.println(elt.getIndex() + " " + elt.getName() + " -- $" + elt.getPrice());
    }
    System.out.println("\n");
  }

  public void newOrder() {
        
    // Shows the user a message prompt and then sets their input to a variable, name
      System.out.println("\nPlease enter customer name for new order:");
      String name = System.console().readLine();
  
    // Your code:
      // Create a new order with the given input string
      // Show the user the menu, so they can choose items to add.
      Order newOrder = new Order(name); 
      this.displayMenu(); 
     
      
    // Prompts the user to enter an item number
      System.out.println("Please enter a menu item index or q to quit:");
      String itemNumber = System.console().readLine(); 
      
      // Write a while loop to collect all user's order items
      while(!itemNumber.equals("q")) { 
          
          // Get the item object from the menu, and add the item to the order
          int indexItem = Integer.parseInt(itemNumber); 
         
          Item orderItem = menu.get(indexItem); 
          newOrder.addItem(orderItem); 
          
          // Ask them to enter a new item index or q again, and take their input
          System.out.println("Please enter a menu new item index or q to quit:");
          itemNumber = System.console().readLine();
      }
      // After you have collected their order, print the order details 
      // as the example below. You may use the order's display method.
      newOrder.display(); 
      this.orders.add(newOrder); 
      
  }

  //NINJAS BONUS : 

  public void addMenuItemByInput(){
    String orderCompleted = "y";
    while(orderCompleted.equals("y")) {
      System.out.println("\nPlease enter the name of the product item:");
      String itemName = System.console().readLine();
 
      System.out.println("Please enter the price of the product item:");
      String itemPrice = System.console().readLine();
      
      double price =  Double.parseDouble(itemPrice); 
      
      this.addMenuItem(itemName, price);
      System.out.println("Do you want to add another product item? y/n");
      orderCompleted = System.console().readLine();
    }
  }

}