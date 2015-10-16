package controllers;

import play.mvc.Controller;
import play.mvc.Result;

public class Application extends Controller {

    public static Result index() {

	String body="<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\">"+
   	"<soapenv:Header/>"+
   	"<soapenv:Body>"+
      	"<sayByeRequest>satish</sayByeRequest>"+
   	"</soapenv:Body>"+
	"</soapenv:Envelope>";
	/*XmlMapper xmlMapper = new XmlMapper();
    	List entries = xmlMapper.readValue(body, List.class);
    	ObjectMapper jsonMapper = new ObjectMapper();
    	String json = jsonMapper.writeValueAsString(entries);
    	System.out.println(json);*/
        return ok("Test soap web service \n\n\n"+body);
    }

}
