public class User implements  Subscriber {
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void notify(Item item) {
        System.out.println("Dear " + name + ", the item '" + item.getName() + "' is now available.");
    }
}
