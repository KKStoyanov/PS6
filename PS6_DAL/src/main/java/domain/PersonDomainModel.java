package domain;


import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import util.LocalDateAdapter;

public class PersonDomainModel {

	/*private UUID PersonID;
    private  StringProperty firstName;
    private  StringProperty lastName;
    private  StringProperty street;
    private  IntegerProperty postalCode;
    private  StringProperty city;
    private  ObjectProperty<LocalDate> birthday;
*/
	private UUID PersonID;
    private  String firstName;
    private  String lastName;
    private  String street;
    private  Integer postalCode;
    private  String city;
    private  Date birthday;
    /**
     * Default constructor.
     */

    public PersonDomainModel(String fName, String lName, Date bday) {
		super();
		this.setPersonID(UUID.randomUUID());		
		firstName = fName;
		lastName = lName;
		birthday = bday;		
	}

	public PersonDomainModel(PersonDomainModel per)
	{
		super();
		this.setPersonID(UUID.randomUUID());		
		firstName = per.getFirstName();
		lastName = per.getLastName();
		street = per.getStreet();
		postalCode = per.getPostalCode();
		city = per.getCity();
		birthday = per.getBirthday();
		
	}
	
	/**
	 * Student - This constructor will retrieve a give student ID's record.
	 * @param personID
	 */
	
	public PersonDomainModel(UUID personID) {
		super();
		PersonID = personID;		
	}

	public UUID getPersonID() {
		return PersonID;
	}
	private void setPersonID(UUID personID) {
		PersonID = personID;
	}

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String fName) {
        firstName = fName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lName) {
        lastName = lName;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street1) {
        street = street1;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postCode) {
        postalCode = postCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city1) {
        city = city1;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date bday) {
        birthday = bday;
    }


	/*public PersonDomainModel(UUID personID) {
		super();
		PersonID = personID;		
	}

	public UUID getPersonID() {
		return PersonID;
	}
	private void setPersonID(UUID personID) {
		PersonID = personID;
	}

    public String getFirstName() {
        return firstName.get();
    }

    public void setFirstName(String firstName) {
        this.firstName.set(firstName);
    }

    public StringProperty firstNameProperty() {
        return firstName;
    }

    public String getLastName() {
        return lastName.get();
    }

    public void setLastName(String lastName) {
        this.lastName.set(lastName);
    }

    public StringProperty lastNameProperty() {
        return lastName;
    }

    public String getStreet() {
        return street.get();
    }

    public void setStreet(String street) {
        this.street.set(street);
    }

    public StringProperty streetProperty() {
        return street;
    }

    public int getPostalCode() {
        return postalCode.get();
    }

    public void setPostalCode(int postalCode) {
        this.postalCode.set(postalCode);
    }

    public IntegerProperty postalCodeProperty() {
        return postalCode;
    }

    public String getCity() {
        return city.get();
    }

    public void setCity(String city) {
        this.city.set(city);
    }

    public StringProperty cityProperty() {
        return city;
    }

    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    public LocalDate getBirthday() {
        return birthday.get();
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday.set(birthday);
    }

    public ObjectProperty<LocalDate> birthdayProperty() {
        return birthday;
    }*/
}