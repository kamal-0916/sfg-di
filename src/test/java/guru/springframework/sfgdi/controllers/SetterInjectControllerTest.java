package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is to validate to constructor based injection.
 * Not Most Preferred
 */
class SetterInjectControllerTest {

  SetterInjectController setterInjectController;

  @BeforeEach
  void setUp() {
    setterInjectController = new SetterInjectController();
    setterInjectController.setGreetingService(new GreetingServiceImpl());
  }

  @Test
  void getGreeting() {
    System.out.println(setterInjectController.getGreeting());
  }
}