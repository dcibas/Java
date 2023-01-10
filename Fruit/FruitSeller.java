import java.util.ArrayList;

public class FruitSeller<T extends Fruit> {

	String name;
	Integer fruitsSold;
	ArrayList<T> fruits;
	
	
	public FruitSeller(String nameParam, ArrayList<T> fruitsParam) {
		
		name = nameParam;
		fruits = fruitsParam;
		fruitsSold = 0;
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getFruitsSold() {
		return fruitsSold;
	}

	public void setFruitsSold(Integer fruitsSold) {
		this.fruitsSold = fruitsSold;
	}

	public ArrayList<T> getFruits() {
		return fruits;
	}

	public void setFruits(ArrayList<T> fruits) {
		this.fruits = fruits;
	}
	
	public void sellFruit(T fruit) {
		System.out.println(fruit.getName() + " was sold by " + name);
		fruitsSold++;
	}
	
	public void moreFruitSold(FruitSeller<T> opponent) {
		
		if(fruitsSold > opponent.getFruitsSold()) {
			System.out.println(name + " sold more fruits than " + opponent.getName());
			
		} else if(fruitsSold == opponent.getFruitsSold()) {
			System.out.println(name + " sold the same amount of fruits as " + opponent.getName());

		} else {	
			System.out.println(opponent.getName() + " sold more fruits than " + name);

		}
		
	}
	
}
