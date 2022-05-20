package common.interfaces;

import java.util.List;

import common.interfaces.UserManager.PermissionDenied;
import common.request_data.Product;
import common.request_data.ProductList;

public interface ProductManager {
	public static String ALL_CATEGORY = "All";

	/* Same flow as in UserManager - read UserManager interface for details. */
	/* Should never return null or empty list, ALL_CATEGORY always exists. */
	public List<String> getCategories();

	public ProductList getProducts(String category, int start, int amount);
	
	public Product getProduct(String name);

	public boolean addProduct(Product product) throws PermissionDenied;

	public void removeProduct(Product product);
}
