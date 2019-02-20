import java.util.ArrayList;

public class Book {

	    private String name;
	    private Double price;
	   
	    
	    
	    public Book (String name, Double price) {
	        this.name = name;
	        this.price = price;
	    }
	   

	    public void setName(String name) {
	        this.name = name;
	    }

	    
	     /*return the price
	     */
	    public Double getPrice() {
	        return price;
	    }

	    /*
	     set the price 
	     */
	    public void setPrice(Double price) {
	        this.price = price;
	    }	
	
}
