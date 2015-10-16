package services.hello;

import javax.jws.WebService;

@WebService
public interface MyService {
	
	String myservice(String name);
	
}
