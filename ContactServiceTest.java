//Author Name: William Harris

//Date: 05/22/2022

//Course ID: 320: Software Automation & Testing

//Description This class tests the Contact Service

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 */

/**
 * @author wharr
 *
 */
class ContactServiceTest {

	//Test that service created contact successfully
	@Test
	void testContactServiceClass() {
		ContactService service = new ContactService();
		service.addContact("Justin", "Cooper", "", "");
		//Test that service created contact successfully
		assertTrue(service.contactList.get(0).getLastName().equals("Cooper"));
		
		//delete and verify deletion
		service.deleteContact(service.contactList.get(0).getContactID());
		
		
		
		
	}

	
	@Test
	void testDisplayContacts() {
		ContactService service = new ContactService();
		service.addContact(null, null, null, null);
		service.displayContactList();
	}
	
	@Test
	void testServices() {
		ContactService service = new ContactService();
		service.addContact(null, null, null, null);
		service.getContact(service.contactList.get(0).getContactID());
		service.getContact("null");
		
		//test delete method
		service.addContact(null, null, null, null);
		service.deleteContact(service.contactList.get(0).getContactID());
		service.deleteContact("null");
		
	}
	
	@Test
	void testSetters() {
		ContactService service = new ContactService();
		service.addContact(null, null, null, null);
		
		service.setFirstName("NEW", service.contactList.get(0).getContactID());
		service.setLastName("NEW", service.contactList.get(0).getContactID());
		service.setAddress("NEW", service.contactList.get(0).getContactID());
		service.setPhone("NEW", service.contactList.get(0).getContactID());
		
		service.setFirstName("NEW", "null");
		service.setLastName("NEW", "null");
		service.setAddress("NEW", "null");
		service.setPhone("NEW", "null");
		
	}
}
