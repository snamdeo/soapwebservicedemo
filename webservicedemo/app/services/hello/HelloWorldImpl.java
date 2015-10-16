// HelloWorldImpl.java
package services.hello;

import java.util.ArrayList;
import java.util.List;

import play.Logger;
import services.request.PersonList;
//import services.request.PersonList;
import services.request.PersonRequest;
import services.response.PersonResponse;

public class HelloWorldImpl implements HelloWorld {
	
	
	// sayHi method takes four default request parameter of type string and return greeting message
    @Override
    public String sayHi(String text,String text2,String text3,String text4) {
    	Logger.info("In sayHiTest method  : text - "+text+" ,text2 - "+text2+" text3 - "+text3+" ,text4 - "+text4);
    	String msg=text+" "+text2+" ,"+text3+" ,"+text4;
        return "Hello "+msg;
    }
    
    
    
    //sayHiAgain method takes four user defined parameters of type string and return greeting message 
    @Override
    public String sayHiAgain(String text,String text2,String text3,String text4) {
    	Logger.info("In sayHiAgain method  : text - "+text+" ,text2 - "+text2+" text3 - "+text3+" ,text4 - "+text4);
    	String res="Hello " + text+" "+text2+" ,"+text3+" ,"+text4;
        return res;
    }

    
	//addPersonsList method takes list of person object as input and returns message of operation completion. 
	@Override
	public String addPersonsList(PersonList personList) {
		Logger.info("In personList method  : "+personList.getPersonList().size());
		for (PersonRequest pr : personList.getPersonList()) {
			Logger.info("Person name : "+pr.getName());
			Logger.info("Person surname : "+pr.getSurname());
			Logger.info("Person location : "+pr.getLocation()+"\n\n");
		}
		return "person list added";
	}
	
	//getPersonsList method takes list of person object and returns list of person object.
	@Override
	public PersonList getPersonsList(PersonList personList) {
		Logger.info("In personsListDisplay method  : "+personList.getPersonList().size());
		List<PersonRequest> pl=personList.getPersonList();
    	PersonRequest pr1=new PersonRequest();
    	pr1.setName("Sakhshi");
    	pr1.setSurname("Jain");
    	pr1.setLocation("Servicesource");
    	pl.add(pr1);
		for (PersonRequest pr : personList.getPersonList()) {
			Logger.info("Person name : "+pr.getName());
			Logger.info("Person surname : "+pr.getSurname());
			Logger.info("Person location : "+pr.getLocation()+"\n\n");
		}
		return personList;
	}
	
	
	// addPerson method takes person object as input and returns operation completion message.
	@Override
	public String addPerson(PersonRequest person) {
		Logger.info("In getPerson method  : "+person.getName());
		PersonResponse personResponse=new PersonResponse();
		personResponse.setName(person.getName());
		personResponse.setSurname(person.getSurname());
		personResponse.setLocation(person.getLocation());
		return "person added";
	}

}
