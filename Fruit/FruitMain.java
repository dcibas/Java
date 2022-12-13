import java.util.ArrayList;
import java.util.Arrays;

public class FruitMain {

	public static void main(String[] args) {	
		
		Banana banana = new Banana("banana");
		Banana banana2 = new Banana("banana2");

		Orange orange = new Orange("orange");
		Orange orange2 = new Orange("orange2");
		
		Apple apple = new Apple("apple");
		Apple apple2 = new Apple("apple2");
		
		FruitSeller<Banana> bananaMan = new FruitSeller<Banana>("bananaman", new ArrayList<>(Arrays.asList(banana, banana2)));
		FruitSeller<Apple> appleMan = new FruitSeller<Apple>("appleman", new ArrayList<>(Arrays.asList(apple, apple2)));
		FruitSeller<Orange> orangeMan = new FruitSeller<Orange>("bananaman", new ArrayList<>(Arrays.asList(orange, orange2)));

		bananaMan.sellFruit(banana);
		appleMan.sellFruit(apple);
		orangeMan.sellFruit(orange);
		
		FruitSeller<Fruit> fruitSeller = new FruitSeller<Fruit>("FruitSeller", new ArrayList<Fruit>());
		fruitSeller.sellFruit(apple);
		fruitSeller.sellFruit(orange);
		
		FruitSeller<Fruit> fruitSeller2 = new FruitSeller<Fruit>("FruitSeller2", new ArrayList<Fruit>());
		fruitSeller2.sellFruit(banana);
		fruitSeller2.sellFruit(banana);
		
		fruitSeller.moreFruitSold(fruitSeller);
		
		fruitSeller.moreFruitSold(fruitSeller2);
		
	}

}
