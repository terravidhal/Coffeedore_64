import java.util.ArrayList;

public class Order {
    // MEMBER VARIABLES
    private String name;
    private boolean ready;
    ArrayList<Item> items; 

    //CONSTRUCTOR
    public Order() {
       this.name = "Guest";
       this.items = new ArrayList<Item>();
    }

    //OVERLOADED CONSTRUCTOR
    public Order(String name) {
       this.name = name;
       this.items = new ArrayList<Item>();
    }

    
    
    // ORDER METHODS

    public void addItem(Item item){ // setters
        this.items.add(item);
    }

    public String getStatusMessage(){
        if (this.getOrderTotal() == 0) {
            return "\nyou have not ordered any products!";
        } else {
            if(this.getReady()){
                return "\n"+ this.getName() + ", your order is ready.";
            }else{
                return "\n"+ this.getName() + ". Thank you for waiting. Your order will be ready soon.";
            }
        }
    }

    public double getOrderTotal(){
        double total = 0;
        for(int i=0; i < this.items.size(); i++){
            total += this.items.get(i).getPrice();
        }
        return total;
    }

    public void display(){
        // ORDER DETAILS: 
        System.out.println("\n=========== ORDER DETAILS ===========");
        System.out.println("\nName : " + this.name);
        for(int i=0; i < this.items.size(); i++){
            System.out.println("Item-"+ (i+1) +" :\n" + "1" + " - " + this.items.get(i).getName() + " - " + " $" +this.items.get(i).getPrice());
        }
        System.out.println("Total Price: " + "$" +  this.getOrderTotal());
        System.out.print(this.getStatusMessage() + "\n");
    }


    // GETTERS & SETTERS

    //GETERS
    public String getName(){
        return name;
    }

    public boolean getReady(){
        return ready;
    }

    public ArrayList<Item> getItems(){
        return this.items;
    }
    
    //SETTERS
    public void setName(String name){
        this.name = name;
    }

    public void setReady(boolean ready){
        this.ready = ready;
    }

    public void setItems(ArrayList<Item> items){
        this.items = items;
    }
}






