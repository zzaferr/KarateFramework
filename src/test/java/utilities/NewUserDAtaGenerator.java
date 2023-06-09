package utilities;

import com.github.javafaker.Faker;

import java.util.HashMap;
import java.util.Map;

public class NewUserDAtaGenerator {


public static Map<String, Object> userDataGenerator(){

    Faker faker=new Faker();

    String name=faker.name().username();
    String email=name + "@test.com";
    String password = "Test123456!";
    String about = "what do you think?";
    String terms = "777";

    Map<String, Object> newUser = new HashMap<>();

    newUser.put("name", name);
    newUser.put("email", email);
    newUser.put("password", password);
    newUser.put("about", about);
    newUser.put("terms", terms);

    return newUser;

}

}
