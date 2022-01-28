import java.util.Scanner;

public class parlmpar {
	public static void main(String[] args) {	
		try (Scanner sc = new Scanner(System.in)) {
			int num=sc.nextInt();
			if(num % 2 == 0) {
				System.out.println("El numero que ingreo es par y su numero que ingreso es " + num);
			}else {
				System.out.println("El numero que ingreso es impar y su numero que ingreso es " + num);
			}
		}
	}
	
}
