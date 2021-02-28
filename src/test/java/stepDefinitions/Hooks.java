package stepDefinitions;


import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @Before("@mobile")
    public void beforeValidation(){
        System.out.println("Before each mobile test");
    }
    @After("@mobile")
    public void afterValidation(){
        System.out.println("After each mobile test");
    }
}
