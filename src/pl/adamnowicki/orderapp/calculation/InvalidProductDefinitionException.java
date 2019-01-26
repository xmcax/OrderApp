package pl.adamnowicki.orderapp.calculation;

import pl.adamnowicki.orderapp.order.Product;

public class InvalidProductDefinitionException extends RuntimeException {
  public Product product;

  public InvalidProductDefinitionException(final Product product) {
    this.product = product;
  }
}
