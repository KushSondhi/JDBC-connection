
public class Book implements Product {

	private String name;
	private double price;

	public Book(String name, double price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public void ship() {
		System.out.println(name + " is shipping..");
	}
}
