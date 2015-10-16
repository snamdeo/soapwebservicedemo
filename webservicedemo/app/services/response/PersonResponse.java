/**
 * 
 */
package services.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * @author satish.namdeo
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType (name = "PersonResponse", propOrder = {"name","surname", "location"})
@XmlRootElement(name = "PersonResponse")
public class PersonResponse {
	@XmlElement(name = "name")
	String name;
	@XmlElement(name = "surname")
	String surname;
	@XmlElement(name = "location")
	String location;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

}
