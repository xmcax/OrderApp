package pl.adamnowicki.orderapp.calculation;

import pl.adamnowicki.orderapp.order.Order;
import pl.adamnowicki.orderapp.order.OrderItem;

public class OrderTotalPriceCalculator {
  public double calculate(Order order) throws InvalidProductDefinitionException {
    double sum = 0.0;
    for (final OrderItem orderItem : order.orderItems) {
        if (orderItem.product.unitPrice == null) {
          throw new InvalidProductDefinitionException(orderItem.product);
        }
        sum += orderItem.quantity * orderItem.product.unitPrice;
    }
    return sum;
  }
}
