// HelloWorld.java
package services.hello;


import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;




import services.request.PersonList;
//import services.request.PersonList;
import services.request.PersonRequest;
import services.response.PersonResponse;

@WebService
public interface HelloWorld {
	
    String sayHiTest(String text,String text2,String text3,String text4);
    
    String sayHiAgain(String text,String text2,String text3,String text4);
	@WebMethod
	@WebResult(name="Person")
	PersonResponse getPerson(@WebParam(name="Person")PersonRequest person);
	
	@WebMethod
	@WebResult(name="result")
	String personsList(@WebParam(name="PersonList")PersonList personList);
	
	String addPerson(PersonRequest person);
	
	PersonResponse retrivePerson(String name);
	
    
}
