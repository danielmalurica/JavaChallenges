
public class Contacts {
	private String name;
	private String phoneNumber;
	
	public Contacts(String name, String phoneNumber) {
		this.name=name;
		this.phoneNumber=phoneNumber;
	}
	
	public String getName() {
		return name;
	}
	
	public String getNumber() {
		return phoneNumber;
	}
	
	public static Contacts createContact(String name, String number) {
		return new Contacts(name, number);
	}
}
