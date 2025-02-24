public class Main {
    public String storeName;
    public String storeAddress;
    public long storePhone;
    public String storeEmail;
    public String storeMenu;
    private String pizzaIngredients;
    private double  pizzaPrice;
    private String  Sides;
    private String  Drinks;
    private String  orderID;
    private String    orderTotal;
    public void takeOrder(String id,String orderPizzaingredients,String orderSides,
                          String orderDrinks,String total,double orderPrice){
        orderID=id;
        pizzaIngredients=orderPizzaingredients;
        Sides=orderSides;
        Drinks=orderDrinks;
        pizzaPrice=orderPrice;
        orderTotal=total;
        System.out.println("Order accepted!");
        System.out.println("Order is being prepared");
    }
    public void makePizza(){
        System.out.println("Your pizza is being made");
        try {
            Thread.sleep(5000); }
        catch (InterruptedException e){
            System.out.println("Order is ready for pickup!");}
          System.out.println("Your order is ready!");
        printReceipt();
    }
    private void printReceipt(){
        System.out.println("********RECEIPT********");

        System.out.println("Order ID: " + orderID);
        System.out.println("Pizza Ingredients: " + pizzaIngredients);
        System.out.println("Sides: " + Sides);
        System.out.println("Drinks: " + Drinks);
        System.out.println("Pizza Price: " + pizzaPrice);
        System.out.println("Order Total: " + orderTotal);

    }

}