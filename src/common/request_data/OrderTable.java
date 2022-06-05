package common.request_data;


/**
   *JSON class that saves informtion about order so it can be insert to table and can  be transferred between the client and the server
   *for each OrderTable saves - ordernumber,the detais of the user that orderd,the order time,the products in order and the gretting card.
  *@Jessican and Yarden
   */

public class OrderTable {
	public Order order;

	public OrderTable(Order order) {

		this.order = order;
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

	/**
   *Returns all products on order Clearly as a string
  *@author Katya
   */

	public String getProducts() {
		StringBuilder str = new StringBuilder();
		boolean isFirst = true;
		for (String p : order.products.items.keySet()) {
			if (!isFirst) {
				str.insert(str.length(), ", ");
			}
			isFirst = false;
			str.insert(str.length(), p + " < " + order.products.items.get(p) + " > ");

		}
		return str.toString();
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
