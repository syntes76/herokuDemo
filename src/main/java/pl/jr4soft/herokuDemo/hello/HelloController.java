package pl.jr4soft.herokuDemo.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author "Robert Milkowski"
 */

@Controller
class HelloController {

    @GetMapping(value = "/")
    String hello(){
        return "main";
    }
}
