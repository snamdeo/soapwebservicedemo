// Global.java
import org.springframework.context.support.ClassPathXmlApplicationContext;

import play.Application;
import play.GlobalSettings;
import play.*;

public class Global extends GlobalSettings {

  public ClassPathXmlApplicationContext ctx;

  @Override
  public void onStart(Application app) {
	Logger.info("Application has started");
	ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	ctx.start();
    Logger.info("after context start method");
  }

  @Override
  public void onStop(Application app) {
	  Logger.info("On stop method");
	  ctx.stop();
  }
}
