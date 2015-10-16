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
	
	// provided value wrapped within default parameter names as input i.e. arg0,arg1,...etc.
    String sayHi(String text,String text2,String text3,String text4);
    
    
    @WebMethod
	@WebResult(name="result")// provided value wrapped within userdefined parameter names specified below i.e. name,surname,location,education.
    String sayHiAgain(@WebParam(name="name")String text,@WebParam(name="surname")String text2,
    				  @WebParam(name="location")String text3,@WebParam(name="education")String text4);
	
	
	@WebMethod
	@WebResult(name="result")// provided list of request object value wrapped within user defined names as input i.e.<PersonList><Person></Person></PersonList>
	String addPersonsList(@WebParam(name="PersonList")PersonList personList);
	
	@WebMethod
	@WebResult(name="PersonList")// provided list of request and response object value wrapped within user defined names as input i.e. <PersonList><Person></Person></PersonList>.
	PersonList getPersonsList(@WebParam(name="PersonList")PersonList personList);
	
	// provided request object value wrapped within default name as first input parameter i.e. <arg0><Person>...</Person></arg0>.
	String addPerson(PersonRequest person);
	
    
}
