package services.request;


import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
//import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType 
@XmlRootElement(name = "PersonList")
public class PersonList {
	
	@XmlElement(name = "Person", type = PersonRequest.class)
    private List<PersonRequest> personList = new ArrayList<PersonRequest>();
	
	public PersonList() {}

	public List<PersonRequest> getPersonList() {
		return personList;
	}

	public void setPersonList(List<PersonRequest> personList) {
		this.personList = personList;
	}

	
	
}
