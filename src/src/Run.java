import java.util.ArrayList;
import java.util.List;

/**
 * <Insert comment here>
 *
 * @author Dale Kocian k557782
 * @version $Revision$
 */
public class Run {
    public static void main(String[] args) {
        List<Order> orderList = new ArrayList<Order>();
        orderList.add(new Order(10.0));
        orderList.add(new Order(20.0));
        orderList.add(new Order(30.0));
        Customer customer = new Customer("Dale", orderList);
        customer.printOwing();
    }
}
