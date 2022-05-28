package common.interfaces;

import common.request_data.Order;
import common.request_data.OrderList;

public interface OrderManager {
	public Order getOrder(String username);
	public OrderList getOrders(String username);
}