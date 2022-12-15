//Luis Mireles lmireles3@toromail.csudh.edu
//Anthony Morales amorales296@toromail.csudh.edu

public class Customer {
	private String firstName;
	private String lastName;
	private String SSN;

	public Customer(String fn,String ln,String ssn) {
		this.firstName=fn;
		this.lastName=ln;
		this.SSN=ssn;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getSocialSecurityNumber() {
		return SSN;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setSocialSecurityNumber(String sSN) {
		SSN = sSN;
	}

}