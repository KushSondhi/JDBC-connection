
public class MainClass {

	public static void main(String[] args) {

		Product book = ProductFactory.getProduct("book", "alpha", 15.5);
		Product speaker = ProductFactory.getProduct("speaker", "marshall", 1999.8);

		book.ship();
		speaker.ship();
	}
}
