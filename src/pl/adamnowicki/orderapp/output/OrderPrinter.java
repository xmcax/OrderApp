package pl.adamnowicki.orderapp.output;

import pl.adamnowicki.orderapp.calculation.OrderTotalPriceCalculator;
import pl.adamnowicki.orderapp.order.Order;
import pl.adamnowicki.orderapp.order.OrderItem;

import static java.lang.System.out;

public class OrderPrinter {
  public void print(Order order) {
    out.println("pl.adamnowicki.orderapp.order.customer.Customer: " + order.customer.name);

    for(OrderItem orderItem : order.orderItems) {
      out.println(String.format("# %s %.2f x %d",
          orderItem.product.name,
          orderItem.product.unitPrice,
          orderItem.quantity));
    }

    OrderTotalPriceCalculator calculator = new OrderTotalPriceCalculator();
    out.println(String.format("Total: %.2f", calculator.calculate(order)));
  }
}
