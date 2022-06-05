package common.interfaces;

/**
   *An interface implemented on both the client and the server with the same functions,
   *this interface has the functionality related to the user cart -add to cart,update cart,finish an order...
  *@Katya
   */
import common.request_data.Order;

public interface CartManager {

	public Order submitOrder(Order order);
}
