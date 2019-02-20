
public class CartTest {

	private static int count;

	public static void main (String[] args) {
		ShopingCart cart = new ShopingCart();
	    count = cart.getBooksCount();
	    System.out.println("Size of Book list: " + count);
}
}