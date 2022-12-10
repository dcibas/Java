import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OrderTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	public void filterOrderByTypeTest() {
		
		Order order1 = new Order("Nr1", null, Type.Purchase);
		Order order2 = new Order("Nr2", null, Type.Purchase);
		Order order3 = new Order("Nr3", null, Type.Purchase);
		Order order4 = new Order("Nr4", null, Type.Purchase);
		Order order5 = new Order("Nr5", null, Type.Sale);
		Order order6 = new Order("Nr6", null, Type.Sale);

		List<Order> orders = new ArrayList<>(Arrays.asList(order1,order2,order3,order4,order5,order6));
		
		assertEquals(4, Order.filterShopByType(orders, Type.Purchase).size());
		assertEquals(2, Order.filterShopByType(orders, Type.Sale).size());

	}
	
	@Test
	public void MakeOrderTestPurchase() throws FileNotFoundException, InsufficientProductException {
		
		List<Product> products = Product.importProducts("products1.txt");
		
		Shop banginis = new Shop("Banginis", "Zirmunu40", products);
		
		HashMap<String, Integer> order = new HashMap<>();
		
		order.put("07886659844", 5);
		order.put("06669844723", 7);
		
		Order.makeOrder(banginis, Type.Purchase, order);
		
		assertEquals(11, products.get(0).getRemainder());
		assertEquals(9, products.get(1).getRemainder());

		System.out.println(products.get(0).getName());
	}


@Test
public void MakeOrderTestSale() throws FileNotFoundException, InsufficientProductException {
	
	List<Product> products = Product.importProducts("products1.txt");
	
	Shop banginis = new Shop("Banginis", "Zirmunu40", products);
	
	HashMap<String, Integer> order = new HashMap<>();
	
	order.put("07886659844", 2);
	order.put("06669844723", 2);
	
	
	Order.makeOrder(banginis, Type.Sale, order);
	
	assertEquals(4, products.get(0).getRemainder());
	assertEquals(0, products.get(1).getRemainder());

	System.out.println(products.get(0).getName());
}

@Test
public void MakeOrderTestSaleInsurfficient() throws FileNotFoundException, InsufficientProductException {
	
	List<Product> products = Product.importProducts("products1.txt");
	
	Shop banginis = new Shop("Banginis", "Zirmunu40", products);
	
	HashMap<String, Integer> order = new HashMap<>();
	
	order.put("06669844723", 5);
	
	
//	Order.makeOrder(banginis, Type.Sale, order);
	
	InsufficientProductException exception = assertThrows(InsufficientProductException.class, () -> {
		Order.makeOrder(banginis, Type.Sale, order);
	});
	
	assertEquals(2, exception.getRemainder());
	
	}

}


