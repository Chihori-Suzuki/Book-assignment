
public class Book {

	// title
	// fistName
	// lastName
	// published year
	// 
	
	private String bookTitle;
	private String firstName;
	private String lastName;
	private int year;
	private double price;
	
	
	public Book(String bookTitle, String firstName, String lastName, int year) {
		
		this.bookTitle = bookTitle;
		this.firstName = firstName;
		this.lastName = lastName;
		this.year = year;
		this.price = 0;
		
	}
	
	/*
	 * @return title
	 */
	public String getTitle() {
		return bookTitle;
	}
	/*
	 * @return firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/*
	 * @return lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/*
	 * @return year
	 */
	public int getYear() {
		return year;
	}
	/*
	 * @return price
	 */
	public double getTotalPrice() {
		return price;
	}
	
	
	/*
	 * Set the setTitle
	 */
	public void setTitle(String title) {
		if(title == "") {
			this.bookTitle = "Unknown";
		} else {
			this.bookTitle = title;
		}
	}
	/*
	 * Set the firstName
	 */
	public void setFirstName(String fName) {
		if(fName == "" || fName == null) {
			this.firstName = "Jhon";
		} else {
			this.firstName = fName;
		}
	}
	/*
	 * Set the lastName
	 */
	public void setLastName(String lName) {
		if(lName == "" || lName == null) {
			this.lastName = "Dew";
		} else {
			this.lastName = lName;
		}
	}
	/*
	 * Set the setYear
	 */
	public void setYear(int pYear) {
		if(pYear < 1990 ) {
			this.year = 1990;
		} else {
			this.year = pYear;
		}
	}
	/*
	 * Set the setYear
	 */
	public void setPrice(double price) {
		this.price = price * 1.12;
	}
	
	

}
