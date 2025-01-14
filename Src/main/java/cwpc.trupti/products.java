package cwpc.trupti;
import java.util.Scanner;
public class Products {

	int Size;
	int total = 0;
	String product[];
	int price[];


	Scanner sc = new Scanner(System.in);
	
	void set_product_list_size(int size) {
		
		this.Size = size;
		product = new String[size];
		price = new int[size];
	}
	
	
	void add_data() {	
		
		System.out.println(" \n Welcome to Joy Food Store \n ");
		for (int i = 0; i < Size; i++) {
			System.out.println("Enter Product = "+ (i+1));
			product[i] = sc.next();
			System.out.println("Enter = "+product[i] +" Price = ");
			price[i] = sc.nextInt();
		}
		
	}
	
	void show_data() {
		
		System.out.println("List of all Product with Price ");
		System.out.println("---------------------------------");
		System.out.println("Sn. Number | product Name | Price ");
		
		for (int i = 0; i < Size; i++) {
			
			System.out.println((i+1)+"|"+product[i]+"|"+price[i]);
			total = total + price[i];
		}
		System.out.println("Total Price = "+total);
	}
	
	
	
	
}
