/**
 * 
 */
package services.request;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlAccessType;
/**
 * @author satish.namdeo
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType (name = "Person", propOrder = {"name","surname", "location"})
@XmlRootElement(name = "Person")
public class PersonRequest {
	@XmlElement(name = "name",required = true)
	String name;
	@XmlElement(name = "surname",required = true)
	String surname;
	@XmlElement(name = "location",required = true)
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
