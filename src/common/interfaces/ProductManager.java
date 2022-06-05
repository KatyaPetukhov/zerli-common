package common.interfaces;

import java.util.List;

import common.interfaces.UserManager.PermissionDenied;
import common.request_data.Product;
import common.request_data.ProductList;

/**
   *An interface implemented on both the client and the server with the same functions,
   *this interface has the functionality related to products in stores and in the catalog.
  *@Katya
   */

public interface ProductManager {
	public static String ALL_CATEGORY = "All";

	/* Same flow as in UserManager - read UserManager interface for details. */
	/* Should never return null or empty list, ALL_CATEGORY always exists. */
	public List<String> getCategories();

	public ProductList getProducts(String category);
	
	public Product getProduct(String name);

	public boolean addProduct(Product product) throws PermissionDenied;

	public void removeProduct(Product product);
}
