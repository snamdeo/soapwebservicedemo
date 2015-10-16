import static org.fest.assertions.Assertions.assertThat;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import play.mvc.Result;
import services.hello.HelloWorldImpl;
import services.request.PersonList;
import services.request.PersonRequest;
import services.response.PersonResponse;


/**
*
* Simple (JUnit) tests that can call all parts of a play app.
* If you are interested in mocking a whole application, see the wiki for more details.
*
*/
public class HelloWorldImplTest {
	/*Request  :: <soapenv:Envelope
				xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
				xmlns:test="http://hello.services/">
				<soapenv:Header/>
				<soapenv:Body><test:sayHi>
						<arg0>satish</arg0><arg1>namdeo</arg1>
			            <arg2>impetus</arg2><arg3>indore</arg3>
				</test:sayHi></soapenv:Body></soap:Envelope>*/
	
	/*response :: <soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
					<soap:Body>
					<ns2:sayHiResponse xmlns:ns2="http://hello.services/">
					<return>Hello satish namdeo ,impetus ,indore</return>
					</ns2:sayHiResponse>
					</soap:Body></soap:Envelope>*/
    @Test
    public void sayHiTest() {
    	HelloWorldImpl hello=new HelloWorldImpl();
    	String arg0="satish";
		String arg1="namdeo";
		String arg2="impetus";
		String arg3="indore";
    	String actualResult=hello.sayHi(arg0,arg1, arg2, arg3);
    	//check for result is not empty.
    	assertNotNull("Result is not null",actualResult);
    	String expectedResult="Hello "+arg0+" "+arg1+" ,"+arg2+" ,"+arg3;
    	//check for equality
    	assertThat(actualResult).isEqualTo(expectedResult);
    	//System.out.println("sayHiTest result : "+result);
    }
    
   /* @Test
    public void sayHiFailure() {
    		HelloWorldImpl hello=new HelloWorldImpl();
    		String arg0="satish";
    		String arg1="namdeo";
    		String arg2="impetus";
    		String arg3="indore";
	    	String actualResult=hello.sayHi(arg0,arg1, arg2, arg3);
	    	//check for result is not empty.
	    	assertNotNull("Result is not null",actualResult);
	    	String expectedResult="Hi "+arg0+" "+arg1+" ,"+arg2+" ,"+arg3;
	    	//check for equality
	    	assertEquals("Expected result is not match with actual result ",actualResult,expectedResult);
    }*/
    
    /*sayHiAgainTest request::
     <soapenv:Envelope
		xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
		xmlns:hel="http://hello.services/">
		<soapenv:Header/>
		<soapenv:Body>
			<hel:sayHiAgain>
					   <name>satish</name>
		               <surname>namdeo</surname>
		               <location>impetus</location>
		               <education>indore</education>
			</hel:sayHiAgain>
		</soapenv:Body>
		</soapenv:Envelope>
     */
    
    /*sayHiAgainTest response::
     * <soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
     * <soap:Body><ns2:sayHiAgainResponse xmlns:ns2="http://hello.services/">
     * <result>Hello satish namdeo ,impetus ,indore</result>
     * </ns2:sayHiAgainResponse></soap:Body></soap:Envelope>
     */
    @Test
    public void sayHiAgainTest() {
    	HelloWorldImpl hello=new HelloWorldImpl();
    	String actualResult=hello.sayHiAgain("satish", "namdeo", "impetus", "indore");
    	//check for result is not empty.
    	assertNotNull("Result is not null",actualResult);
    	String expectedResult="Hello satish namdeo ,impetus ,indore";
    	//check for equality
    	assertThat(actualResult).isEqualTo(expectedResult);
    	//System.out.println("sayHiAgainTest result : "+result);
    }
    
    /*@Test
    public void sayHiAgainFailureTest() {
    	HelloWorldImpl hello=new HelloWorldImpl();
    	String actualResult=hello.sayHiAgain("satish", "namdeo", "impetus", "indore");
    	//check for result is not empty.
    	assertNotNull("Result is not null",actualResult);
    	String expectedResult="Helo satish namdeo ,impetus ,indore";
    	//check for equality
    	assertEquals("Expected result is not match with actual result ",actualResult,expectedResult);
    	//System.out.println("sayHiAgainTest result : "+result);
    }*/
    
    
    /*personsListTest request ::
     <soapenv:Envelope
		xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
		xmlns:test="http://hello.services/">
		<soapenv:Header/><soapenv:Body>
			<test:personsList>
				<PersonList>
					<Person><name>Satish</name><surname>Namdeo</surname><location>Impetus</location></Person>
					<Person><name>Alok</name><surname>Jain</surname><location>Impetus</location></Person>
				</PersonList>
			</test:personsList>
		</soapenv:Body></soapenv:Envelope>
     */
    
    //personsListTest response:: 
    /* <soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
     * <soap:Body><ns2:personsListResponse xmlns:ns2="http://hello.services/">
     * <result>person list added</result>
     * </ns2:personsListResponse></soap:Body></soap:Envelope>
     * 
     * */
    
    @Test
    public void personsListTest() {
    	HelloWorldImpl hello=new HelloWorldImpl();
    	PersonList personInputList=new PersonList();
    	List<PersonRequest> pl=new ArrayList<PersonRequest>();
    	PersonRequest pr1=new PersonRequest();
    	pr1.setName("Satish");
    	pr1.setSurname("Namdeo");
    	pr1.setLocation("Impetus");
    	PersonRequest pr2=new PersonRequest();
    	pr2.setName("Alok");
    	pr2.setSurname("Jain");
    	pr2.setLocation("Impetus");
    	pl.add(pr1);
    	pl.add(pr2);
    	personInputList.setPersonList(pl);
    	String actualResult=hello.addPersonsList(personInputList);
    	//check for result is not empty.
    	assertNotNull("Result is not null",actualResult);
    	String expectedResult="person list added";
    	//check for result equality
    	assertThat(actualResult).isEqualTo(expectedResult);
    	//System.out.println("personsListTest result : "+result);
    }
    
    // addPersonTest request: 
    /*<soapenv:Envelope
    xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
    xmlns:hel="http://hello.services/">
    <soapenv:Header/><soapenv:Body>
    	<hel:addPerson>
			    <arg0><name>satish</name><surname>namdeo</surname><location>impetus</loation></arg0>
    	</hel:addPerson>
    </soapenv:Body></soapenv:Envelope>*/
    
    //addPersonTest response::
    /*<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
     * <soap:Body>
     * <ns2:addPersonResponse xmlns:ns2="http://hello.services/">
     * <return>person added</return></ns2:addPersonResponse>
     * </soap:Body></soap:Envelope>
     * */
    @Test
    public void addPersonTest() {
    	HelloWorldImpl hello=new HelloWorldImpl();
    	PersonRequest pr1=new PersonRequest();
    	pr1.setName("satish");
    	pr1.setSurname("namdeo");
    	pr1.setLocation("imppetus");
    	String actualResult=hello.addPerson(pr1);
    	//check for result is not empty.
    	assertNotNull("Result is not null",actualResult);
    	String expectedResult="person added";
    	//check for equality
    	assertThat(actualResult).isEqualTo(expectedResult);
    	//System.out.println("addPersonTest result : "+result);
    }
    
    // getPersonsListTest Input request:
    /*<soapenv:Envelope
			xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
			xmlns:test="http://hello.services/"><soapenv:Header/>
			<soapenv:Body>
				<test:getPersonsList>
					<PersonList>
						<Person><name>Satish</name><surname>Namdeo</surname><location>Servicesource</location></Person>
						<Person><name>Rahul</name><surname>Jain</surname><location>Bigdata</location></Person>
					</PersonList>
				</test:getPersonsList>
			</soapenv:Body></soapenv:Envelope>
	*/
    
    //getPersonsListTest  Output response::
    /* <soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
     * <soap:Body><ns2:getPersonsListResponse xmlns:ns2="http://hello.services/">
	     * <PersonList>
		     * <Person><name>Satish</name><surname>Namdeo</surname><location>Indore</location></Person>
		     * <Person><name>Rahul</name><surname>Jain</surname><location>Bhopal</location></Person>
		     * <Person><name>Sakhshi</name><surname>Jain</surname><location>Servicesource</location></Person>
	     * </PersonList>
     * </ns2:getPersonsListResponse></soap:Body></soap:Envelope>
     * */
    @Test
    public void getPersonsListTest() {
    	HelloWorldImpl hello=new HelloWorldImpl();
    	PersonList personInputList=new PersonList();
    	List<PersonRequest> pl=new ArrayList<PersonRequest>();
    	PersonRequest pr1=new PersonRequest();
    	pr1.setName("Satish");
    	pr1.setSurname("Namdeo");
    	pr1.setLocation("Servicesource");
    	PersonRequest pr2=new PersonRequest();
    	pr2.setName("Rahul");
    	pr2.setSurname("Jain");
    	pr2.setLocation("Bigdata");
    	pl.add(pr1);
    	pl.add(pr2);
    	personInputList.setPersonList(pl);
    	PersonList actualResult=hello.getPersonsList(personInputList);
    	//check for result is not empty.
    	assertNotNull("Result is not null",actualResult);
    	
    	PersonRequest pr3=new PersonRequest();
    	pr1.setName("Sakhshi");
    	pr1.setSurname("Jain");
    	pr1.setLocation("Servicesource");
    	pl.add(pr3);
    	
    	//check for equality
    	PersonRequest[] actualResultArray = actualResult.getPersonList().toArray(new PersonRequest[actualResult.getPersonList().size()]);
    	PersonRequest[] expectedArray = pl.toArray(new PersonRequest[pl.size()]);
    	assertArrayEquals("list elements are not equal",expectedArray, actualResultArray);
    	//System.out.println("personsListDisplayTest result : "+result.getPersonList().size());
    }


}
