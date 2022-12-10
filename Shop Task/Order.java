import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;


public class Order {

	private String orderNr;
	private HashMap<String, Integer> products;
	private Type type;
	

	public Order(String orderNr, HashMap<String, Integer> products, Type type) {
		super();
		this.orderNr = orderNr;
		this.products = products;
		this.type = type;
	}
	
	public String getOrderNr() {
		return orderNr;
	}
	public void setOrderNr(String orderNr) {
		this.orderNr = orderNr;
	}
	public HashMap<String, Integer> getProducts() {
		return products;
	}
	public void setProducts(HashMap<String, Integer> products) {
		this.products = products;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}

	public static List<Order> filterShopByType(List<Order> orders, Type type) {
		
		
		List<Order> filteredOrders = orders
				.stream()
				.filter(order -> order.getType().equals(type))
				.collect(Collectors.toList());
		return filteredOrders;
		
	}
	
	
	public static void makeOrder(Shop shop, Type type, HashMap <String, Integer> products) throws InsufficientProductException{

		for(int i = 0; i < shop.getProducts().size(); i++) {
			
			if(products.containsKey(shop.getProducts().get(i).getBarcode())) {
				
				if(type.equals(Type.Purchase)) {
					Integer newRemainder = shop.getProducts().get(i).getRemainder() + products.get(shop.getProducts().get(i).getBarcode());
					shop.getProducts().get(i).setRemainder(newRemainder);
				} else {
					
					if(shop.getProducts().get(i).getRemainder() < products.get(shop.getProducts().get(i).getBarcode())) {
						throw new InsufficientProductException("Insufficient product " + shop.getProducts().get(i).getName() + " exception", shop.getProducts().get(i).getRemainder());
					}
					
					Integer newRemainder = shop.getProducts().get(i).getRemainder() - products.get(shop.getProducts().get(i).getBarcode());
					shop.getProducts().get(i).setRemainder(newRemainder);
				}
				
			}
			
		}
		
	}
		
}

