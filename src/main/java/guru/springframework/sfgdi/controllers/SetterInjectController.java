package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * This is to validate to constructor based injection.
 * Not Most Preferred
 */
@Controller
public class SetterInjectController {

  private GreetingService greetingService;

  @Autowired
  public void setGreetingService(GreetingService greetingService) {
    this.greetingService = greetingService;
  }

  public String getGreeting(){
    return greetingService.sayGreeting();
  }
}
