
public class Book {

	// title
	// fistName
	// lastName
	// published year
	
	private String bookTitle;
	private String firstName;
	private String lastName;
	private int year;
	
	
	public Book(String title, String fName, String lName, int pYear) {
		
		bookTitle = title;
		firstName = fName;
		lastName = lName;
		year = pYear;

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
	
	public void setTitle(String title) {
		if(title == "") {
			bookTitle = "Unknown";
		} else {
			bookTitle = title;
		}
	}
	/*
	 * Set the firstName
	 */
	public void setFirstName(String fName) {
		if(fName == "" || fName == null) {
			firstName = "Jhon";
		} else {
			firstName = fName;
		}
	}
	/*
	 * Set the lastName
	 */
	public void setLastName(String lName) {
		if(lName == "" || lName == null) {
			lastName = "Dew";
		} else {
			lastName = lName;
		}
	}
	public void setYear(int pYear) {
		if(pYear < 1990 ) {
			year = 1990;
		} else {
			year = pYear;
		}
	}
	
	

}
