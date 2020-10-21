

public class Driver {
	
	public static void printStudents(Students[] studentArray) {
		for (int i = 0; i < studentArray.length; i++) {
			System.out.println(studentArray[i].getFirstName() + " " + 
					studentArray[i].getLastName());
		}
	}
	
	public static void printBooks(Book[] bookArray) {
		for (int i = 0; i < bookArray.length; i++) {
			System.out.println(bookArray[i].getTitle() + " " + bookArray[i].getFirstName() + " " + 
					bookArray[i].getLastName() + " " + bookArray[i].getYear());
		}
	}
	
	
	public static void main(String[] args) {
		Students[] studentArray = new Students[2];
		
		studentArray[0] = new Students(null, "");
		studentArray[1] = new Students("Jane", "Dew");
		
//		printStudents(studentArray);
		studentArray[0].setFirstName("John");
		studentArray[0].setLastName("Doe");

		
		System.out.println("\nPrinting the student after the update");

		
		Book[] bookArray = new Book[1];
		
		bookArray[0] = new Book("", "", "", 1990);
		
		printBooks(bookArray);
		bookArray[0].setTitle("NewTitle");
		bookArray[0].setFirstName("NewFirst");
		bookArray[0].setLastName("NewLast");
		bookArray[0].setYear(1992);
		bookArray[0].setPrice(200);
		
		printBooks(bookArray);
 
	}
}
