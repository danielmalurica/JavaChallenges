import java.util.Scanner;


public class Main {
	
	private static Scanner scanner=new Scanner(System.in);
	private static MobilePhone mobilePhone=new MobilePhone("0730204500");

	public static void main(String[] args) {
		boolean quit=false;
		startPhone();
		printActions();
		while(!quit) {
			System.out.println("\n Enter action: (6 to show your available actions)");
			int action=scanner.nextInt();
			scanner.nextLine();
			switch(action) {
			case 0:
				System.out.println("\n Shutting down...");
				quit=true;
				break;
			case 1:
				printContacts();
				break;
				
			case 2:
				addNewContact();
				break;
				
			case 3:
				updateContact();
				break;
				
			case 4:
				removeContact();
				break;
				
			case 5:
				queryContact();
				break;
				
			case 6:
				printActions();
				break;
			}
		}
		
	}
	
	private static void addNewContact() {
		System.out.println("Enter new contact name:\n");
		String name=scanner.nextLine();
		System.out.println("Enter phone number:\n");
		String phoneNumber=scanner.nextLine();
		
		Contacts newContact=Contacts.createContact(name, phoneNumber);
		if(mobilePhone.addNewContact(newContact)) {
			System.out.println("New contact added "+name);
		}
		else {
			System.out.println("Cannot add,"+name+"already on file");
		}
	}
	
	private static void updateContact() {
		System.out.println("Enter new contact name:");
		String name=scanner.nextLine();
		System.out.println("Enter phone number:");
		String phoneNumber=scanner.nextLine();
		Contacts existingContactMethod=mobilePhone.queryContact(name);
		if(existingContactMethod==null) {
			System.out.println("Contact not found!");
			return;
		}
		
		System.out.print("Enter new contact name:");
		String newName=scanner.nextLine();
		System.out.println("Enter new contact number:");
		String newNumber=scanner.nextLine();
		Contacts newContact=Contacts.createContact(newName, newNumber);
		if(mobilePhone.updateContact(existingContactMethod, newContact)) {
			System.out.println("Succesfully updated record!");
		}
		else {
			System.out.println("Error updating record!");
		}
	}
	
	private static void removeContact() {
		System.out.println("Enter existing contact name:\n");
		String name=scanner.nextLine();
		Contacts existingContactRecord=mobilePhone.queryContact(name);
		if(existingContactRecord==null) {
			System.out.println("Contact not found!\n");
			return;
		}
		if(mobilePhone.removeContact(existingContactRecord)) {
			System.out.println("Succesfully deleted");
		}
		else {
			System.out.println("Error deleting contact");
		}
	}
	
	private static void queryContact() {
		System.out.println("Enter existing contact name:\n");
		String name=scanner.nextLine();
		Contacts existingContactRecord=mobilePhone.queryContact(name);
		if(existingContactRecord==null) {
			System.out.println("Contact not found\n");
			return;
		}
		System.out.println("Name:"+existingContactRecord.getName()+" phone number is"+existingContactRecord.getNumber());
	}
	
	
	
	private static void printContacts() {
		mobilePhone.printContacts();
	}
	
	private static void startPhone() {
		System.out.println("Starting phone...");
	}
	
	private static void printActions() {
		System.out.println("\n Available actions:\n press:");
		System.out.println("0 - to shutdown\n"+
							"1 - to print contacts\n"+
							"2 - to add new contact\n"+
							"3 - to update an existing contact\n"+
							"4 - to remove an existing contact\n"+
							"5 - query if an existing contact exists\n"+
							"6 - to print a list of available actions\n");
		System.out.println("Choose your action:");
	}

}
