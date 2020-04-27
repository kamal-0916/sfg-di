package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * This is to validate to constructor based injection.
 * Most Preferred
 */
class ConstructorInjectedControllerTest {

  ConstructorInjectedController constructorInjectedController;

  @BeforeEach
  void setUp() {
    constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
  }

  @Test
  void getGreeting() {
    System.out.println(constructorInjectedController.getGreeting());
  }
}