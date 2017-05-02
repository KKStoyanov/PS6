package base;

import static org.junit.Assert.*;

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
		Date d1 = new Date();
		PersonDomainModel p1 = new PersonDomainModel("Kevin", "Durant", d1);
		p2 = p1;
		
		PersonDAL pd = new PersonDAL();
		
		pd.addPerson(p1);
		pd1 = pd;
	}
	static PersonDomainModel p2;
	static PersonDAL pd1;
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test_addPerson() {
		assertEquals(pd1.getPerson(p2.getPersonID()).getFirstName(), p2.getFirstName());
	}
	
	@Test
	public void test_getPerson(){
		assertEquals(pd1.getPerson(p2.getPersonID()).getFirstName(), p2.getFirstName());
	}

}