package gestionBiblio;

public class Persone {
	private String firstName;
	private String lastName;
	private String email;
	public Persone() {}
	
	public Persone(String firstName, String lastName, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Persone [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
	}
	

}
