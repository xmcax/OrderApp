package pl.adamnowicki.orderapp;

import pl.adamnowicki.orderapp.calculation.InvalidProductDefinitionException;
import pl.adamnowicki.orderapp.order.customer.Customer;
import pl.adamnowicki.orderapp.order.*;
import pl.adamnowicki.orderapp.output.OrderPrinter;

public class Main {

    public static void main(String[] args) {

				Customer customer = new Customer();
				customer.name = "Adam Nowicki";

				Product pasta = new Product();
				pasta.name = "makaron";
				pasta.unitPrice = 10.0;

				OrderItem orderItemA = new OrderItem();
				orderItemA.product = pasta;
	      orderItemA.quantity = 2;

				Product egg = new Product();
				egg.name = "jajka";
//	      egg.unitPrice = 2.5;

				OrderItem orderItemB = new OrderItem();
				orderItemB.product = egg;
				orderItemB.quantity = 10;

				Order order = new Order();
				order.customer = customer;
				order.orderItems = new OrderItem[2];
				order.orderItems[0] = orderItemA;
				order.orderItems[1] = orderItemB;

				try {
					OrderPrinter orderPrinter = new OrderPrinter();
					orderPrinter.print(order);
				} catch (InvalidProductDefinitionException e) {
					System.out.println("Zamowienie nie moze byc zrealizowane bo produkt jest zle zdefiniowany: " + e.product.name);
				} finally{
					System.out.println("Koniec");
				}


		}
}


