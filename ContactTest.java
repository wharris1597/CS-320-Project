//Author Name: William Harris

//Date: 05/22/2022

//Course ID: 320: Software Automation & Testing

//Description This class tests the contact class to ensure proper construction of contacts
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 */

/**
 * @author wharr
 *
 */
class ContactTest {

	//test that contact was created successfully
	@Test
	void testContactClass() {
		Contact contact = new Contact("Justin", "Cooper", "3181258334", "1225 Santa Fe Dr.");
		
		assertTrue(contact.getFirstName().equals("Justin"));
		assertTrue(contact.getLastName().equals("Cooper"));
		assertTrue(contact.getPhone().equals("3181258334"));
		assertTrue(contact.getAddress().equals("1225 Santa Fe Dr."));
		
	}
	
	@Test
	void testInstantiations() {
		Contact contact2 = new Contact(null,null,null,null);
		Contact contact3 = new Contact("","","","");
		//test input too long
		Contact contact4 = new Contact("ABCDEFGHIJKL","ABCDEFGHIJKL","ABCDEFGHIJKL","ABCDEFGHIJKLMNOPQRSTUVABCDEFGHIJK");
		contact4.getContactID();
	}
	
	@Test
	void testSetters() {
		Contact contact5 = new Contact(null,null,null,null);
		//test setters with null
		contact5.setFirstName(null);
		contact5.setLastName(null);
		contact5.setPhone(null);
		contact5.setAddress(null);
		
		//test setters with blank
		contact5.setFirstName("");
		contact5.setLastName("");
		contact5.setPhone("");
		contact5.setAddress("");
		
		//test setters with input too long
		contact5.setFirstName("ABCDEFGHIJKL");
		contact5.setLastName("ABCDEFGHIJKL");
		contact5.setPhone("ABCDEFGHIJKL");
		contact5.setAddress("ABCDEFGHIJKLMNOPQRSTUVABCDEFGHIJK");
		
		//test input shorter than expected
		contact5.setFirstName("ABCDEFGH");
		contact5.setLastName("ABCDEFGH");
		contact5.setPhone("ABCDEFGH");
		contact5.setAddress("ABCDEFG");
		
		
	}
	
	
}
