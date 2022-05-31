package common.request_data;

public class OrderTable {
Order order;



public OrderTable(Order order) {
	
	this.order=order;
}



public String getOrderNumber() {
	return order.orderNumber;
}

public String getUsername() {
	return order.username;
}

public String getDate() {
	return order.date;
}

public String getHour() {
	return order.hour;
}

public ProductList getProducts() {
	return order.products;
}

public OrderStatus getStatus() {
	return order.status;
}

public double getTotalPrice() {
	return order.totalPrice;
}

public String getRecipient() {
	return order.recipient;
}

public String getGreetingMessage() {
	return order.greetingMessage;
}

public String getSignature() {
	return order.signature;
}

public Shop getShop() {
	return order.shop;
}

public String getAddress() {
	return order.address;
}

public String getCity() {
	return order.city;
}

public String getPhone() {
	return order.phone;
}

public String getPaymentPhone() {
	return order.paymentPhone;
}

public OrderType getOrderType() {
	return order.orderType;
}

public String getTimeOfOrder() {
	return order.timeOfOrder;
}

}
