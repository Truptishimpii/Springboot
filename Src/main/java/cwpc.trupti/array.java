package cwpc.trupti;

public class array {

	int size;
	String city[] = new String[size];
	
	public array(int size, String[] city) {
		this.size = size;
		this.city = city;
	}
	
	void get_all_city() {
		for(int i = 0; i < city.length; i++) {
			System.out.println("City Name = " + city[i]);
		}
	}
}
