package services.hello;

import javax.jws.WebParam;
import javax.jws.WebService;

import play.Logger;
@WebService(endpointInterface = "services.hello.MyService")
public class MyServiceImpl implements MyService{

	@Override
	public String myservice(@WebParam(name="name")String name) {
		Logger.info("In myservice method  : name"+name);
		return "Hi "+name;
	}

}
