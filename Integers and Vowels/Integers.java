
public class Integers {

	public static void main(String[] args) {
		
		System.out.println(numberOfEqual(3,4,3));
		System.out.println(numberOfEqual(1,1,1));
		System.out.println(numberOfEqual(3,4,1));

	}
		
			public static Integer numberOfEqual(Integer a, Integer b, Integer c) {
				
				if(a == b & a == c) {
					return 3;
				}
				else if (a == b || a == c || b == c) {
					return 2;
				}
				return 0;
				
			}
		
	}

