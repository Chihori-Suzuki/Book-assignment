

public class Students {
	
	private String firstName;
	private String lastName;
	
	
	public Students(String fName, String lName) {
		if (fName == "" || fName == null ) {
			firstName = "Smith";
		} else {
			firstName = fName;
		}
		if (lName == "") {
			lastName = "Unknown";
		} else {
			lastName = lName;
		}
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
	 * Set the firstName
	 */
	public void setFirstName(String fName) {
		if(fName == "" || fName == null) {
			firstName = "Unknown";
		} else {
			firstName = fName;
		}
	}
	/*
	 * Set the lastName
	 */
	public void setLastName(String lName) {
		if(lName == "" || lName == null) {
			lastName = "Unknown";
		} else {
			lastName = lName;
		}
	}
	
}
