package danielm.person;

public class Person {
	public String firstName;
	public String lastName;
	public int age;
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public int getAge() {
		return age;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setAge(int age) {
		if(age<0||age>100) {
			age=0;
		}
		else {
		this.age = age;
		}
	}
	
	public boolean isTeen() {
		if(age<12&&age>20) {
			return false;
		}
		else return true;
	}
	
	public String getFullName() {
		if(firstName.isEmpty()&&lastName.isEmpty()) {
			return "";
		}
		else if(lastName.isEmpty()) {
			return firstName;
		}
		else if(firstName.isEmpty()) {
			return lastName;
		}
		return firstName+" "+lastName;
	}
	
}
