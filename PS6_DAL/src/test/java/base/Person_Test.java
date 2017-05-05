package base;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import domain.PersonDomainModel;

public class Person_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		Date d1 = new Date(0);
		PersonDomainModel per1 = new PersonDomainModel();
		per1.setFirstName("Tom");
		per1.setLastName("Robinson");
		per1.setBirthday(d1);
		per1.setCity("Wilmington");
		per1.setPostalCode(19810);
		per1.setStreet("5368 Chinchilla RD");
		p1 = per1;
		
		
		PersonDAL pd = new PersonDAL();
		pd.addPerson(per1);
		PersonDomainModel per2 = PersonDAL.getPerson(per1.getPersonID());
		p2 = per2;
		assertNotNull(per2);
		pd1 = pd;
	}
	static PersonDomainModel p2;
	static PersonDomainModel p1;
	static PersonDAL pd1;
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
		pd1.deletePerson(p1.getPersonID());
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void TestGetAllPersons(){
		ArrayList<PersonDomainModel> pers = PersonDAL.getPersons();
		assertNotNull(pers);
	}
	
	@Test
	public void TestUpdateAndDeletePlayer(){
		PersonDomainModel p2 = PersonDAL.getPerson(p1.getPersonID());
		assertEquals(p1.getPersonID(), p2.getPersonID());
		
		p2.setLastName("James");
		PersonDAL.updatePerson(p2);
		
		PersonDomainModel per3 = PersonDAL.getPerson(p1.getPersonID());
		assertEquals(p2.getLastName(), per3.getLastName());
		assertNotEquals(p1.getLastName(),per3.getLastName());
		PersonDAL.deletePerson(p1.getPersonID());
		PersonDomainModel per4 = PersonDAL.getPerson(p1.getPersonID());
		assertNull(per4);
		
	}


}