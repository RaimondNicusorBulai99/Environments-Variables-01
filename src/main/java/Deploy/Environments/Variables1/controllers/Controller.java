package Deploy.Environments.Variables1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    private Environment environment;

    @GetMapping("/getEnvVariable")
    public String greetings() {
        String authCode = environment.getProperty("myCustomProps.authCode");
        String devName = environment.getProperty("myCustomProps.devName");
        return String.format("Hello user your AuthCode is : %s and your name is : %s", authCode, devName);
    }
}
