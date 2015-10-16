// HelloWorldImpl.java
package services.hello;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebParam.Mode;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

import play.Logger;
import services.request.PersonList;
//import services.request.PersonList;
import services.request.PersonRequest;
import services.response.PersonResponse;

public class HelloWorldImpl implements HelloWorld {

    @Override
    public String sayHiTest(String text,String text2,String text3,String text4) {
    	Logger.info("In sayHiTest method  : text - "+text+" ,text2 - "+text2+" text3 - "+text3+" ,text4 - "+text4);
        return "Hello " + text+" "+text2+" ,"+text3+" ,"+text4;
    }
    
    @Override
    public String sayHiAgain(String text,String text2,String text3,String text4) {
    	Logger.info("In sayHiAgain method  : text - "+text+" ,text2 - "+text2+" text3 - "+text3+" ,text4 - "+text4);
        return "Hello " + text+" "+text2+" ,"+text3+" ,"+text4;
    }

	@Override
	public PersonResponse getPerson(PersonRequest personRequest) {
		Logger.info("In getPerson method  : "+personRequest.getName());
		PersonResponse personResponse=new PersonResponse();
		personResponse.setName(personRequest.getName());
		personResponse.setSurname(personRequest.getSurname());
		personResponse.setLocation(personRequest.getLocation());
		return personResponse;
	}
	
	@Override
	public String personsList(PersonList personList) {
		Logger.info("In personList method  : "+personList.getPersonList().size());
		/*PersonResponse personResponse=new PersonResponse();
		personResponse.setName(person.getName());
		personResponse.setSurname(person.getSurname());
		personResponse.setLocation(person.getLocation());*/
		return "person list added";
	}
	
	@Override
	public String addPerson(PersonRequest person) {
		Logger.info("In getPerson method  : "+person.getName());
		PersonResponse personResponse=new PersonResponse();
		personResponse.setName(person.getName());
		personResponse.setSurname(person.getSurname());
		personResponse.setLocation(person.getLocation());
		return "Person added";
	}

	@Override
	public PersonResponse retrivePerson(String name) {
		// TODO Auto-generated method stub
		return null;
	}
    
	
}
