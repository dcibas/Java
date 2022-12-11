import java.util.Scanner;

public class Figura {

	public static void main(String[] args) {

				Scanner scanner = new Scanner(System.in);
				
				spausdintiMasyva();
			}
			

			public static String[] spausdintiMasyva() {
				
				String[] figura = {
						"*", "**", "***", "****", "*****", "******", "*******", "********", 
						"*********", "**********"
					};
				
				for(int i = 0; i < figura.length; i++) {
					
				System.out.println(figura[i]);
					
					
				}
				
				return figura;
				
			}

		}
