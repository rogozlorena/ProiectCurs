public class Main {
    public static void main(String[] args) {
        // Singleton Pattern
        ShoppingCart cart1 = ShoppingCart.getInstance();
        cart1.addItem(new Item("T-Shirt", 19.99));
        cart1.addItem(new Item("Jeans", 39.99));

        ShoppingCart cart2 = ShoppingCart.getInstance();
        cart2.addItem(new Item("Dress", 39.99));
        cart2.addItem(new Item("Shorts", 14.99));

        System.out.println("Total price for cart1: " + cart1.getTotalPrice());
        System.out.println("Total price for cart2: " + cart2.getTotalPrice());

        // Factory Pattern
        Item item = ItemFactory.createItem("shirt", "Polo Shirt", 24.99);

        // Observer Pattern
        NotificationService notificationService = new NotificationService();
        User user1 = new User("John Doe", "john@example.com");
        User user2 = new User("Jane Smith", "jane@example.com");
        notificationService.subscribe(user1);
        notificationService.subscribe(user2);
        notificationService.notifySubscribers(item);

        // Strategy Pattern
        PaymentStrategy creditCardPayment = new CreditCardPayment();
        creditCardPayment.pay(54.99);

        // Template Method Pattern
        CheckoutProcess checkoutProcess = new CheckoutProcess() {
            @Override
            protected void selectItems() {
                System.out.println("Selecting items for checkout...");
            }

            @Override
            protected void applyDiscounts() {
                System.out.println("Applying discounts...");
            }

            @Override
            protected void calculateShipping() {
                System.out.println("Calculating shipping...");
            }

            @Override
            protected void choosePayment() {
                System.out.println("Choosing payment method...");
            }

            @Override
            protected void confirmOrder() {
                System.out.println("Confirming order...");
            }
        };
        checkoutProcess.process();
    }
}