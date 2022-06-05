package common.interfaces;

import common.request_data.Order;
import common.request_data.OrderList;
/**
   *An interface implemented on both the client and the server with the same functions,
   *this interface has the functionality related to orders -get user orders, add orders and change order.
  *@Katya
   */
public interface OrderManager {
	public Order getOrder(String username);
	public OrderList getOrders(String username);
}
