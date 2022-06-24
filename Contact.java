//Author Name: William Harris

//Date: 05/22/2022

//Course ID: 320: Software Automation & Testing

//Description This class creates and stores contact information

import java.util.concurrent.atomic.AtomicLong;
public class Contact {
	private String firstName;
	private String id;
	private String lastName;
	private String phone;
	private String address;
	private static AtomicLong idGenerator = new AtomicLong();
	
	//default constructor; takes first name, last name, phone, and address as arguments
	public Contact(String firstName, String lastName, String phone, String address) {
		//generated id for new contact using idGenerator 
		this.id = String.valueOf(idGenerator.getAndIncrement());
		
		//set first name if parameters are appropriate, else set to default
		if(firstName == null||firstName.isBlank()) {
			firstName = "NULL";
		}else if(firstName.length()>10) {
			this.firstName = firstName.substring(0,10);
		}else {
			this.firstName = firstName;
		}
		
		//set last name if parameters are appropriate, else set to default
		if(lastName == null||lastName.isBlank()) {
			lastName = "NULL";
		}else if(lastName.length()>10) {
			this.lastName = lastName.substring(0,10);
		}else {
			this.lastName = lastName;
		}
		
		//set phone number if parameters are appropriate, else set to default
		if(phone == null||phone.isBlank()) {
			phone = "5555555555";
		}else if(phone.length()>10) {
			this.phone = phone.substring(0,10);
		}else {
			this.phone = phone;
		}
		
		//set address if parameters are appropriate, else set to default
		if(address == null||address.isBlank()) {
			address = "We don't know where you live";
		}else if(address.length()>30) {
			this.address = address.substring(0,30);
		}else {
			this.address = address;
		}
	}
	
	//Getters
public String getFirstName() {
	return firstName;
}
public String getLastName() {
	return lastName;
}
public String getPhone() {
	return phone;
}
public String getAddress() {
	return address;
}
public String getContactID() {
	return id;
}

//Setters
public void setFirstName(String firstName) {
	if(firstName == null||firstName.isBlank()) {
		firstName = "NULL";
	}else if(firstName.length()>10) {
		firstName = firstName.substring(0,10);
	}
	this.firstName = firstName;
	}

public void setLastName(String lastName) {
	if(lastName == null||lastName.isBlank()) {
		lastName = "NULL";
	}else if(lastName.length()>10) {
		lastName = lastName.substring(0,10);
	}
	this.lastName = lastName;
}
public void setPhone(String phone) {
	if(phone == null||phone.isBlank()) {
		phone = "NULL";
	}else if(phone.length()>10) {
		phone = phone.substring(0,10);
	}
	this.phone = phone;
}
public void setAddress(String address) {
	if(address == null||address.isBlank()) {
		address = "NULL";
	}else if(address.length()>30) {
		address = address.substring(0,30);
	}
	this.address = address;
	}

}





