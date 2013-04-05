import java.util.List;

/**
 * <Insert comment here>
 *
 * @author Dale Kocian k557782
 * @version $Revision$
 */
public class Customer {
    private String name;
    private List<Order> orders;

    public Customer(String name, List<Order> orders) {
        this.orders = orders;
        this.name = name;
    }

    public void printOwing() {
        printBanner();
        double outstanding = getOutstanding();
        printDetails(outstanding);
    }

    private double getOutstanding() {
        double outstanding = 0.0;
        for (Order order : orders) {
            outstanding += order.getAmount();
        }
        return outstanding;
    }

    private void printDetails(double outstanding) {
        System.out.println("Name: " + name);
        System.out.println("Amount = " + outstanding);
    }

    void printBanner() {
        System.out.println("**************************");
        System.out.println("***** Customer Owes ******");
        System.out.println("**************************");
    }

    public List<Order> getOrders() {
        return this.orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
