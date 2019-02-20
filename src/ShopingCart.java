import java.awt.List;
import java.util.ArrayList;

public class ShopingCart {
	
	private ArrayList <Book> BookList = new ArrayList<Book>();
	
	
 
	public void addBook(Book book) {
		BookList.add(book);
	}

	public int getBooksCount() {
		return BookList.size();
		
	}


}
