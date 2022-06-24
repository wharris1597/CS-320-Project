//Author Name: William Harris

//Date: 05/22/2022

//Course ID: 320: Software Automation & Testing

//Description This class manages the list of contacts and has methods to add update or delete contacts

import java.util.ArrayList;

public class ContactService {
	//create array list to store contacts
	ArrayList<Contact> contactList = new ArrayList<Contact>();
	
	public void displayContactList() {
		for(int counter = 0; counter < contactList.size(); counter++) {
			System.out.println("\t Contact ID: "+contactList.get(counter).getContactID());
			System.out.println("\t First Name: "+contactList.get(counter).getFirstName());
			System.out.println("\t Last Name: "+contactList.get(counter).getLastName());
			System.out.println("\t Phone Number: "+contactList.get(counter).getPhone());
			System.out.println("\t Address: "+contactList.get(counter).getAddress());
		}
	}
	
	//add contact to list
	public void addContact(String firstName, String lastName, String phone, String address) {
		Contact contact = new Contact(firstName, lastName, phone, address);
		contactList.add(contact);
	}
	
	//get contact object from list using id
	public Contact getContact(String id) {
		Contact contact = new Contact(null,null,null,null);
		for(int counter = 0; counter< contactList.size();counter++) {
			if(contactList.get(counter).getContactID().contentEquals(id)) {
				contact = contactList.get(counter);
			}
		}
		return contact;
	}
	
	//delete contact
	public void deleteContact(String id) {
		for(int counter = 0; counter < contactList.size(); counter++) {
			if(contactList.get(counter).getContactID().equals(id)) {
				contactList.remove(counter);
				break;
		}
			if(counter == contactList.size()-1) {
				System.out.println("Contact ID: " + id + " not found.");
				}
		}
	}
	
	//setters
	
	public void setFirstName(String newFirstName, String id) {
		for(int counter = 0; counter < contactList.size(); counter++) {
			if(contactList.get(counter).getContactID().equals(id)) {
				contactList.get(counter).setFirstName(newFirstName);
				break;
		}
			if(counter == contactList.size()-1) {
				System.out.println("Contact ID: " + id + " not found.");
				}
		}
	}
	public void setLastName(String newLastName, String id) {
		for(int counter = 0; counter < contactList.size(); counter++) {
			if(contactList.get(counter).getContactID().equals(id)) {
				contactList.get(counter).setLastName(newLastName);
				break;
		}
			if(counter == contactList.size()-1) {
				System.out.println("Contact ID: " + id + " not found.");
				}
		}
	}
	public void setPhone(String newPhone, String id) {
		for(int counter = 0; counter < contactList.size(); counter++) {
			if(contactList.get(counter).getContactID().equals(id)) {
				contactList.get(counter).setPhone(newPhone);
				break;
		}
			if(counter == contactList.size()-1) {
				System.out.println("Contact ID: " + id + " not found.");
				}
		}
	}
	public void setAddress(String newAddress, String id) {
		for(int counter = 0; counter < contactList.size(); counter++) {
			if(contactList.get(counter).getContactID().equals(id)) {
				contactList.get(counter).setAddress(newAddress);
				break;
		}
			if(counter == contactList.size()-1) {
				System.out.println("Contact ID: " + id + " not found.");
				}
		}
	}
	
	

}
